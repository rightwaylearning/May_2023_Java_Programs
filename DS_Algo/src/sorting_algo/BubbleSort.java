package sorting_algo;
public  class BubbleSort{

    public static void main(String[] args) {
       
    	int[] arr=  {9,7,8,3,10,99,5};  //0-6
    	for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
    	System.out.println("------------------------------------");
    	
    	for (int i = 0; i < arr.length-1; i++) {
    		
    		for(int j = 0; j <arr.length-1-i;j++) {
    			if(arr[j] > arr[j+1]) {
        			int temp = arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1] = temp;
        		}
    		}
    	}
    	
    	for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
    }
}