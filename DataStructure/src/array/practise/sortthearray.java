package array.practise;

import java.awt.geom.Area;
import java.util.Arrays;

public class sortthearray {

	public static void main(String[] args) {
	
		
		int []a = {3,4,5,9};
		
		boolean flag = true ;
//		 Arrays.sort(a);
//		 
//		 System.out.println(Arrays.toString(a));
		
		
		for(int i = 0 ; i <a.length-1 ; i++) {
			
			if(a[i]>a[i+1]) {
				
			
				flag =  false;
				
				
			}
			
		}
		if(flag==false) {
			
			System.out.println("Arrays  are not sorted");
		}else {
			System.out.println("Array are  sort ");
		}

	}

}
