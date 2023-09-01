package queue.impl;

import java.util.Iterator;

public class QueueImpl implements Queue{

	Character[] queue ;
	Integer front_end;
	Integer back_end;
	
	
	public QueueImpl() {
		this.queue = new Character[5];
		this.front_end = this.queue.length-1;
		this.back_end = this.queue.length-1;
	}

	public QueueImpl(Integer size) {
		this.queue = new Character[size];
		this.front_end = this.queue.length-1;
		this.back_end = this.queue.length-1;
	}
	
	@Override
	public boolean isEmpty() {
		return this.front_end.equals(this.back_end)? true:false;
	}

	@Override
	public boolean isFull() {
		return this.back_end.equals(-1)?true:false;
	}

	@Override
	public boolean inQueue(Character ch) {
		if(this.isFull()) {
			return false;
		}else {
			this.queue[this.back_end] = ch;
			this.back_end--;
			return true;
		}
	}

	@Override
	public Character deQueue() {
		if(!this.isEmpty()) {
			
			Character storage = null;
			
			for (int i = 0; i < queue.length; i++) {
				Character temp = this.queue[i];
				this.queue[i] = storage;
				storage = temp;
			}
			this.back_end++;
			return storage;
			
		}
		return null;
	}

	@Override
	public Character peek() {
		return this.isEmpty()?null:this.queue[this.front_end];
	}

	@Override
	public Integer sizeOfQueue() {
		return this.queue.length - (this.back_end + 1);
	}

}
