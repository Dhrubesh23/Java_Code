package com.cwh.abstraction;

abstract class Parent {
	
	public Parent() {
		System.out.println("Parent class constructor");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	abstract public void greet();
	abstract public void greet2();
}

class Child extends Parent {
	
	@Override
	public void greet() {
		System.out.println("Good morning");
	}
	
	@Override
	public void greet2() {
		System.out.println("Good afternoon");
	}
}

abstract class Child2 extends Parent {
	public void th() {
		System.out.println("I am good");
	}
}


public class Abstract_Method {

	public static void main(String[] args) {
		Child c = new Child();
//		Parent p = new Child();
		c.sayHello();
		c.greet();
		
		
		
	}

}
