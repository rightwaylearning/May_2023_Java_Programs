package stack.impls;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		
		Stack<String> stack = new Stack<>(); // LIFO
		System.out.println(stack.capacity());
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.capacity());
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		System.out.println(stack.empty());
		
		System.out.println(stack.size());
		
		System.out.println(stack.search("BB"));
		
	}
}
