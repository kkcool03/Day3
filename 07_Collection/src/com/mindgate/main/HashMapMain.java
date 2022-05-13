package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeMap.put(101, "vision");
		employeeMap.put(282, "Spiderman");
		employeeMap.put(652, "hulk");
		employeeMap.put(670, "scarlett");
		
		System.out.println(employeeMap);
	}
}
