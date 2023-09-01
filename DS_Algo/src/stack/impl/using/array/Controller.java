package stack.impl.using.array;

public class Controller {

	public static void main(String[] args) {
		
		Stack s = new StackImpl();  // 5
		System.out.println(s.capacityOfSack());
		
		//Stack s1 = new StackImpl(-7);  //40
		//System.out.println(s1.capacityOfSack());
		System.out.println("push");
		System.out.println(s.push(100));
		System.out.println(s.push(200));
		System.out.println(s.push(300));
	
		System.out.println("pop operation");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.push(3000));
		System.out.println(s.push(4000));
		System.out.println(s.pop());
		System.out.println(s.peek());
	}
}
