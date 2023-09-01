package runtime_poly;

interface MySelf{
	void myOwnHome();
}

class PP{}
class CC extends PP{}
class DD extends CC{}

class Parent {
	                                         // overridden
	Object homeConstruction(int a, int b) {
		System.out.println("1 RK");
		return null;
	}

}

class Child extends Parent  {

	@Override
	CC homeConstruction(int a, int b) {
		System.out.println("3 bhk");
		return null;
	}


}



public class Test {
	public static void main(String[] args) {

		Parent p = new Child();
		p.homeConstruction(10, 20);
		
	}
}
