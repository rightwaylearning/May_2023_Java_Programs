package switch_case;

public class SelectColor {

	public static void main(String[] args) {
		
		final String label1= "BLUE";
		
		final String label2="RED";
		
		

		String color = "RED";

		switch (color) {

		case label1: {
			System.out.println("I am Blue color");
			break;
		}

		case label2: {
			System.out.println("I am red color");
			break;
		}

		case "PINK": {
            System.out.println("I am pink color");
			break;
		}

		case "BLACK": {
            System.out.println("I am black color");
			break;
		}

		default: {
            System.out.println("No color match");
			break;
		}

		}

	}

}
