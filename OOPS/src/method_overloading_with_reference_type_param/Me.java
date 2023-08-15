package method_overloading_with_reference_type_param;

class Iam{
	void m1(Number n) {
		System.out.println("Number n");
	}
	void m1(Integer i) {
		System.out.println("Integer i");
	}
	void m1(double d) {
		System.out.println("double d");
	}
	void m1(String s) {
		System.out.println("String s");
	}
}
public class Me {

	public static void main(String[] args) {
		 Iam i = new Iam();
		 i.m1(10); // match >> auto promotion
         Integer ii = 10;		 
		 i.m1(ii); // match
		  char c = 'A';
		 i.m1(c); // 
		 Character ch = 'B';
		 i.m1(ch); // match >> parent class >> un boxing >> match >> auto promotion
		 
	}
}
