package com.cwh.polymorphism;


interface Camera {
	
	void takeSnap();
	void recordVideo();
	
	private void greet() {
		System.out.println("Good Morning");
	}
	default void record4KVideo() {
		greet();
		System.out.println("Recording in 4K...");
	}
}

interface Wifi {
	String[] getNetworks();
	void connectToNetwork(String network);
}

class CellPhone {
	
	void callNumber(int phoneNumber) {
		System.out.println("Calling " + phoneNumber);
	}
	void pickCall() {
		System.out.println("Connecting..");
	}
}

class SmartPhone extends CellPhone implements Wifi, Camera {
	
	public void takeSnap() {
		System.out.println("taking snap");
	}
	public void recordVideo() {
		System.out.println("Taking snap");
	}
//	public void record4KVideo() {
//		System.out.println("Taking snap and recording in 4K");
//	}
	public String[] getNetworks() {
		System.out.println("Getting List of Networks");
		String[] networkList = {"Dhrubesh", "Priyanka", "Rupam"};
		return networkList;
	}
	public void connectToNetwork(String network) {
		System.out.println("Connecting to " + network);
	}
	
}



public class PolymorphismPractice {

	public static void main(String[] args) {
		
		Wifi wf = new SmartPhone();
		wf.connectToNetwork("Priyanka");
		
		SmartPhone sp = new SmartPhone();
		sp.callNumber(12345);
		sp.pickCall();
		sp.takeSnap();

	}

}
