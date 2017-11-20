/**
 * @autor susanne and erica
 * @version 1.0
 * 
 * This is our Main class. 
 * 
 */

package assignment_4.main;

import assignment_4.subclasses.BankCustomer;
import assignment_4.subclasses.PersonalAccount;
import assignment_4.subclasses.SavingsAccount;
import assignment_4.superclasses.BankAccount;

public class Main {
	/**
	 * Here our main method starts. It uses information from our other classes and interface.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		String account = "";
		
		BankCustomer bc = new BankCustomer("Erica", 32);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingsAccount());
		System.out.println(bc.toString());
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("\nDepositing 30.0 to the first account");
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());

		System.out.println("\nWithdrawing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());

		System.out.println("\nDepositing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

		BankAccount bankAccount = new BankAccount();
		System.out.println(bankAccount.toString());
		bankAccount.depositMoney(200.0);

		PersonalAccount pa = new PersonalAccount();
		pa.depositMoney(70);
		System.out.println(pa.toString());
		pa.depositMoney(-1);

		SavingsAccount sa = new SavingsAccount();
		sa.withdrawMoney(-20);
		sa.withdrawMoney(20);
		System.out.println(sa.toString());

	}

}

