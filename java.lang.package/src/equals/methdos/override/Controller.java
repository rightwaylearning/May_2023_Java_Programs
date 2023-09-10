package equals.methdos.override;

public class Controller {

	public static void main(String[] args) {
		
		Car c1= new Car("Maruiti", "shift", "white", 997);
		
		Car c2 = c1;
		
		Car c3= new Car("Maruiti", "shift", "white", 997);
		
		Car c4= new Car("Maruiti", "shift", "red", 997);
		
		
		System.out.println(c1.equals(c2)); // true
		
		System.out.println(c1.equals(c3)); // false
		
		System.out.println(c1.equals(c4)); // false;
		
		Object 
	}
}
