package sorting.Code;

import java.util.Arrays;

public class Count0nd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 };

		a = sort(a);

		System.out.println(Arrays.toString(a));

//		int sum = totalNum(a, count);

	}

	private static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == 0) {
				count++; // count no.of time 0's
			}
		}
		System.out.println("0 Appears" + count + "times");

		// set 0's value in array like- 0,0,0,0,0,0,etc
//		for(int i =0;i<count;i++) {
//			a[i] = 0;
//		}
//
//		//set 1's value in array like- 1,1,1,1,1,1,1etc
//		for(int i = count;i<a.length;i++) {
//			a[i] = 1;
//		}
		/*
		 * best Approach
		 */

		for (int i = 0; i < a.length; i++) {
			if (i < count) {
				a[i] = 0;
			} else {
				a[i] = 1;
			}
		}

		return a;
	}

//	private static int totalNum(int []a, int count) {
//		// TODO Auto-generated method stub
//		
//		for(int i  =0;i<a.length-1;i++) {
//			
//		}
//		
//		return 0;
//	}

}
