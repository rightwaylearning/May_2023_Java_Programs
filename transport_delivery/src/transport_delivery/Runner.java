package transport_delivery;

public class Runner {

	public static void main(String[] args) {
		
		Bag b = new Bag();
		b.suger = 2;
		b.oil = "5 liter";
		b.coffee = 10;
		
		
		MyHome home = new MyHome();
		
		home.product(b);
		
	}
}
