package object.type.cast;

import java.util.Stack;

class Test{
	Integer a;
	String str;
	
	void m1() {}
	
	void m2() {}
}


public class sample {

	public static void main(String[] args) {
		Test t= new Test();
		Test t1= t;
	// ------- equality ------------------	
		int a = 10;
		int a1 = a;
	 //-------------------------------
		
		Object o = t;   // P p= new C(); up casting done by compiler 
		
	//---------------------------------------	
		int i = 10;
		double d = i;  // up casting done by compiler
		
		
	// --------------------------------------------
		
		double d1 =67.90;
		int ii = (int)d1; // risk >> data loss, unpredictable anw.
		
	//-----------------------
		
		Object oo = new Object();
		Test tt =(Test) new Object();
		// downcasting is invalid in java if we cast forcefully compiler ignore erro but run type
		// exception throw by jvm  >>> ClasscastException.java
	}
	
}
