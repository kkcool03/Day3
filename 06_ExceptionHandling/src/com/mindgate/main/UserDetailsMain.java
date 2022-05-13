package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class UserDetailsMain {
	public static void main(String[] args) {
		System.out.println("main start");
		UserDetails details = new UserDetails();
		details.acceptUserDetails();
		details.displayUserDetails();
		System.out.println("main end");
		
//		Class.forName("com.mindgate.pojo.UserDetails");
	}
	
}
