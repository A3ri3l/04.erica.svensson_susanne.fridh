/**
 * @author susanne and erica
 * @version 1.0
 * 
 * This is a subclass to the superclass BankAccount.
 * 
 * Here we use a method that generates random accountNumber. 
 * This class is also instantiated as an accountType.
 *
 */

package assignment_4.subclasses;

import java.util.UUID;

import assignment_4.superclasses.BankAccount;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount() {
		setAccountNumber (UUID.randomUUID().toString().substring(0, 6));
		setAccountType("Savings Account");
		setBalance(0.0);
	}


}