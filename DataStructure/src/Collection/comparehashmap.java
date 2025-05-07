package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class comparehashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map sbMap = new HashMap();
		
		
		sbMap.put("a", "test");
		sbMap.put("b", "test");
		sbMap.put("c", "testng");
		
		

		Map newobj = new HashMap();
		
		
		newobj.put("a", "test");
		newobj.put("b", "test");
		newobj.put("c", "testng");
		newobj.put("d", "testng");
		
		
		System.out.println(sbMap.keySet().equals(newobj.keySet()));  // True boz all keys are same

		// Remove Extra keys
		
//		HashSet combinekey = new HashSet(sbMap.keySet());
//		
//		
//		combinekey.addAll(newobj.keySet());
//		
//		System.out.println("combine both " + combinekey);
//		
//		
//		combinekey.removeAll(sbMap.keySet());
//		
//		
//		System.out.println("remove all" + combinekey);
		
		
		
		// Remove Extra Value
		
		System.out.println(sbMap.keySet().equals(newobj.values())); 
		
		
		
		// findout common keys
		
		HashSet uncommon = new HashSet(sbMap.keySet());
		
		uncommon.addAll(newobj.keySet());
		
		System.out.println("uncommon" + uncommon);
		
		HashSet common = new HashSet(sbMap.keySet());
		
		common.retainAll(newobj.keySet());
		
		System.out.println("common"+ common);
		
		
		uncommon.removeAll(common);
		
		
		System.out.println("take uncommon" + uncommon);
	
			
		
		
	
		

}
	
}
