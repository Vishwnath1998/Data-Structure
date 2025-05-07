package string;

public class reversewordwithoutchangeposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello sir";
		
		String [] array = s1.split(" ");
		
		
		for(String word : array) {
			String reverse = " ";
			
			for(int i = word.length()-1 ; i>=0 ; i--) {
				
				reverse = reverse + word.charAt(i);
			}
			
			System.out.println("" + reverse);
		}

	}

}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
