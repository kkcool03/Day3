package com.mindgate.pojo;

public class B extends A{
	
	B(){
		System.out.println("hello");
	}
//	B(int x){
//		System.out.println("hello " + x);
//	}
	B(int x){
		super();
		System.out.println("hello " + x);
	}
}
