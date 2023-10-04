package string_class.programs;

public class InternMethodExample {

	public static void main(String[] args) {
		 String s1= new String("abc");
		 String n = s1.intern();
		 String s2 = "abc";
		 
		// System.out.println(n==s2);
		 
		 //-------------------------------------------
		 
		 String a = "abc";
		 String b = a.toUpperCase();
		 String c = a.toLowerCase();
		 String d = b.toUpperCase();
		 System.out.println(a==c);
		 System.out.println(b==d);
		 
	}
}
