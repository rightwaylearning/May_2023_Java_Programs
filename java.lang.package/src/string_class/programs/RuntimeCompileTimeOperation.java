package string_class.programs;

public class RuntimeCompileTimeOperation {

	public static void main(String[] args) {
		
//		String s = "hellohi";
//		String str = "hello";
//		String str1 = "hi";
//		String output = str + str1; // runtime
//		
//		System.out.println(s == output);  // false
//		
//		String output1= "hello" + "hi"; // compile time
//		
//		System.out.println(s == output1);// true
		
		
		 String s1 = new String("you cannot change me!");
		 String s2 = new String("you cannot change me!");
		 System.out.println(s1==s2); // false
		 String s3 ="you cannot change me!";
		 System.out.println(s1==s3); // false
		 String s4 ="you cannot change me!";
		 System.out.println(s3==s4); // true
		 String s5 = "you cannot " +"change me!";
		 System.out.println(s3==s5); // true
		 String s6="you cannot ";
		 String s7 = s6 + "change me!";
		 System.out.println(s3==s7); // false
		 final String s8 = "you cannot ";
		 String s9 = s8 + "change me!";
		 System.out.println(s3 == s9); // true
		 System.out.println(s6==s8); // true
		
	}
}
