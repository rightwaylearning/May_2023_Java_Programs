package multiple_inheritance_with_interface;

class AutoPromo{
	
	void m1(int i, float f) {
		System.out.println("int i , float f");
	}
	
	void m1(char f, int i) {
		System.out.println("float f,int i");
	}
	
//	void m1(int i, int j) {
//		System.out.println("int i , int j");
//	}
//	
}


public class AutoPromotion {

	public static void main(String[] args) {
		AutoPromo a = new AutoPromo();
	
		int b = 10; int i = 100;
	    a.m1(b,i);
	}
}
