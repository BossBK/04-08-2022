package com.animals.demo;

public class Fish extends Animal implements Pet{
	
	private String name;
	
	public Fish() {
		
		super (0);
		
	}
	
	public String getNmae() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("Fish likes to play in water");
	}
	
	public void walk() {
		System.out.println("Fish can't walks ,because they doesn't have legs");
	}
	
	public void eat() {
		System.out.println("Fish eats fish food");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
