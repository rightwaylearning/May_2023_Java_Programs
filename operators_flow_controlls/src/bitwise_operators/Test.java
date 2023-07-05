package bitwise_operators;

public class Test {

	public static void main(String[] args) {
		
		int a =10;
		int b = 20; 
		
		if(b++ > 20 &  ++a > 10) {
			a++;
		}else {
			b++;
		}
		
		System.out.println(a);  //
		System.out.println(b);  // 
	}
}
