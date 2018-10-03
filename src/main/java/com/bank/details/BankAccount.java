package com.bank.details;


// single line

/* multiline
  commenting
 */

/** this is for java documentation(ll create javadocs)
 * 
 * @author spgoyal
 * @since 03-10-2018
 */

public abstract class BankAccount {
//int studentID .. wrong encapsulation
	//encapsulation is defining of relevant information inside a class
	//abstraction is showing relevatn info
	//interface is not replacemnt of multiple inheritance..in interface we have to write methods again but in mi we can use directly
	//making a calss abstract means we wll not create object for that class
	//if u want to override any method in cpp virtual keyword is reqd. in java it is bydefault virtual
	//polymorphism in java is object with many form using method overriding(late binding)
int accountNo;
String accountHolderName;
double accountBalance;
static int autoAccountNoGen;

{
	//this is init block this wll be called first when object is created
	accountNo=++autoAccountNoGen;
	
	
}
//class level initialization is done for constant only except all done with constructor
public BankAccount(){
//account opening without documents(use of default constructor) con. is creating varieties 
	accountHolderName="unknown";
	accountBalance=0;
	
}
public BankAccount(String accountHolderName, double accountBalance) {
	super();
	this.accountHolderName = accountHolderName;
	this.accountBalance = accountBalance;
}
//method is to define behavior of an object BankAccount acc --> behavior
public abstract void withdraw(double amount);

//changing the behavior
public void deposit(double amount) {
	accountBalance+=amount;
	
	
}


//reading the values
public String getAccountHolderName() {
	return accountHolderName;
}
public int getAccountNo() {
	return accountNo;
}
//change the value of already constructed value
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public double getAccountBalance() {
	return accountBalance;
}

@Override
public String toString() {
	return " [ accountBalance = "
    			+ accountBalance + "]";
}


	
}
