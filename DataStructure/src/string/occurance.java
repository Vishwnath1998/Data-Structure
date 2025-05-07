package string;

import java.util.HashMap;
import java.util.Set;

public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aasehe";
		
		HashMap<Character, Integer>map = new HashMap<>();
		
		char[] data = s1.toCharArray();
		
		for(int i = 0 ; i<data.length;i++){
			
			if(!map.containsKey(data[i])) {
				
				map.put(data[i], 1);
			}else {
				
				int value = map.get(data[i]);
				
//				System.out.println(value);
				
				map.put(data[i], value+1);
				
				
				
			}
			
			
		}
		
		System.out.println(map);
		
		for(Character k: map.keySet()) {
			
			
			// duplicate value 
			if(map.get(k)>1) {
				
				System.out.println(k+":"+map.get(k));
			}
			
			
		}
	}

}
