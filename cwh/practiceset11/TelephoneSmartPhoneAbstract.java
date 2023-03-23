package com.cwh.practiceset11;

abstract class Telephone {
	
	abstract public void ring();
	abstract public void lift();
	abstract public void disconnect();
}

class SmartPhone extends Telephone {
	
	public void camera() {
		System.out.println("Take a picture");
		
	}
	
	public void ring () {
		System.out.println("Your phone is ringing ");
	}
	
	public void lift() {
		System.out.println("Pick up your call");
	}
	
	public void disconnect() {
		System.out.println("your call is disconnected");
	}
	
	
}


public class TelephoneSmartPhoneAbstract {

	public static void main(String[] args) {
		
		Telephone tp = new SmartPhone();
		tp.ring();
		tp.lift();
//		Telephone tp = new Telephone(); // It is not possible because we can't create an object of an abstract class.
//		Smartphone sp = new Telephone(); // It is also not possible.

	}

}
