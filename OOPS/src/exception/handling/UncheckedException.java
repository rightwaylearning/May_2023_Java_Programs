package exception.handling;

public class UncheckedException {
	
	public static void main(String[] args) {
		
		System.out.println("start from Pune.............");
		try {
			 int[] arr = {10,11,12,34,56};
			 for(int i = 0; i <=5 ; i++) {
				 System.out.println(arr[i]);
			 }
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("############# ooty");
		
	}

}

