package com.mindgate.Main;

import java.util.Scanner;

import com.mindgate.Factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class PaintApplicationMain {
	public static void main(String[] args) {
		System.out.println("What You Want Draw?");
		System.out.println("1. Circle");
		System.out.println("2. Traingle");
		System.out.println("3. Square");
		
		System.out.println("Enter Your Choice");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		Shapes shapes = ShapesFactory.getshape(choice);
		if(shapes != null)
			shapes.draw();
		else
			System.out.println("Invalid shape Choice");
	}
}
