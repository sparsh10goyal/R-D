package com.bank.details;

public class SavingsAccount extends BankAccount {

	@Override
public void withdraw(double amount) {
		System.out.println("Saving account withdraw called");
	}

	public void isSalaryAccount() {
		System.out.println("Salary account called");
		
	}
	
}
