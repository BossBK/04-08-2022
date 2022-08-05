package com.animals.demo;

public abstract class Animal {
	
	protected int legs;
	
	protected Animal(int legs) {
		
		this.legs = legs;
	
	}
	
	public abstract void eat();
	
	public void walk(){
		System.out.println(" This can walk with " + legs + " legs " );
	}

}
