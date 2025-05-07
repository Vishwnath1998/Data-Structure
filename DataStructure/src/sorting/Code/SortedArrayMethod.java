package sorting.Code;

import java.util.Arrays;

public class SortedArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[] = {112,13,12,43,2,5,6};
//		
//		System.out.println("Before Sort"+Arrays.toString(a));
//		
//		//Array.sort(a);
//		
//		Arrays.sort(a,1,4);
//		
//		System.out.println("After Sort"+Arrays.toString(a));
        int a[] = {12,3,2,12,45,1,56};
		
		System.out.println("Before sort : " + Arrays.toString(a));

		//Arrays.sort(a);
		Arrays.sort(a,1,4);
		
		System.out.println("After sort : "+Arrays.toString(a));

	}

}
