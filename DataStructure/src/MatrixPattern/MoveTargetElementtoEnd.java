package MatrixPattern;

import java.util.Arrays;

public class MoveTargetElementtoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,2,2,3,0,4,2};
		
		int tar = 3;
		
		int non_target_element_count = traverseEnd(a,tar);
		System.out.println(Arrays.toString(a));
		System.out.println( non_target_element_count );
		
		

	}

	private static int traverseEnd(int[] a, int tar) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = a.length-1;
		int temp = 0;
		
		while(start<=end) {
			
			// In left we encountered non-target, so keep moving until you get target
			if(a[start]!=tar) {
				start++;
				
			}
			// In right we encountered target, so keep moving until you dont get target
			
			else if(a[end]==tar) {
				end--;
				
			}
		//swap method when we get target is in left and non-target is in right 
			else if(a[start]==tar &&a[end]!=tar) {
				temp = a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
				
				
			}
		}
	
		
		int non_target_element_count = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]==tar) {
				 non_target_element_count = i;
				 break;
			}
		}
		
		
		return  non_target_element_count 	;
	}

}
