/**
 * @author susanne and erica
 * @version 1.0
 * 
 * This is one of your two super classes. Sub classes are PersonalAccount and SavingsAccount.
 * The Interface class BankOperations is connected to it.
 *
 */

package assignment_4.superclasses;

import java.util.UUID;

import assignment_4.interfaces.BankOperations;

public class BankAccount implements BankOperations {
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;

	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank account";
		this.balance = 0.0;
	}
	
	/**
	 * Here our getters and setters for the attributes accountNumber, accountType and balance.
	 * 
	 * @return accountNumber
	 * @return accountType
	 * @return balance
	 */
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * This toString returns accountType, accountNumber and balance.
	 */
	@Override
	public String toString() {
		return "\nBankAccount [Account Number= " + getAccountNumber() + ",  Balance= " + getBalance()
				+ ",  Account Type= " + getAccountType() + "]";
	}
	/**
	 * Here are tow if else loops for withdrawMoney and depositMoney.
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("You can not withdraw a negative value!");
		}
	}

	public void depositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount);
		} else {
			System.out.println("You can not deposit a negative value!");
		}
	}

}


