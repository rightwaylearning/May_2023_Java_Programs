package string_class.programs;

public class StringObjectIsImmutable {

	public static void main(String[] args) {
		// string class object is immutable
		String str = "hello";
		str.concat("Good morning");
		System.out.println(str); //
		
		// StringBuffer object is not immutable
		StringBuffer br = new StringBuffer("hello");
	    br.append(" Good morning");
	    System.out.println(br);
	}
}
