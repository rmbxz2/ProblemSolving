package com.assignment.tp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
* Describe class here.
*
*
*
*
*
*/
public class CsvTransactionProcessor implements TransactionProcessor {
	private List<Transaction> transactionsList;
	private List<Violation> violationList;
	private ArrayList<String> importedString;


    
	public void importTransactions(InputStream is) {
		importedString = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
		try {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				importedString.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	* 
	*
	*/
	public List<Transaction> getImportedTransactions() {
		transactionsList = new ArrayList<Transaction>();
		for (String element : importedString) {
			String[] transactionParts = element.split(",");
			String type = transactionParts[0];
			BigDecimal amount = new BigDecimal(transactionParts[1]);
			String narration = transactionParts[2];
			Transaction transaction = new Transaction(type, amount, narration);
			transactionsList.add(transaction);
		}
		return transactionsList;
	}

	/**
	* 
	*
	*/
	public List<Violation> validate() {
		violationList = new ArrayList<Violation>();
		int order = 0;
		for (Transaction transaction : transactionsList) {
			order++;
			if (!((transaction.getType()).equals("D") || (transaction.getType()).equals("C"))) {
				violationList.add(new Violation(order, "type"));
			}
			if ((transaction.getAmount().compareTo(BigDecimal.ZERO) <= 0)) {
				violationList.add(new Violation(order, "amount"));
			}
		}
		return violationList;
	}

	/**
	* 
	*
	*/
	public boolean isBalanced() {
		BigDecimal bigDecimal = new BigDecimal(0);
		for (Transaction transaction : transactionsList) {
			if (transaction.getType().equals("C")) {
				bigDecimal = bigDecimal.subtract(transaction.getAmount());
			} else if (transaction.getType().equals("D")) {
				bigDecimal = bigDecimal.add((transaction.getAmount()));
			}
		}
		return (bigDecimal.compareTo(BigDecimal.ZERO) == 0);
	}

	/**
	* 
	*
	*/
	public static void main(String[] args) throws IOException {
		CsvTransactionProcessor csv = new CsvTransactionProcessor();
		InputStream is = csv.asStream("C,1000,salary\nD,200,rent\nD,800,other");
		//InputStream is = csv.asStream("C,1000,salary\nD,400,rent\nD,750,other");
		//InputStream is = csv.asStream("x,1000,salary\nD,0,rent\nD,-11,other");
		//InputStream is = csv.asStream("C,100.50,salary\nD,200,rent\nD,800.50,other");
		//InputStream is = csv.asStream("C,1000,salary\nD,400,rent\nD,750,other");
		//InputStream is = csv.asStream("C,1000,salary\nX,400,rent\nD,750,other");
		// InputStream is = csv.asStream("C,one thousand,salary\nX,400,rent\nD,750,other");
		//InputStream is = csv.asStream("C,1,salary\nX,0,rent\nD,750,other");
		//		InputStream is = csv.asStream("C,1000.50,salary\nD,200,rent\nD,800.50,other");
		csv.importTransactions(is);
		for (String element : csv.importedString) {
			System.out.println("" + element);
			System.out.println("==========x==================");
		}
		System.out.println("==========getImportedTransactions==================");
		csv.getImportedTransactions();

		for (Transaction transaction : csv.transactionsList) {
			System.out.println("" + transaction.getType());
			System.out.println("" + transaction.getAmount());
			System.out.println("" + transaction.getNarration());
			System.out.println("============================");
		}

		////////////////////////////////////////

		System.out.println("============validate================");
		csv.validate();
		for (Violation violation : csv.violationList) {
			System.out.println("" + violation.getOrder());
			System.out.println("" + violation.getProperty());
			System.out.println("============================");
		}

		System.out.println("======================= isBalanced()=====================");
		System.out.println("is balanced " + csv.isBalanced());
	}

	/**
	* 
	*
	*/
	private InputStream asStream(String s) {
		return new ByteArrayInputStream(s.getBytes());
	}
}
