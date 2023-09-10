package equals_method.comparison;

public class Testing {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String str1 = new String("Hello");
		
		System.out.println(str == str1); // logic of Object class equals method
		
		System.out.println(str.equals(str1)); // equals method of String class
		
	}
}
