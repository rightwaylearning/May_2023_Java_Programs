package merge.two.array_sorted;

public class Example {

	public static void main(String[] args) {

		int[] first = { 5, 7, 11, 45, 99 };
		int[] second = { 3, 9, 13, 41, 56, 89, 101, 111, 234 };

		int[] result = new int[first.length + second.length]; // 13 >>0-12

		int f = 0, s = 0, r = 0;

		while (r < result.length) {
			if (f < first.length && s < second.length) {
				if (first[f] < second[s]) {
					result[r] = first[f];
					f++;
				} else {
					result[r] = second[s];
					s++;
				}
			} else if (f >= first.length && s < second.length) {
				result[r] = second[s];
				s++;
			} else if (s >= second.length && f < first.length) {
				result[r] = first[f];
				f++;
			}
			r++;
		}

		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
