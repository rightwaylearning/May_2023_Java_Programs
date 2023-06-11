package main_method_call;

public class FirstClass {

	public static void main(String[] args) {
		
		String[] arr = new String[2];
		arr[0] = "Test";
		arr[1] = "Me";
		
		SecondClass.main(arr);
		
		
	}
}
