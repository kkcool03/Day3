package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {
	public static void main(String[] args) {
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		List<String>  nameList = new ArrayList<String>(); 
		nameList.add("kiran");
		nameList.add("kadam");
		nameList.add("ramesh");
		
		
		arrayListDemo.setNameList(nameList);
		arrayListDemo.setArrayListId(10);
		
		System.out.println(arrayListDemo);
		
		System.out.println("-".repeat(30));
		
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(101);
		numberList.add(102);
		numberList.add(103);
		numberList.add(103);
		numberList.add(104);
		
		System.out.println(numberList);
		System.out.println("-".repeat(30));
		
		Employee employee = new Employee(101, "kiran", 10000);
		Employee employee2 = new Employee(102, "ramesh", 13400);
		Employee employee3= new Employee(103, "suresh", 105460);
		Employee employee4 = new Employee(104, "kkcool", 165760);
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(employee);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		System.out.println(employeeList);
		
		System.out.println("-".repeat(30));
		
		for (Employee employee5 : employeeList) {
			System.out.println(employee5);
		}	
		}
}
