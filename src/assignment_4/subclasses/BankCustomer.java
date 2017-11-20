/**
 * @author susanne and erica
 * @version 1.0
 * 
 * This is a subclass to the superclass Human.
 *
 */

package assignment_4.subclasses;

import java.util.ArrayList;

import assignment_4.interfaces.BankOperations;
import assignment_4.superclasses.BankAccount;
import assignment_4.superclasses.Human;

public class BankCustomer extends Human {
	ArrayList<BankAccount> customerAccount = new ArrayList <BankAccount>(); 
	/**
	 * Here is our BankCustomer constructor.
	 * @param name
	 * @param age
	 */
	
	public BankCustomer(String name, int age) { 
		super(name, age);
		
	}
/**
 * This array list is connected to BankAccount
 * @return customerAccount
 */

	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccount;
	}
	/**
	 * Get and set for CustomerAccount.
	 * @param customerAccounts
	 */

	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccount = customerAccounts;
	}
	
	public void addAccount(BankAccount bankAccount) {  
		this.customerAccount.add(bankAccount);
	}
	/**
	 * Here are two for loops that depositToAccount and withdrawFromAccount.
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccount.size(); i++) {
			if (customerAccount.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccount.get(i).depositMoney(amount);
			}
		}
	}
	
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccount.size(); i++) {
			if (customerAccount.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccount.get(i).withdrawMoney(amount);
				}
		}
	}
	/**
	 * In the toString we use getters to get the values.
	 */

	@Override
	public String toString() {
		String s = "";
		for(int i = 0 ; i < customerAccount.size(); i++) {
			s += customerAccount.get(i);
		}
		return "Customer: " + getName() + ", ålder: " + getAge() + s;
	}
	
	
}
