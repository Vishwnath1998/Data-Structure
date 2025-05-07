package array.practise;

import java.util.Arrays;

public class mergetwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3};
		int [] b = {4,5,6};
		
		int[] c = new int [a.length+ b.length];
		
		for(int i = 0 ; i<a.length;i++) {
			
			c[i]=a[i];
			System.out.print(c[i]);
		}
		
		
		for(int j = 0 ; j<b.length ; j++) {
			
			c[j+ b.length]= b[j];
			System.out.print(c[j+b.length]);
		}	

		
		System.out.println(Arrays.toString(c));
	}

}
