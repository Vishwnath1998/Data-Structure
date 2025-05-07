	package string;

import java.util.Arrays;
import java.util.function.BiConsumer;

import javax.sound.sampled.ReverbType;

public class countstringwithoutspace {
	
	public static void main(String[]args) {
		
		String s1 = "123fa bf32 11rt";
		
		String rev = " ";
		
		int sum = 0 ;
		
	
		for(int i = 0 ; i<s1.length();i++) {
			
			if(s1.charAt(i)!=' ') {
				
				rev = rev+s1.charAt(i);
			}
		}
		
//		String[]a=s1.split(" ");
//		System.out.println(Arrays.toString(a));
		
		System.out.println(rev);
		
//		char[]arr = rev.toCharArray();
//		
//		for(int i = 0 ;i < rev.length();i++) {
//			
//			if(Character.isDigit(arr[i])) {
//				
//				int k = Character.getNumericValue(arr[i]);
//				 sum = sum+k;
//				
//			}
//			
//		}
		
//		for(int i = 0 ; i < rev.length();i++) {
//			Character current = rev.charAt(i);
//			
//			if(current >= '0' && current <='9') {
//				
//				sum+= current-'0';
//			}
//		}
		
		char[]arr = rev.toCharArray();
		
		for(int i = 0 ; i<arr.length;i++) {
			
			if(Character.isDigit(arr[i])) {
				
				int k = Character.getNumericValue(arr[i]);
				
				sum = sum +k;
			}
			
			
			
		}
		
		
		System.out.println(sum);
		
		
		
	}

}
