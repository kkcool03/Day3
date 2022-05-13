package com.mindgate.main;

import java.util.Scanner;
import java.util.Set;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice ;

		EmployeeDAO dao = new EmployeeDAO();
		Employee employee;
		String choice1;

		do {
			System.out.println("1. Add new Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Get Single Employee by EmployeeId");
			System.out.println("5. Add new Employee");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				dao = new EmployeeDAO();
				System.out.println("Enter EmployeeId:");
				int employeeId = scanner.nextInt();

				System.out.println("Enter Name");
				String name = scanner.next();

				System.out.println("enter sal");
				Double salary = scanner.nextDouble();

				employee = new Employee(employeeId, name, employeeId);

				if (dao.addNewEmployee(employee)) {
					System.out.println("Account created succefully");
				}
				break;
			}

			case 2: {
				System.out.println("Enter your EmployeeId");
				int EmployeeId = scanner.nextInt();

				System.out.println("Enter Name");
				String name = scanner.next();

				System.out.println("enter sal");
				double salary = scanner.nextDouble();

//			dao = new EmployeeDAO();
//			dao.updateEmployee(emp);
				if (dao.updateEmployee(new Employee(EmployeeId, name, salary))) {
					System.out.println("updated created succefully");
				}
//			System.out.println("succefully updated");

				break;

			}
			case 3: {
				System.out.println("Enter employeeId");
				int EmployeeId = scanner.nextInt();

				if (dao.deleteEmployeeByEmployeeId(EmployeeId)) {
					System.out.println("Employeee removed");
				}
			}

			case 4: {
				System.out.println("Enter employeeId");
				int EmployeeId = scanner.nextInt();

				Employee emp = dao.getEmployeeByEmployeeId(EmployeeId);
				if (emp != null) {
					System.out.println(emp);
				}
			}
				break;

			case 5: 
				Set<Employee> employeeSet = dao.getAllEmployee();
				for (Employee showdetails :employeeSet ) {
					System.out.println(showdetails);
				}
			
				break;
			}
			System.out.println("Do you want to continue? yes or no");
			choice1 = scanner.next();
		} while (choice1.equalsIgnoreCase("yes"));
	}
}
