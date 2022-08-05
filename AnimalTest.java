package com.animals.demo;

public class AnimalTest {

	public static void main(String[] args) {
		
		Fish d = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a = new Fish();
		Animal e = new Spider();
	   	Pet p = new Cat();
	   	
	   	d.walk();
	   	d.play();
	   	d.eat();
	   	
	   	c.play();
	   	c.eat();
	   	c.getName();
	   	
	   	a.eat();
	   	
	    e.eat();
	    e.walk();
	    
	    p.play();
	   	
	}

}
