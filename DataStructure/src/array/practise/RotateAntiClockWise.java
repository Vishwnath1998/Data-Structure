package array.practise;

import java.util.Arrays;

public class RotateAntiClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,2,3,4,5};
		
		int temp = a[0];
		
		for(int i = 1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));

	}

}
