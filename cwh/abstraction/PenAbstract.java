package com.cwh.abstraction;

abstract class Pen {
	
	
	abstract public void write();
	abstract public void refill();
}

class FountainPen extends Pen {
	
	public void write() {
		System.out.println("Write Something");
	}
	
	public void refill() {
		System.out.println("Refill your pen");
	}
	
	public void changeNib() {
		System.out.println("Change Pen's Nib");
	}
}




public class PenAbstract {

	public static void main(String[] args) {

		FountainPen fp = new FountainPen();
		fp.write();
		fp.changeNib();

	}

}
