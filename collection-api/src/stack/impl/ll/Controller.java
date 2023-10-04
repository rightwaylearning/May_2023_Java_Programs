package stack.impl.ll;

public class Controller {

	public static void main(String[] args) throws java.lang.Exception{
		
		MyStack mine = new MyStack();
		mine.push("A");
		mine.push("B");
		mine.push("C");
		mine.printStack();
		System.out.println(mine.pop());
		mine.printStack();
		
		int x=2;
	    int y= x++ * ++x;
	    System.out.println(y);//8
	    System.out.println(3|5);// 4
	}
}


class P{
	
	int abc() {
	  return 0;	
	}
}


class B extends P{
	
//	private int abc() {
//		return 0;
//	}
}