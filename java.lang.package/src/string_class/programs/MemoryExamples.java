package string_class.programs;

public class MemoryExamples {

	public static void main(String[] args) {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = str1.concat("good");
		String str4 = "hellogood";
		
		System.out.println(str1 == str2); // false
		System.out.println(str1.hashCode() == str2.hashCode()); // true
        System.out.println(str1.equals(str2)); // true		 
        
        System.out.println(str3 == str4); // false
        System.out.println(str3.hashCode() == str3.hashCode()); // true
        System.out.println(str3.equals(str4)); // true
	}
}
   //  ref == ref // true other wise false

   //   p1 == p2 >> true// false