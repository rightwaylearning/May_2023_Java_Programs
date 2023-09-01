package stack.impl.using.array;

public class StackImpl implements Stack {

	private Integer[] arr;
	private Integer currentIndex;

	public StackImpl() {
		this.arr = new Integer[5];
		this.currentIndex = this.arr.length - 1;
	}

	public StackImpl(int stackSize) {
		if (stackSize > 0) {
			this.arr = new Integer[stackSize];
			this.currentIndex = this.arr.length - 1;
		} else {
			System.out.println(
					"Sorry we can't create current provided size of array, please check your input , try with other input size");
		}
	}

	@Override
	public boolean push(Integer data) {
		if (currentIndex.equals(-1)) {
			// System.out.println("stak is overflow ");
			return false;
		} else {
			this.arr[this.currentIndex] = data;
			currentIndex--;
			return true;
		}
	}

	@Override
	public Integer pop() {
		if (this.currentIndex.equals(this.arr.length - 1)) {
            System.out.println("stack is empty");
			return null;
		} else {
			currentIndex++;
			Integer copy = this.arr[currentIndex];
			this.arr[currentIndex] = null;
			return copy;
		}
	}

	@Override
	public Integer peek() {
		if (this.currentIndex.equals(this.arr.length - 1)) {
            System.out.println("stack is empty");
			return null;
		} else {
			return arr[this.currentIndex + 1];
		}
	
	}

	@Override
	public Integer capacityOfSack() {
		return this.arr.length;
	}

}
