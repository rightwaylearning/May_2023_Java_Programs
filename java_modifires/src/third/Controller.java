package third;

import static second.Mi.name;
import static second.Mi.showPrice;
import second.Mi;

public class Controller {

	public static void main(String[] args) {
		
		System.out.println(Laptop.name);
		Laptop.showPrice();
		
		//-------------------------------------------------
		
		System.out.println(name);
		showPrice();
		
		Mi m= new Mi();
		m.test();
		
	}
}
