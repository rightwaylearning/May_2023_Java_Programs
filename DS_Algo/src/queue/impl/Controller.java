package queue.impl;

public class Controller {

	public static void main(String[] args) {
		
		Queue queue = new QueueImpl();
		
		System.out.println("Queue is empty :"+queue.isEmpty()); // true
		System.out.println("Queue is full :"+queue.isFull());   // false
		System.out.println("------------------------");
		System.out.println(queue.inQueue('A')); // true
		System.out.println(queue.inQueue('B')); //true
		System.out.println(queue.inQueue('C'));  // true
		System.out.println(queue.inQueue('D')); // true
		System.out.println(queue.inQueue('E')); // true
		System.out.println(queue.inQueue('F')); // false
		System.out.println("------------------------");
		
		 
		
		System.out.println("Queue is empty :"+queue.isEmpty()); // false
		System.out.println("Queue is full :"+queue.isFull()); // true
		
		//System.out.println(queue.peek());
		
		//---------------------------------
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println("Queue is full :"+queue.isFull());
		
		queue.inQueue('Z');
		System.out.println("Queue is full :"+queue.isFull());
		queue.inQueue('X');
		System.out.println("Queue is full :"+queue.isFull());
		
		System.out.println(queue.sizeOfQueue());
		queue.deQueue();queue.deQueue();queue.deQueue();queue.deQueue();queue.deQueue();
		System.out.println(queue.sizeOfQueue());
	}
}
