package string_class.programs;

public class WaysToCreateObjectOfString {
	
	public static void main(String[] args) {
		
		String s = "abc";
		
		// OR
		
		String s1 = String.valueOf("abc");
		
		//-------------------------------------------
		
		String s2 = new String();
		
		//----------------------------------------------
		String s3 = new String("abc");
		
		//----------------------------------------------
		StringBuffer br = new StringBuffer("abc");
		String s4= new String(br);
		//------------------------------------------
		StringBuilder bi = new StringBuilder("abc");
		String s5 = new String(bi);
		//---------------------------------------------
		
		char[] arr = {1,2,3,4,5};
		String s6 = new String(arr);
		
		//--------------------------------------------------
		
		
		
		
		
		
	}

}
