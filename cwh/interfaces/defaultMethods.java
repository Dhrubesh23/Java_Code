package com.cwh.interfaces;

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
		System.out.println("Calling" + phoneNumber);
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


public class defaultMethods {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.record4KVideo();
		String[] ar = sp.getNetworks();
		for(String item: ar) {
			System.out.println(item);
		}
		

	}

}
