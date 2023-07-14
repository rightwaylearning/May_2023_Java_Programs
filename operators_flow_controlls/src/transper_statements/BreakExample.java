package transper_statements;

public class BreakExample {

	public static void main(String[] args) {
		
		
		// switch case ---break
		// loop / iterative control flow  >>>>>>>>>.. break use
		
		int[] adharNumber = {10,20,30,40,50,60,70,80,90,100};  // 142 cr
		
		int myAdharNo = 30;
		
		
		for(int i=0; i<adharNumber.length;i++) {
			System.out.println(">>>>>>>>>>>>");
			if(myAdharNo == adharNumber[i]) {
				System.out.println("Adhar card is active");
				break;
			}
		}
		
		
		
		
	}
}
