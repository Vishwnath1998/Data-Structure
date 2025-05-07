package string;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.HashMap;

public class occurancewithoutspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "Vishu is Don is don";
		
		String[] a =  s1.split(" ");
		
		System.out.println(Arrays.toString(a));
		
		
		HashMap<String ,Integer>map = new HashMap<>();
		
		for(String data : a) {
			
			if(!map.containsKey(data)) {
				
				map.put(data, 1);
			}else {
				
			    int value = map.get(data);
			    
			    map.put(data , value+1);
			}
			
			
			
		}
		
		System.out.println(map);
		// k = vishu ,k = is , k = good
		// duplicate value
		for(String k:map.keySet()) {
			
			if(map.get(k)>1) {
				
				System.out.println(k);
			}
			
//			System.out.println(k+" "+map.get(k));
		}
		
		
		

	}

}
