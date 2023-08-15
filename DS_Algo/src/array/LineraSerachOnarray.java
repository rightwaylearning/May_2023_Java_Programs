package array;

public class LineraSerachOnarray {

	int serachItem(Integer[] arr, Integer number) {

		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != null && arr[i].equals(number)) {
					return i;
				}else if(arr[i]==null && number == null) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		LineraSerachOnarray obj = new LineraSerachOnarray();

		Integer[] arr = { 100, 200, 300, null, 500, 300, 700, 800 };

		// case 1
//    	Integer num = 500;  // output index 4
//    	int index = obj.serachItem(arr, num);
//    	System.out.println(index);

//    	// case 2
//    	Integer num = 550;  
//    	int index = obj.serachItem(arr, num);
//    	System.out.println(index);

		// case 3
//    	Integer num = 700;  
//    	int index = obj.serachItem(arr, num);
//    	System.out.println(index);

//		// case 4
//
//		Integer num = 700; 
//		Integer[] arr1 = null;
//		int index = obj.serachItem(arr1, num);
//		System.out.println(index);
		
		
		// case 5
//
//		Integer num = null; 
//		int index = obj.serachItem(arr, num);
//		System.out.println(index);
		
		
		// case 6
//
		Integer num = 300; 
		int index = obj.serachItem(arr, num);
		System.out.println(index);

	}
}
