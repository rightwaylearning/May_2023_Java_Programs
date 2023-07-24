package constrcutor_programs;

public class Controller {

	public static void main(String[] args) {
		
		Test t1= new Test(1,2); // The constructor Test() is undefined
		
		//Test t2=new Test(1000,20000,3000);
		
//		System.out.println(t1.a); //90
//		System.out.println(t1.b); //90
//		System.out.println("-------------------------------");
//		System.out.println(t2.a);
//		System.out.println(t2.b);
		
		Test t2= new Test(3,4);
		Test t3= new Test(6,7);
		Test t4= new Test(9,10);
		
		System.out.println(t1.a);
		
		System.out.println(t4.a);
	}
}
