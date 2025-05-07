package string;

public class removespecialcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "123vishu@#";
		
		
		StringBuilder charBuilder = new StringBuilder();
		
		StringBuilder numBuilder = new StringBuilder();
		
		for(int i = 0 ; i <s1.length();i++) {
			
			if(Character.isDigit(s1.charAt(i))) {
				
				int k = Character.getNumericValue(s1.charAt(i));
				
				charBuilder.append(k);
			}else {
				
				if(Character.isAlphabetic(s1.charAt(i))) {
					
					numBuilder.append(s1.charAt(i));
				}
			}
			
			
			
			
		}
		
		
		String data = charBuilder.toString();
		
		String num = numBuilder.toString();
		
		
		System.out.printf(data);
		System.out.printf(num);

	}

}
