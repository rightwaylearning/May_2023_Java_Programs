package insertion.sort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 450, 230, 120, 400, 200, 700, 490, 670 };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" , ");
		}
       System.out.println("---------------");
		for (int i = 1; i < arr.length; i++) {
			
			int current = i;
			
			for(int j = i-1; j >=0; j-- ) {
				
				if(arr[j] > arr[current]) {
					int temp = arr[j];
					arr[j] = arr[current];
					arr[current] = temp;
					current = j;					
				}
				
			}
			
			for (int m = 0; m < arr.length; m++) {
				System.out.print(arr[m] +" , ");
			}
	       System.out.println("---------------");

		}

	}

}
