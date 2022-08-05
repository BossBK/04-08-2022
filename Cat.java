package com.animals.demo;

public class Cat extends Animal implements Pet {
	
	public String name;
	
	public Cat(String name) {
		
		super (4);
		this.name = name;
	}
	
	public Cat() {
		
		this ("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		
		System.out.println("Cats likes to play");
	}
	
	public void eat() {
		
		System.out.println("Cats eat cats food");
	}

}
