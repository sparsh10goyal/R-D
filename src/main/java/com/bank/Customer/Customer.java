package com.bank.Customer;

import com.bank.details.Insurance;
import com.bank.details.SavingsAccount2;

public class Customer {
	
	public static void main(String[] args) {
	Insurance ins=null;
	ins=new SavingsAccount2();
	ins.getInsuranceName("JivanBima");
	
	ins.getPolicyNo(123456);
	ins.getLimit(50000);
	//acc.isSalaryAccount();
	}
	

}
