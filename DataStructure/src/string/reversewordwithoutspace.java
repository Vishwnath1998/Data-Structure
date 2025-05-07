package string;

public class reversewordwithoutspace {
	
	
	public static void main(String[]args) {
		
		
		String s1 = "hello gello pillo";
		
		String revString  = " ";

		 
		
		for(int i = 0 ; i<s1.length();i++){
			
			if(s1.charAt(i)!=' ') {
				
				revString = revString+s1.charAt(i);
			}
			
			
		}
		System.out.println(revString);
		
		String rev ="";
		
		for(int i = revString.length()-1 ; i>=0 ; i--) {
				
			rev = rev+revString.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}
	
	
	
	

}
