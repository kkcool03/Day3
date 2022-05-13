package com.mindgate.Factory;

import com.mindgate.pojo.Circle;
import com.mindgate.pojo.Shapes;
import com.mindgate.pojo.Square;
import com.mindgate.pojo.Traingle;

public class ShapesFactory {

	public static Shapes getshape(int choice) {
		Shapes shapes = null;
		switch (choice) {
		case 1: {
			shapes = new Circle();
			break;
		}
		case 2: {
			shapes = new Traingle();
			break;
		}
		case 3: {
			shapes = new Square();
			break;
		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + choice);
//			shapes = new Shapes();
//			break;
		}
		return shapes;
	}
}
