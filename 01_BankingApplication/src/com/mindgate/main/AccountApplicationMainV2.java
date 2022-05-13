package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {
	public static void main(String[] args) {
		Account account = new Account(101, "Kiran", 1000);
		boolean result = account.withdraw(200);
		if(result) {
			System.out.println("Transaction completed Successfully");
			System.out.println("Balance :: " +account.getBalance());
		}
		else {
			System.out.println("Transaction Failed!!!");
			System.out.println("Balance :: " +account.getBalance());
		}
		System.out.println("-".repeat(30));
		
		result = account.deposit(1200);
		
		if(result) {
			System.out.println("Your amount is deposited");
			System.out.println("Balance :: " +account.getBalance());
		}
		else {
			System.out.println("Your amount is must ber 0");
		}
	}
}
