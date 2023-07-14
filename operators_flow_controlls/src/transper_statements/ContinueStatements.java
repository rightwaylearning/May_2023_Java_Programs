package transper_statements;

public class ContinueStatements {

	public static void main(String[] args) {
		
		int[] arr = {12,111,45,345,1234,8,21,45678,123,1,89};
		
		int sum =0;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if((arr[i] >= 100 && arr[i]<=999)) {
				System.out.println(arr[i]);
				continue;
			}
						
			sum = sum + arr[i];
		}
		
		
		System.out.println("sum = "+ sum);
		
		
	}
}
