package flow_controles;

public class CheckOddOrEvenNumber {

	boolean validateEvenNumber(int a) {

		boolean flag;
		
		if (a % 2 == 0) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}
}
