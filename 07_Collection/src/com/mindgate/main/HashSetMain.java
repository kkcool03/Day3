package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		
		nameSet.add("vivek");
		nameSet.add("Kiran");
		nameSet.add("Chaintanya");
		nameSet.add("Nitesh");
		nameSet.add("kiran");
		nameSet.add("vivek");
		
		System.out.println(nameSet);
		
		System.out.println("-".repeat(50));
		
		Employee employee1 = new Employee(101, "vivek", 1000);
		System.out.println(employee1.hashCode());
		Employee employee2= new Employee(102, "Kiran", 1000);
		System.out.println(employee2.hashCode());
		Employee employee3 = new Employee(103, "Chaitanya", 1000);
		System.out.println(employee3.hashCode());
		Employee employee4 = new Employee(101, "vivek", 1000);
		System.out.println(employee4.hashCode());
		
//		Integer i = Integer.valueOf(20);
//		System.out.println(i.hashCode()); the hashCode is same for this as the input
//		
//		String s = new String("Hi");
//		System.out.println(s.hashCode());
//		
//		s = s + "hello";
//		System.out.println(s.hashCode());
		
		Set<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
	}
}
