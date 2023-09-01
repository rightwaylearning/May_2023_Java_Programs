package SuperConstrcutorCall;

class Parent{
	int a;
	int b;
	public Parent(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
}
class Child extends Parent{
	int x;
	int y;
	public Child(int x, int y, int a, int b) {
		super(a,b);
		this.x =x;
		this.y = y;
	}
}

public class Demo {

	public static void main(String[] args) {
		Child c = new Child(10, 20, 30, 40);
	}
}












