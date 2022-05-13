package com.mindgate.dao;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	private Set<Employee> employeeSet = new HashSet<Employee>();
	
	
//	Employee employee2 = new Employee();

	public EmployeeDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean addNewEmployee(Employee employee) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter EmployeeId:");
//		int employeeId = scanner.nextInt();
//		while (employeeId != 0) {
//			employee2.setEmployeeId(employeId);
//			employee2.setName(employeName);
//			employee2.setSalary(employeeSal);
		if(employee != null) {
			return employeeSet.add(employee);
		}
		return false;
	}

	public boolean updateEmployee(Employee employee) {
		for(Employee emp : employeeSet) {
			if(emp.getEmployeeId() == employee.getEmployeeId());
			emp.setName(employee.getName());
			emp.setSalary(employee.getSalary());
			return true;
		}
		return false;
	}

	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId() == employeeId) {
			 return	employeeSet.remove(employee);
			}
		}
		return false;
	}

	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeSet) {
			if(employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	public Set<Employee> getAllEmployee() {
		return employeeSet;
	}
}
