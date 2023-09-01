package runtime_poly;


class P11{
    
    static void m1(){
        System.out.println("parent");
     }

}

class C11 extends P11{

    static void m1(){
       System.out.println("child");
    }
}



public class StaticMethodOverriding {

	public static void main(String[] args) {
		
		P11 p= new C11();
		p.m1();
	}
}
