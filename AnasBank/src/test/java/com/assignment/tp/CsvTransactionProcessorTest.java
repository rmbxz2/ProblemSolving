package com.assignment.tp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class CsvTransactionProcessorTest {

    private TransactionProcessor csvTransactionProcessor;

    @Before
    public void setUp() {
        csvTransactionProcessor = new CsvTransactionProcessor();// replace the null with your CSV implementation class
    }

    @Test
    public void givenValidCsvStream_WhenImport_ThenReturnTheExpectedTransactions() {
        InputStream is = asStream("C,1000,salary\nD,200,rent\nD,800,other");
        csvTransactionProcessor.importTransactions(is);
        List<Transaction> transactions = csvTransactionProcessor.getImportedTransactions();

        assertThat(transactions, containsInAnyOrder(
                newTransaction("D", new BigDecimal(200), "rent"),
                newTransaction("C", new BigDecimal(1000), "salary"),
                newTransaction("D", new BigDecimal(800), "other")
        ));
    }

    @Test
    public void givenBalancedCsvStream_WhenImportAndCheckIfBalanced_ThenReturnTrue() throws Exception {
        InputStream is = asStream("C,1000.50,salary\nD,200,rent\nD,800.50,other");
        csvTransactionProcessor.importTransactions(is);

        assertEquals(true, csvTransactionProcessor.isBalanced());
    }

    @Test
    public void givenImbalancedCsvStream_WhenImportAndCheckIfBalanced_ThenReturnFalse() throws Exception {
        InputStream is = asStream("C,1000,salary\nD,400,rent\nD,750,other");
        csvTransactionProcessor.importTransactions(is);

        assertEquals(false, csvTransactionProcessor.isBalanced());
    }

    @Test
    public void givenCsvStreamWithAnInvalidTransaction_WhenCallingValidate_ThenReportTheProperViolations() throws Exception {
        InputStream is = asStream("C,1000,salary\nX,400,rent\nD,750,other");
        csvTransactionProcessor.importTransactions(is);
        List<Violation> violations = csvTransactionProcessor.validate();

        assertThat(violations, containsInAnyOrder(new Violation(2,"type")));
    }

    @Test
    public void givenCsvStreamWithMultipleInvalidTransactions_WhenCallingValidate_ThenReportTheProperViolations() throws Exception {
        InputStream is = asStream("C,one thousand,salary\nX,400,rent\nD,750,other");
        csvTransactionProcessor.importTransactions(is);
        List<Violation> violations = csvTransactionProcessor.validate();

        assertThat(violations, containsInAnyOrder(new Violation(2,"type"),new Violation(1,"amount")));
    }

    @Test
    public void givenCsvStreamWithMultipleErrorsInSameTransaction_WhenCallingValidate_ThenReportTheProperViolations() throws Exception {
        InputStream is = asStream("C,one thousand,salary\nX,0,rent\nD,750,other");
        csvTransactionProcessor.importTransactions(is);
        List<Violation> violations = csvTransactionProcessor.validate();

        assertThat(violations, containsInAnyOrder(new Violation(2,"type"),new Violation(2,"amount"),new Violation(1,"amount")));
    }

    @Test
    public void givenValidCsvStream_WhenCallingGetImportedTransctionTwice_ThenReturnTheExpectedTransactions() {
        InputStream is = asStream("C,1000,salary\nD,200,rent\nD,800,other");
        csvTransactionProcessor.importTransactions(is);

        csvTransactionProcessor.getImportedTransactions();
        List<Transaction> transactions = csvTransactionProcessor.getImportedTransactions();

        assertThat(transactions, containsInAnyOrder(
                newTransaction("D", new BigDecimal(200), "rent"),
                newTransaction("C", new BigDecimal(1000), "salary"),
                newTransaction("D", new BigDecimal(800), "other")
        ));
    }

    @Test
    public void givenCsvStreamWithMultipleInvalidTransactions_WhenCallingValidateTwice_ThenReportTheProperViolations() throws Exception {
        InputStream is = asStream("C,one thousand,salary\nX,400,rent\nD,750,other");
        csvTransactionProcessor.importTransactions(is);

        csvTransactionProcessor.validate();
        List<Violation> violations =  csvTransactionProcessor.validate();

        assertThat(violations, containsInAnyOrder(new Violation(2,"type"),new Violation(1,"amount")));
    }

    private Transaction newTransaction(String type, BigDecimal amount, String narration) {
        return new Transaction(type, amount, narration);
    }

    private InputStream asStream(String s) {
        return new ByteArrayInputStream(s.getBytes());
    }
}
