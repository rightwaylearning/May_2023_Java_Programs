package array;

public class BinarySearch {
     
	static int  binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = (start + end)/2;
		
			if(arr[mid] == target) {
				return mid;
			}
			
			if(arr[mid] < target) {
				start = mid +1;
			}
			
			if(arr[mid] >  target){
				end = mid -1;
			}
		}
			
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3,7,9,11,17,54,61,78,89,93};
		
		int index = BinarySearch.binarySearch(arr,64);
		System.out.println(index);
	}
}
