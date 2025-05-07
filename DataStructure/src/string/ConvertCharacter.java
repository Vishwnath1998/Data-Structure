package string;

public class ConvertCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "HELLO";
		StringBuilder sBuilder = new StringBuilder();
		
//		char[]array = s1.toCharArray();
		
		for(int i = 0 ; i<s1.length();i++) {
			
			char c = s1.charAt(i);
			
			if(Character.isUpperCase(c)) {
				
				sBuilder.append(Character.toLowerCase(c));
			}else {
				
				sBuilder.append(c);
			}
		}
		
		String lowercase = sBuilder.toString();
		
		System.out.println(lowercase);

	}

}
