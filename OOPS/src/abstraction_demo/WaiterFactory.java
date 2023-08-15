package abstraction_demo;

public class WaiterFactory {

	public static VaishaliManuCard getMenuCard() {
		VaishaliManuCard menu = new VaishaliKichenHall();
	    return menu;
	}
}
