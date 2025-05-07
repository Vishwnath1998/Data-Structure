package string;

import java.security.PublicKey;

public class reversesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = " I LOVE JAVA ";
		
		
		String[] word = s1.split(" ");
		
//		for(String c : word) {
//			
//			System.out.print(c);
//		}
		
		if(word.length < 3) {
			
//			System.out.println("sentence");
			return;
		}	
		
		System.out.print(word[3]+" ");
		
	   for(int i = word.length-1 ; i>=0; i--) {
		   
		   if(i!=3) {
			   
			   System.out.print(word[i]+" ");
			   
		   }
	   }
		
		
				

	}

}



//String word = " ";
//
//
//for(int i = 0 ; i<s1.length();i++) {
//	
//	if(s1.charAt(i)!=' ') {
//		
//		word = word+s1.charAt(i);
//	}
//	
//	
//	
//}
//System.out.print(word);


//for(int i = s1.length()-1 ; i>= 0 ; i--) {
//	
//	System.out.print(s1.charAt(i));
//}


//String [] word = s1.split(" ");
//
//for(String c : word) {
//	
//	System.out.println(c.toString());
//	
//}
