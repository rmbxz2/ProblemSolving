package com.assignment.tp;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Describe class here.
*
*
*
*
*
*/
public class XmlTransactionProcessor implements TransactionProcessor {
	private List<Transaction> transactionsList;
	private List<Violation> violationList;
	private ArrayList<String> importedString;

	/**
	* 
	*
	*/
	public void importTransactions(InputStream is) {
		importedString = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
		try {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				if (!(line.equals("<TransactionList>") || (line.equals("</TransactionList>"))))
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
		String regex= "(?:type=\\\")([CD])(?:\\\")\\s+(?:amount=\\\")([0-9. ]+)(?:\\\")\\s+(?:narration=\\\")([a-zA-Z ]+)(?:\\\")";
		Pattern pattern = Pattern.compile(regex);
		for (String element : importedString) {
			Matcher matcher = pattern.matcher(element);
			if (matcher.find()) {
				String type = matcher.group(1);
				BigDecimal amount = new BigDecimal(matcher.group(2));
				String narration = matcher.group(3);
				Transaction transaction = new Transaction(type, amount, narration);
				transactionsList.add(transaction);
			}
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
	    XmlTransactionProcessor csv = new XmlTransactionProcessor();  
		InputStream is = csv.asStream(
				"<TransactionList>\n" + "    <Transaction type=\"C\" amount=\"1000\" narration=\"salary\" />\n"
						+ "    <Transaction type=\"D\" amount=\"200\" narration=\"rent\" />\n"
						+ "    <Transaction type=\"D\" amount=\"800\" narration=\"other\" />\n" + "</TransactionList>");
		
		csv.importTransactions(is);
		csv.getImportedTransactions();
		System.out.println("is balanced= "+ csv.isBalanced());
		for (Transaction transaction : csv.transactionsList) {
		       System.out.println("" + transaction.getType());
			System.out.println("" + transaction.getAmount());
			System.out.println("" + transaction.getNarration());
			System.out.println("============================");

		}


		/*

		InputStream is = csv.asStream("<TransactionList>\n"
				+ "    <Transaction type=\"C\" amount=\"1000.50\" narration=\"salary\" />\n"
				+ "    <Transaction type=\"D\" amount=\"200\" narration=\"rent\" />\n"
					      + "    <Transaction type=\"D\" amount=\"800.50\" narration=\"other\" />\n" + "</TransactionList>");
		


		InputStream is = csv.asStream(
				"<TransactionList>\n" + "    <Transaction type=\"C\" amount=\"1000\" narration=\"salary\" />\n"
						+ "    <Transaction type=\"D\" amount=\"400\" narration=\"rent\" />\n"
						+ "    <Transaction type=\"D\" amount=\"750\" narration=\"other\" />\n" + "</TransactionList>");


		InputStream is = csv.asStream(
				"<TransactionList>\n" + "    <Transaction type=\"C\" amount=\"1000\" narration=\"salary\" />\n"
						+ "    <Transaction type=\"X\" amount=\"400\" narration=\"rent\" />\n"
						+ "    <Transaction type=\"D\" amount=\"750\" narration=\"other\" />\n" + "</TransactionList>");
		


		InputStream is = csv.asStream(
				"<TransactionList>\n" + "    <Transaction type=\"C\" amount=\"one thousand\" narration=\"salary\" />\n"
						+ "    <Transaction type=\"X\" amount=\"400\" narration=\"rent\" />\n"
						+ "    <Transaction type=\"D\" amount=\"750\" narration=\"other\" />\n" + "</TransactionList>");
		

		csv.importTransactions(is);
		for (String element : csv.importedString) {
			System.out.println("" + element);
			System.out.println("==========x==================");
		}
		System.out.println("==========getImportedTransactions==================");
		csv.getImportedTransactions();
		for (Transaction transaction : csv.transactionsList) {
			System.out.println("hi");
		    System.out.println("t" + transaction.getType());
			System.out.println("a" + transaction.getAmount());
			System.out.println("g" + transaction.getNarration());
			System.out.println("============================");
		}

		////////////////////////////////////////

		System.out.println("============validate================");
		for (String element : csv.importedString)
			System.out.println("" + element);

		// csv.validate();
		// for (Violation violation : csv.violationList) {
		// 	System.out.println("" + violation.getOrder());
		// 	System.out.println("" + violation.getProperty());
		// 	System.out.println("============================");
		// }

				System.out.println("======================= isBalanced()=====================");
				System.out.println("is balanced " + csv.isBalanced());
    */
	}

	/**
	* 
	*
	*/
	private InputStream asStream(String s) {
		return new ByteArrayInputStream(s.getBytes());
	}
}
