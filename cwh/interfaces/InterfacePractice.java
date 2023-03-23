package com.cwh.interfaces;

interface Bicycle 
{	
	void applyBrake (int decrement);
	void speedup (int increment);
	
}

interface HornBicycle {
	void blowHorn1();
	void blowHorn2();
		
	}

class AvonCycle implements Bicycle, HornBicycle {
	
	void blowHorn() {
		System.out.println("Gently blow the horn ");
	}
	
	public void applyBrake (int decrement) {
		System.out.println("Applying brake");
	}
	
	public void speedup (int increment) {
		System.out.println("Applying speedUp");
	}
	
	public void blowHorn1 () {
		System.out.println("Horn bajao");
	}
	
	public void blowHorn2 () {
		System.out.println("Aur tez horn bajao");
	}
}


public class InterfacePractice {

	public static void main(String[] args) {

		AvonCycle ac = new AvonCycle();
		ac.applyBrake(5);
		
		ac.blowHorn1();
		ac.blowHorn2();
		

	}

}
