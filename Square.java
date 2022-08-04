package com.shape.demo;

public class Square extends Rectangle {
	
	
	public Square() {
		
	}
	
    public Square(double side) {
		length = side;
	}
    
    public Square(double side,String color, boolean filled) {
		this.length = side;
		this.color = color;
		this.filled =filled;
	}

	public double getSide() {
		return length;
	}

	public void setSide(double side) {
		this.length = side;
	}
	
	public void setWidth(double side) {
    	this.width = side;
    }
    
    public void setLength(double side) {
    	this.length = side;
    }
	
	 @Override
		public String toString() {
			return "Square [ side = " + length +", width ="+ width +", length ="+ length +",color ="+ color +", filled ="+ filled +" ]";
		}

}
