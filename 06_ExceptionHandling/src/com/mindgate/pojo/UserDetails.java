package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {
	private String userId;
	private String name;
	private int age;
	
	Scanner scanner = new Scanner(System.in);
	
	public void acceptUserDetails() {
		try {

			System.out.println("Enter Usedid");
			userId = scanner.next();
			System.out.println("Enter name");
			name = scanner.next();
			System.out.println("Enter age");
			age = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("invalid input from user");
			System.out.println("please enter valid values");
		}
	}
	
	public void displayUserDetails() {
		System.out.println(userId);
		System.out.println(name);
		System.out.println(age);
	}
	
}
