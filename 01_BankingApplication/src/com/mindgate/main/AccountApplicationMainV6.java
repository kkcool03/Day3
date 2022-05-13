package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationMainV6 {

	public static void main(String[] args) {
		Current current = new Current(101, "kiran", 10000, 50000);
		System.out.println(current);
		System.out.println("withdraw : 5000");
		current.withdraw(5000);
		System.out.println(current); // overdraft : 50,000 and balance : 5000

		System.out.println();

		System.out.println("withdraw : 20000");
		current.withdraw(20000);
		System.out.println(current); // overdraft : 35,000 and balance : 0

		System.out.println();

		System.out.println("deposit : 5000");
		current.deposit(5000);
		System.out.println(current); // overdraft : 40,000 and balance : 0

		System.out.println();

		System.out.println("deposit : 15000");
		current.deposit(15000);
		System.out.println(current); // overdraft : 50,000 and balance : 5000

	}

}
