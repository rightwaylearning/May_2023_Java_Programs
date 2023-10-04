package stack.impl.ll;

import java.util.LinkedList;

public class MyStack {
	
	private LinkedList<String> list;
	
	public MyStack() {
		list = new LinkedList<>();
	}
	
	Boolean push(String name) {
		list.addLast(name);
		return true;
	}
	
	String pop() {
		return list.removeLast();
	}
	
	void printStack() {
		System.out.println(list);
	}
	
}
