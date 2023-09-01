package array;

class ArrayIndexSerach{
	 // 8,3,1,5,9

	int findSmallNumber(int[] arr) {
		
		if(arr.length == 0) {
			return -1;
		}else if(arr.length == 1) {
			return 0;
		}else {
			 int smallIndex = 0;
			 
			 for (int i = 1; i < arr.length; i++) {
				 if(arr[smallIndex] > arr[i]) {
					 smallIndex = i;
				 }
			 }
			return smallIndex;
		}
		
	}
}                   // selection sort
                   // {8,3,1,5,56};  >> 2
                   // / {1,3,8,5,56};
                     /// {1,3,8,5,56};  >> 3
                       /// {1,3,5,8,56};
                         //{1,3,5,8,56};
public class SmallNumber {

	public static void main(String[] args) {
		ArrayIndexSerach a = new ArrayIndexSerach();
		int[] arr = {8,3,1,5,-56};
		System.out.println(a.findSmallNumber(arr));
	}
}
