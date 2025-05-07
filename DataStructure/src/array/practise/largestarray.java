package array.practise;

import java.util.Arrays;

public class largestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]array= {2,3,1,5,6,20,320,4};
		
		for(int i = 0 ; i< array.length-1 ; i++) {
			
			for(int j = 0 ; j<array.length-1-i; j++) {
				
				if(array[j]>array[j+1]) {
					
					int temp = array[j];
					
					array[j] = array[j+1];
					
					array[j+1] = temp;
					
//					System.out.print(temp);
					
				}
				
			}
		}
		
		for(int value : array) {
			System.out.print(" " + value);
		}
		
		
	
		
		
		
		

	}

}
