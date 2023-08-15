package multiple_inheritance_with_interface;

import java.sql.Connection;
import java.sql.Driver;

interface A{
	void m1();

}

interface B{
	void m1();
	void m2();
}

class Mine implements A,B{
	
	Connection con = null;
		
	public void m1() {
		System.out.println("I am m1");
	}
	
	public void m2() {
		System.out.println("I am m2");
	}
}


public class Test {

	public static void main(String[] args) {
		
		Mine m = new Mine();
		m.m1();
		m.m2();
		
		A a = new Mine();
		 a.m1();  //a.m2();
		B b= new Mine();
		 b.m1();  b.m2();
		
	}
}


interface AA{
	void m1();
}

abstract class BB implements AA{
	
	abstract void m3();
}

class NN extends BB{

	public void m1() {
		
	}

	void m3() {
		
	}
	
}

class AAA{
	void m1() {
		
	}
}

abstract class BBB extends AAA{
	abstract void m2();
	abstract void m1();
}

class KKK extends BBB{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}
	
interface YY{
	void m4();
}	
	
interface PP{
	void m1();
}	

interface TT  extends PP,YY{
	void m2();
}

class MySelf implements TT{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

















































