package while_loop_programs;

public class WhileLoop {

	public static void main(String[] args) {

//		
//		int i = 1;
//		
//		while(i<=5) {
//			System.out.println("Hi");
//			i++;
//		}

//		int i = 1;
//		
//		while(i<=10) {
//			System.out.println(i*12);
//			i++;
//		}

		// I want to print 10 to 1 >> reverse number

//		int i = 10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}

//		int i = 1;
//		
//		while(i<10) {
//			System.out.println(i);
//			i = i + 3;
//		}

		// print array
//		int[] arr = {10,20,30,40,50,60,70,80,90,100};  // 5 >>  0-4
//		
//		int index = 0;
//		
//		while(index < arr.length) {
//			System.out.println(arr[index]);
//			index++;
//		}

		// print alter number of array
             //       0   1    2    3  4   5    6     7    8    9
//		int[] arr = { 11, 22, 333, 44, 55, 600, 70, 80000, 99, 100 }; // 5 >> 0-4
//
//		int index = 0;
//
//		while (index < arr.length) {
//			System.out.println(arr[index]);
//			index = index + 2;
//		}
		
		// do sum of all array elements
//		
//		int[] arr= {10,1,3,6,8};  // 28
//		int index  = 0;
//		int sum = 0;
//		
//		while (index < arr.length) {
//			sum = sum + arr[index];
//			index++;
//		}
//		
//		System.out.println("sum = " + sum);
//		
		//  11%2 = 1,  23
		
//		
//		int[] arr= {10,1,3,6,8,11,23};  // 28
//		int index  = 0;
//		
//		while (index < arr.length) {
//			
//			if(arr[index]%2 == 1) {
//				System.out.println(arr[index]);
//			}
//			
//			index++;
//		}
		
		//         0 1 2   >>>>>>>>>>>>position
	  int[] arr = {1,5,8,4,9,10,12}; // >> array element
		
	  int even_sum = 0;
	  int odd_sum =0;
	  
	  int index =0;
		
		while(index < arr.length) {
			
			if(arr[index]%2 == 0) {
				even_sum = even_sum + arr[index];
			}else {
				odd_sum = odd_sum + arr[index];	
			}
			
			
			index++;
		}
		
		System.out.println("even number sum "+even_sum);
		System.out.println("odd number sum "+odd_sum);

	}
}
