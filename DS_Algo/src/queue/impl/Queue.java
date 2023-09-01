package queue.impl;

public interface Queue {

	boolean isEmpty();
	boolean isFull();
	boolean inQueue(Character ch);
	Character deQueue();
	Character peek();
	Integer sizeOfQueue();
}
