package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double initialoverdraftBalance;

	public Current() {
		System.out.println("Default Consturctor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		initialoverdraftBalance = overdraftBalance;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (amount <= getBalance()) {    // amount = 5000  balance = 10000
				setBalance(getBalance() - amount);      
				return true;
			}
			if (amount <= getBalance() + overdraftBalance) {   // amount = 20000  balance = 5000 overdraft = 50000 
 				amount = amount - getBalance();    // amount 20000  balance = 5000
 				
				setBalance(0);
				overdraftBalance = overdraftBalance - amount;
				return true;
			}
//			int temp = (int) getBalance();
//			setBalance(0);
////			if(getBalance() < 0) {
////				setBalance(getBalance()); 
////			int temp = (int) getBalance();
////			setBalance(temp);
//			if(getBalance() == 0) {
//			setOverdraftBalance(getOverdraftBalance() + temp);
//			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if(amount > 0) {
			if(initialoverdraftBalance > overdraftBalance) {
				if(amount < (initialoverdraftBalance - overdraftBalance)) {
					overdraftBalance = overdraftBalance + amount;
					return true;
				}
				else {
					amount = amount -(initialoverdraftBalance - overdraftBalance);
					setBalance(getBalance() + amount);
					overdraftBalance = initialoverdraftBalance;
					return true;
				}
			}else {
				setBalance(getBalance() + amount);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
