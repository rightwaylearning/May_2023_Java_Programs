package increments_decrements;

public class Test {

	public static void main(String[] args) {

		int i = 10;
		i++;
		System.out.println(i);

		System.out.println("---------------------");

		int x = 10;
		x--;
		System.out.println(x);

		System.out.println("-----------------------");

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.println(arr.length);
		// size is = 10 , what is valid index = 0-9

		System.out.println("--------------------------");

//         for(int index =0; index < arr.length ; index++) {
//        	System.out.println(index);
//        	System.out.println(arr[index]); 
//        	System.out.println("--------");
//         }

		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
		
		System.out.println("------------------------------");
		
		for(int j = arr.length -1; j > -1 ; j--) {
			
			System.out.println(arr[j]);
			
		}

	}
}



