package second;

import first.MySelf;
import first.Test;

public class Controller {

	public static void main(String[] args) {
		
		Test t= new Test();
		t.showMessage();
		
		MySelf m= new MySelf();
		m.showMessage();
		
				
		 Mine m1= new Mine();
		 m1.showMessage();
		 
		 first.Mine m2= new first.Mine();
		 m2.showMessage();
		 
		
		 Dinner d = new Dinner();  //Cannot instantiate the type Dinner
	}
}
