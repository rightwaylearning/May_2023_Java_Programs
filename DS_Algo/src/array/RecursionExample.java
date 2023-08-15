package array;

public class RecursionExample {
	
	
	void printNumber(int num) {
		
		System.out.println(num);
		num++;
		if(num<=10) {
			printNumber(num);
		}else {
			return;
		}
	}
	
	

	public static void main(String[] args) {
		
		// print 1 to 10 number.
		RecursionExample r= new RecursionExample();
		r.printNumber(1);
	}
}
