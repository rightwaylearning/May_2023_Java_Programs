package test;

import java.io.StreamCorruptedException;

public class ArrayExample {

	public static void main(String[] args) {
			
		AdharCard[] cards = new AdharCard[4];
		
					AdharCard c1 = new AdharCard();
					c1.adharNumber = 76578976544327L;
					c1.fullName = "Ramesh shippi";
					c1.address = "mumbai";
					
		cards[0] =  c1;
		
		//---------------------------------------------------
		
		cards[1] = new AdharCard();
		
		cards[1].adharNumber = 9847583459L;
		cards[1].fullName = "sadagopan ramesh";
		cards[1].address = "haskddjgh bsakdjghiasd";
	
		// ------------------------------------------------
		
	}
}
