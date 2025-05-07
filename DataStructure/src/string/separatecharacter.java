package string;

import javax.sound.midi.Soundbank;

public class separatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "123vish@";
		
		
		StringBuilder charBuilder = new StringBuilder();
		
		StringBuilder digitBuilder  = new StringBuilder();
		
		StringBuilder speaBuilder = new StringBuilder();
		
		
		char[]array = s1.toCharArray();
		
		for(int i = 0 ; i <array.length;i++) {
			
			
			if(Character.isDigit(array[i])) {
				
				int k  = Character.getNumericValue(array[i]);
				
				
				
				digitBuilder.append(k);
				
			
				
			}else {
				
				if(Character.isAlphabetic(array[i])) {
					
					charBuilder.append(array[i]);
				
					
				}else {
					
					speaBuilder.append(array[i]);
				}
			}
			
			
			
			
		
			
			
			
			
		}
		
		System.out.println(charBuilder);
		System.out.println(digitBuilder);
		
		System.out.println(speaBuilder);
		
	
	
		String word = charBuilder.toString();
		String num = digitBuilder.toString();
		String space = speaBuilder.toString();
		
//		System.out.println(word);
//	
//		System.out.println(num);
//	
//		System.out.println(space);
		
		
		
		
	}

}
