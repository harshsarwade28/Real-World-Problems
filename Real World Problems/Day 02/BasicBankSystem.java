package Day_02;

import java.util.*;

class BankAccount{
	
	int accountNumber;
	String holderName;
	double balance;
	
	BankAccount(int accountNumber, String holderName, double balance){
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	
	public void withdrawl(double amount) {
		System.out.println("For withdrawl");
	}
	
}

class SavingAccount extends BankAccount{

	SavingAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
		
	}
	
	@Override
	public void withdrawl(double amount) {
		
		if(balance - amount >=1000) {
			balance=balance-amount;
			System.out.println("Sucess"+balance);
		}
		else {
			System.out.println("Low Balance!.. Balance must be greater that 1000 "+balance);
		}
	}
	
}

class CurrentAccount extends BankAccount{

	CurrentAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
		
	}
	

	@Override
	public void withdrawl(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Success "+balance);
		}
		else {
			System.out.println("Low Balance");
		}
	}
	
}

public class BasicBankSystem {

	public static void main(String[] args) {
		
		BankAccount b = new SavingAccount(123, "Harsh", 1500);
		BankAccount b1 = new CurrentAccount(456, "Saidnya", 1000);
		
		b.withdrawl(1000);
		b1.withdrawl(1000);
	}
}
