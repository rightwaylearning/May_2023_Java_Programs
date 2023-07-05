package flow_controles;

public class AssignmentOne {

	public static void main(String[] args) {

		int[] arr = { 11, 23, 56, 78, 33, 57, 90 };

		CheckOddOrEvenNumber c = new CheckOddOrEvenNumber();

		for (int i = 0; i < arr.length; i++) {

			if (c.validateEvenNumber(arr[i])) {
				System.out.println(arr[i] + " is Even number");
			}
		}
	}
}
