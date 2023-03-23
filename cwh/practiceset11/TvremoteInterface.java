package com.cwh.practiceset11;

interface TvRemote {
	
	void onTv();
	void changeChannel ();
}

interface SmartTvRemote extends TvRemote {
	
	void openNetflix();
	void openAmazonPrime();
}

class Tv implements TvRemote {
	
	@Override
	public void onTv() {
		System.out.println("Tv on ");
	}
	
	@Override
	public void changeChannel() {
		System.out.println("Change the channel ");
	}
}


public class TvremoteInterface {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.onTv();
		TvRemote tr = new Tv();
		tr.changeChannel();		
		
		

	}

}
