package com.shape.demo;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
		
		System.out.println(s1);                 
		System.out.println(s1.getArea());        
		System.out.println(s1.getPerimeter());   
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
	//	System.out.println(s1.getRadius());    the methode getRadius() is undifined for the type Shape
		   

	    
		Circle c1 = (Circle)s1;        // Downcast back to Circle
		
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		
		

	//	Shape s2 = new Shape();     cannot instantiate  the type Shape
		   
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
	//	System.out.println(s3.getLength());   the methode getLength() is undifined for the type Shape
		   

		Rectangle r1 = (Rectangle)s3;   
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		
		   
		Shape s4 = new Square(6.6);    
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
	//	System.out.println(s4.getSide());    the methode getSide() is undifined for the type Shape
		 
		
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
	//	System.out.println(r2.getSide());    the methode getSide() is undifined for the type Rectangle
		System.out.println(r2.getLength());
		   
	
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());

	}

}
