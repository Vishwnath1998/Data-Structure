package string;

import MatrixPattern.Firstoccurance;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		
		
//		char[]data = s1.toCharArray();
//		
//		for(int i = data.length-1;i>=0 ; i--) {
//			
//			System.out.print(data[i]);
//		}
		
		String rev = " ";
		
		for(int i = 0; i<s1.length() ; i++) {
			
			rev = s1.charAt(i) + rev;
		}
		
		System.out.println(rev);

	}

}
