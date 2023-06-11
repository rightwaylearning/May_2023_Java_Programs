package test;

public class Runner {

	public static void main(String[] args) {
		
		MathsOpt maths = new MathsOpt();
		
		maths.sum(10, 20); // 30
		maths.sum(100, 200); // 300
		
		
		maths.minus(1000, 100);// 900
		maths.minus(3000, 300);// 2700
		
		int x = 20;
		int y = 10;
		maths.minus(x, y);
		
		maths.sum(x, y);
	}
}
