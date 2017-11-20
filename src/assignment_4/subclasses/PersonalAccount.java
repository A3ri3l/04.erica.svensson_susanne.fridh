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

public class PersonalAccount extends BankAccount {
	
	public PersonalAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setAccountType("Personal Account");
		this.setBalance(0.0);
	}


}