package string;

import java.awt.desktop.OpenURIEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagramlist {

	public static void main(String[] args) {
		
		String[] array = { "run" , "nur" , "race", "cera"};
		
		ArrayList<String> obj = new ArrayList<>();
		
		for(int i = 0 ; i<array.length;i++) {
//			
//			System.out.println(array[i]);
			
			String s1 = array[i];  // run
			
			char[] a = s1.toCharArray();
			
			Arrays.sort(a);  //nru
			
			for(int j = i+1 ; j<array.length;j++) {
				
				String s2 = array[j];
				
				char[] b = s2.toCharArray();
				
				Arrays.sort(b);
				
				if(Arrays.equals(a, b)) {
					
					obj.add(s1);
					obj.add(s2);
				}
			
			}
			
		
//			System.out.println(Arrays.toString(a));
		}
		
		System.out.print(obj);
		
		// TODO Auto-generated method stub

	}


}
