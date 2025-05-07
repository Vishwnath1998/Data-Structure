package string;

public class totalstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "123vishu";
		
		int sum = 0 ;
		
//		char[] num = s1.toCharArray();  // 1 2 3 v i s h u
		
		for(int i = 0 ; i<s1.length();i++) {
			
			char currentchar = s1.charAt(i);
			
			if(currentchar >='0' && currentchar <='9') {
				
				sum += currentchar - '0';
			}
			
//			if(Character.isDigit(num[i])) {
//				
//				int k = Character.getNumericValue(num[i]);
//				
//				sum = sum + k ; 
//				
//			}
			
			
			
		}
		
		System.out.println(sum);

	}
	
}
