package short_circuit.operartors;

public class Test2 {

	public static void main(String[] args) {
		
//		int a =10;
//		
//		if(false == false ||  ++a > 10) {
//			System.out.println("I am true block");
//		}else {
//			System.out.println("I am else block");
//		}
//		
//		System.out.println(a);
		
		
		
int a =10;
		
		if(false == false &&  ++a > 10) {
			System.out.println("I am true block");
		}else {
			System.out.println("I am else block");
		}
		
		System.out.println(a);
	}
	
}
