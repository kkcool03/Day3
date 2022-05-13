package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV3 {

	static {
		System.out.println("Welcome to XYZ Bank");
	}

	public static void main(String[] args) {

		int accountNumber;
		String name;
		double balance;
		int choice;
		double amount;
		boolean result;
		String continueChoice;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter account Number");
		accountNumber = scanner.nextInt();

		System.out.println("Enter Name");
		name = scanner.next();

		System.out.println("Enter account balance");
		balance = scanner.nextDouble();

		System.out.println("Account opened Successfully!!!");

		Account account3 = new Account(accountNumber, name, balance);
		do {
			System.out.println("Make Your Choice....  1.Withdraw    2.Deposit   3. Check balance");

//		Account account = new Account();

			choice = scanner.nextInt();
			switch (choice) {
			case 1: {

				System.out.println("how much You want to withdraw?");
				amount = scanner.nextDouble();
				result = account3.withdraw(amount);
				if (result) {
					System.out.println("Withdrawal Successfull!!!");
					System.out.println("Balance ::" + account3.getBalance());
				} else {
					System.out.print("Withdrawal Failed!!!");
					System.out.println("Balance ::" + account3.getBalance());
				}

			}
			break;
			case 2: {

				System.out.println("how much You want to Deposit?");
				amount = scanner.nextDouble();
				result = account3.deposit(amount);
				if (result) {
					System.out.println("Deposit Successfull!!!");
					System.out.println("Balance ::" + account3.getBalance());
				} else {
					System.out.print("Deposit Failed!!!");
					System.out.println("Balance ::" + account3.getBalance());
				}
			}
				break;
			case 3: {
				System.out.println("Balance ::" + account3.getBalance());
			}
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
			System.out.println("Do you want continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));

		System.out.println("Thank you for banking with us!");
	}
}
