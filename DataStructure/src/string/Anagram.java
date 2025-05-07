	package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
		
	
	public static boolean anagram(String s1 , String s2) {
		
		if(s1.length()!=s2.length()) {
			
			return false;
		}
		else {
			
			char[]array1   = s1.toCharArray();
			char[]array2   = s2.toCharArray();
			
			
			Arrays.sort(array1);
			
			System.out.println(array1);
			Arrays.sort(array2);
			
			return Arrays.equals(array1, array2);
			
			
		}
		
					
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(anagram("eat", "teaa"));

	}

}
