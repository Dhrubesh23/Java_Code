package com.cwh.inheritance;

class Rectangle {
	
	public int length, width;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	Rectangle (int l , int w){
		System.out.println("I am rectangle param constructor " + (l*w));
	}
	
	public int area () {
		
		return (length *width);
	}
}

class Cuboid extends Rectangle {
	
	public int height;
	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	Cuboid( int l,int w, int h)
	{
		super(l,w);
		System.out.println("I am cuboid param constructor " + l*w*h);
	}
	
	public double volume () {
		return this.length*this.width*this.height;
	}
}



public class InheritRectCuboid {

	public static void main(String[] args) {

		Cuboid obj = new Cuboid(10, 12, 5);
		obj.setLength(10);
		obj.setWidth(12);
		obj.setHeight(5);
		System.out.println(obj.volume());
		
		System.out.println();
		
		Rectangle rect = new Rectangle(13,8);
		rect.setLength(13);
		rect.setWidth(8);
		System.out.println(rect.area());
		
		

	}

}
