package list;

public class ListOperation {

	public static void main(String[] args) {
		
		int[] arr = {8,4,7,-10,6,1,2,9};
		
		for (int i = 1; i < arr.length; i++) {
			    int insertElementIndex = i;
			for(int j=i-1; j >= 0; j--) {
				
				if(arr[insertElementIndex] < arr[j]) {
					int temp = arr[insertElementIndex];
					arr[insertElementIndex] = arr[j];
					arr[j] = temp;
					insertElementIndex = j;
				}
			}
		
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
