package com.progressoft.induction.atm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.progressoft.induction.atm.exceptions.InsufficientFundsException;
import com.progressoft.induction.atm.exceptions.NotEnoughMoneyInATMException;

/**
 * @author 125028
 *
 */
public class ATMImp implements ATM {

	/**
	 * 
	 */
	private Map<Banknote, BigDecimal> numberOfBanknoteInATM = new HashMap<Banknote, BigDecimal>();

	/**
	 * 
	 */
	BigDecimal totalBanknoteInATM = new BigDecimal(2400);
	BankingSystem bankingSystem = new BankingSystemImp();

	{
		numberOfBanknoteInATM.put(Banknote.FIVE_JOD, new BigDecimal(100));
		numberOfBanknoteInATM.put(Banknote.TEN_JOD, new BigDecimal(100));
		numberOfBanknoteInATM.put(Banknote.TWENTY_JOD, new BigDecimal(20));
		numberOfBanknoteInATM.put(Banknote.FIFTY_JOD, new BigDecimal(10));
	}

	/**
	 *
	 */
	@Override
	public List<Banknote> withdraw(String accountNumber, BigDecimal amount) {
		BigDecimal balance = bankingSystem.getAccountBalance(accountNumber);
		if (balance.compareTo(amount) < 0) {
			throw new InsufficientFundsException();
		}
		if (amount.compareTo(totalBanknoteInATM) > 0) {
			throw new NotEnoughMoneyInATMException();
		}
		bankingSystem.debitAccount(accountNumber, amount);
		totalBanknoteInATM = totalBanknoteInATM.subtract(amount);
		return getBanknotes(amount);
	}

	/**
	 * @param amount
	 * @return
	 */
	public List<Banknote> getBanknotes(BigDecimal amount) {
		List<Banknote> banknotes = new ArrayList<Banknote>();
		for (int counter = Banknote.values().length - 1; counter >= 0; counter--) {
			if (amount.compareTo(new BigDecimal(0)) <= 0)
				break;
			BigDecimal numberOfCurrecy = new BigDecimal(
					calculateNumberOfBanknotesCurrency(Banknote.values()[counter], amount).toString());
			amount = amount.subtract(numberOfCurrecy.multiply(Banknote.values()[counter].getValue()));
			banknotes.addAll(getBanknotesForCurrency(Banknote.values()[counter], numberOfCurrecy));
		}
		return banknotes;
	}

	/**
	 * @param currency
	 * @param amount
	 * @return
	 */
	public List<Banknote> getBanknotesForCurrency(Banknote currency, BigDecimal amount) {
		List<Banknote> banknotesForCurrency = new ArrayList<Banknote>();
		for (BigDecimal counter = new BigDecimal(0); counter.compareTo(amount) < 0; counter = counter
				.add(new BigDecimal(1))) {
			banknotesForCurrency.add(currency);
		}
		return banknotesForCurrency;
	}

	/**
	 * @param currency
	 * @param amount
	 * @return
	 */
	public BigDecimal calculateNumberOfBanknotesCurrency(Banknote currency, BigDecimal amount) {
		BigDecimal numberBanknotes = new BigDecimal(0);
		numberBanknotes = numberBanknotes.add(amount.divideToIntegralValue(currency.getValue()));
		numberBanknotes = numberBanknotes.min(numberOfBanknoteInATM.get(currency));
		return numberBanknotes;
	}

}

 /**
 * @param amount
 * @return
 */
//	public List<Banknote> getBanknotes(BigDecimal amount) {
//
//		BigDecimal numberOfBanknoteFiftyJOD = new BigDecimal(0);
//		BigDecimal numberOfBanknoteTwentyJOD = new BigDecimal(0);
//		BigDecimal numberOfBanknoteTenJOD = new BigDecimal(0);
//		BigDecimal numberOfBanknoteFiveJOD = new BigDecimal(0);
//
//		numberOfBanknoteFiftyJOD = numberOfBanknoteFiftyJOD.add(amount.divideToIntegralValue(new BigDecimal(50)));
//		numberOfBanknoteFiftyJOD = numberOfBanknoteFiftyJOD.min(numberOfBanknote.get(Banknote.FIFTY_JOD));
//		amount = amount.subtract(numberOfBanknoteFiftyJOD.multiply(new BigDecimal(50)));
//		numberOfBanknote.put(Banknote.FIFTY_JOD,
//				numberOfBanknote.get(Banknote.FIFTY_JOD).subtract(numberOfBanknoteFiftyJOD));
//
//		numberOfBanknoteTwentyJOD = numberOfBanknoteTwentyJOD.add(amount.divideToIntegralValue(new BigDecimal(20)));
//		numberOfBanknoteTwentyJOD = numberOfBanknoteTwentyJOD.min(numberOfBanknote.get(Banknote.TWENTY_JOD));
//		amount = amount.subtract(numberOfBanknoteTwentyJOD.multiply(new BigDecimal(20)));
//		numberOfBanknote.put(Banknote.TWENTY_JOD,
//				numberOfBanknote.get(Banknote.TWENTY_JOD).subtract(numberOfBanknoteTwentyJOD));
//
//		numberOfBanknoteTenJOD = numberOfBanknoteTenJOD.add(amount.divideToIntegralValue(new BigDecimal(10)));
//		numberOfBanknoteTenJOD = numberOfBanknoteTenJOD.min(numberOfBanknote.get(Banknote.TEN_JOD));
//		amount = amount.subtract(numberOfBanknoteTenJOD.multiply(new BigDecimal(10)));
//		numberOfBanknote.put(Banknote.TEN_JOD, numberOfBanknote.get(Banknote.TEN_JOD).subtract(numberOfBanknoteTenJOD));
//
//		numberOfBanknoteFiveJOD = numberOfBanknoteFiveJOD.add(amount.divideToIntegralValue(new BigDecimal(5)));
//		numberOfBanknoteFiveJOD = numberOfBanknoteFiveJOD.min(numberOfBanknote.get(Banknote.FIVE_JOD));
//		amount = amount.subtract(numberOfBanknoteFiveJOD.multiply(new BigDecimal(5)));
//		numberOfBanknote.put(Banknote.FIVE_JOD,
//				numberOfBanknote.get(Banknote.FIVE_JOD).subtract(numberOfBanknoteFiveJOD));
//
//		List<Banknote> banknote = new ArrayList<Banknote>();
//
//		for (BigDecimal counter = new BigDecimal(0); counter.compareTo(numberOfBanknoteFiftyJOD) != 0; counter = counter
//				.add(new BigDecimal(1))) {
//			banknote.add(Banknote.FIFTY_JOD);
//		}
//
//		for (BigDecimal counter = new BigDecimal(0); counter
//				.compareTo(numberOfBanknoteTwentyJOD) != 0; counter = counter.add(new BigDecimal(1))) {
//			banknote.add(Banknote.TWENTY_JOD);
//		}
//
//		for (BigDecimal counter = new BigDecimal(0); counter.compareTo(numberOfBanknoteTenJOD) != 0; counter = counter
//				.add(new BigDecimal(1))) {
//			banknote.add(Banknote.TEN_JOD);
//		}
//
//		for (BigDecimal counter = new BigDecimal(0); counter.compareTo(numberOfBanknoteFiveJOD) != 0; counter = counter
//				.add(new BigDecimal(1))) {
//			banknote.add(Banknote.FIVE_JOD);
//		}
//
//		return banknote;
//	}
