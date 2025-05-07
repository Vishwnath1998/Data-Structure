package sorting.Code;

import java.util.Arrays;

public class MergingTwoArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7 };
		int b[] = { 2, 4, 6, 8 };

		mergeSortedArray(a, b);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

//		

//		

	}

	private static void mergeSortedArray(int[] a, int[] b) {
		int i = a.length - 1;
		int j = 0;

		int temp = 0;

		while (i >= 0 && j < b.length) {
			if (a[i] >= b[j]) {
				temp = a[i];
				a[i] = b[j];
				b[j] = temp;

			}

			i--;
			j++;
			// TODO Auto-generated method stub

		}
		Arrays.toString(a);
		Arrays.toString(b);

	}
}
