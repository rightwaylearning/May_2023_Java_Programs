package foreach_loop;

public class ArrayWithForEach {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		

		
		
		for(int element : arr) {
			System.out.println(element);
		}
		
		
		for(int i =0; i<arr.length; i++) {
             arr[i] = arr[i]*arr[i];
		}
		System.out.println("=================");
		
		
		for(int element : arr) {
			System.out.println(element);
		}
		
		
		
	}
	
}
