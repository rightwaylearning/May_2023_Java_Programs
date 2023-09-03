package equals.methdos.override;

class WWW{
   String name;
   WWW(String name){
	   this.name = name;
   }
   
   @Override
	public boolean equals(Object obj) {
		WWW w = (WWW)obj;
		
	      String s1 = this.name; 
	      String s2 = w.name;
	      
		  boolean b = s1.equals(s2);
		
		return b;
	}
}
public class Proof {

	public static void main(String[] args) {
		
		WWW w1= new WWW("Suresh");
		WWW w2= new WWW("Suresh");
		
		System.out.println(w1.equals(w2));
		
		String str1 = new String("AAA");
		String str2 = new String("AAA");
		
		System.out.println(str1.equals(str2));
		
	}
}
