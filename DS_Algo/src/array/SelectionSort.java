package array;

public class SelectionSort {

	Integer[] selectionSort(Integer[] arr) {

		if (arr.length == 0) {
			return arr;
		} else if (arr.length == 1) {
			return arr;
		} else {
			// [8,3,1,5,9]
			// [1,(3,8,5,9)]
			// [1,3,(8,5,9)]
			// [1,3,5,(8,9)]
			// [1,3,5,8 (9)]
			for (int j = 0; j < arr.length - 1; j++) {

				int smallIndex = j;

				for (int i = j + 1; i < arr.length; i++) {
					if (arr[smallIndex] > arr[i]) {
						smallIndex = i;
					}
				}
				Integer temp = arr[j];
				arr[j] = arr[smallIndex];
				arr[smallIndex] = temp;
				
				for (int i = 0; i < arr.length; i++) {
				   System.out.print(arr[i] +"  ");	
				}
				System.out.println();
			}
			return arr;
		}

	}

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		Integer[] arr = { 8, 3, 1, 5, 9 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("----------- logic----------------------");

		arr = s.selectionSort(arr);
		
		System.out.println("------------- logic over-------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
