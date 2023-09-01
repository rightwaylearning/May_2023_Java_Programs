package array;

public class BinarySearchWithRecustion {

	static int binarySearch(int[] arr, int start, int end , int target) {
		
		if(start <= end) {
		    int mid = (start + end )/2;
		    if(arr[mid] == target) {
		    	return mid;
		    }else if(arr[mid] > target) {
		    	end = mid -1;
		    	binarySearch(arr,start,end,target);
		    }else {
		    	start = mid +1;
		    	binarySearch(arr,start,end,target);
		    }
		}
		return -1;
	}
}
























