package object.class_methods;

import java.lang.reflect.Method;

public class PrintStringClassMethods {

	public static void main(String[] args) {
		
		String str = "data";
		
		Class c = str.getClass();
		
		Method[] arr=c.getDeclaredMethods();
		
		for(int i = 0; i <arr.length ; i++) {
			System.out.println(arr[i].getName());
		}
		
	}
}

