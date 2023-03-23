package com.cwh.practiceset11;

interface BasicAnimal {
	
	void eat();
	void sleep();
}

class Monkey {
	
	public void jump() {
		System.out.println("Jump");
	}
	
	public void bite() {
		System.out.println("Dont bite");
	}
}

class Human extends Monkey implements BasicAnimal {
	
	public void speak() {
		System.out.println("Hello Ji ");
	}
	
	@Override
	public void eat() {
		System.out.println("Kha le bhai");
	}
	
	@Override
	public void sleep() {
		System.out.println("So jaa bhai");
	}
	
}


public class Practiceset11Interface {

	public static void main(String[] args) {
		
		BasicAnimal am = new Human();
		Human hm = new Human();
		Monkey m1 = new Human();
		am.eat();
		hm.speak();
		hm.sleep();
		hm.bite();
		m1.jump();
		

	}

}
