package sorting.Code;

import java.util.Arrays;

public class SortedTwoPointer0nd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {0,1,0,1,0,1,1,0,1,1,0,1,1,1,0,1,0,0,0,0};
		
		a= sort(a);
		
		System.out.println(Arrays.toString(a));
		
		

	}

	private static int[] sort(int[] a) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right = a.length-1;
		int temp = 0;
		while(left < right) {
		
		if(a[left] == 0) {
			left++;
		}
		if(a[right] == 1) {
			right--;
		}
		//check if left  == 1 and right ==0 then swap it;
		if(a[left] == 1 && a[right]==0 ) {
			temp = a[left];
			a[left]= a[right];
			a[right]=temp;
			left++;
			right--;
			
		}
			
	}
		return a;
	}

}
