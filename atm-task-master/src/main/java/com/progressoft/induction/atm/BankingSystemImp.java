package com.progressoft.induction.atm;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.progressoft.induction.atm.exceptions.AccountNotFoundException;

/**
 * @author 125028
 *
 */
public class BankingSystemImp implements BankingSystem {

	/**
	 * 
	 */
	private Map<String, BigDecimal> allAccountNumbers = new HashMap<String, BigDecimal>();

	{
		allAccountNumbers.put("123456789", new BigDecimal(1000.0));
		allAccountNumbers.put("111111111", new BigDecimal(1000.0));
		allAccountNumbers.put("222222222", new BigDecimal(1000.0));
		allAccountNumbers.put("333333333", new BigDecimal(1000.0));
		allAccountNumbers.put("444444444", new BigDecimal(1000.0));
	}

	/**
	 *
	 */
	@Override
	public BigDecimal getAccountBalance(String accountNumber) {

		if (!allAccountNumbers.containsKey(accountNumber)) {
			throw new AccountNotFoundException();
		}

		return allAccountNumbers.get(accountNumber);
	}

	/**
	 *
	 */
	@Override
	public void debitAccount(String accountNumber, BigDecimal amount) {
		allAccountNumbers.put(accountNumber, allAccountNumbers.get(accountNumber).subtract(amount));
	}

}
