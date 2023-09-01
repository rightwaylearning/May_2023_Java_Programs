package runtime_poly;

class MM1 {

}

class NN1 extends MM1 {

	public NN1() {
		super();
		System.out.println("i am NN");
	}
}

class OO extends NN1 {
	public OO() {
		System.out.println("I am OO");
	}
}

public class SuperConstrcutorCallDemo {
	public static void main(String[] args) {
		
        OO oo= new OO();
	}
}


class Student11{
	
	String name;
	int age;
	
	public Student11(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

