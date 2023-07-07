package switch_case;

public class SwitchWithoutBreak {

	public static void main(String[] args) {

	String day = "monday";

	  switch (day) {

		case "monday": {
			System.out.println("Poha");
			
		}

		case "tuesday": {
			System.out.println("dosa");
			
		}

		case "wednesday": {
             System.out.println("upma");
			
		}

		case "thursday": {
            System.out.println("khichadi");
			
		}

		case "friday": {
            System.out.println("misal pav"); 
			
		}

		case "saturday": {
            System.out.println("shira");
			
		}

		case "sunday": {
            System.out.println("please go outside");
			
		}

		default: {
            System.out.println("please pay first then enjoy");
			break;
		}

		}

	}
}
