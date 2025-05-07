package Collection;

import java.util.*;
import java.util.Map.Entry;

import javax.management.ValueExp;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap newobj = new HashMap();
		
		
//		Map<String, Integer> sbMap = new HashMap<>();
		
			
//		newobj.put("vishu", "test");
//		newobj.put("vishu", "test");
//		newobj.put("vishu", "testng");
//		newobj.put("ash", "pune");
//		newobj.get("ash");
//		
//		System.out.println(newobj);
//		
//		System.out.println(newobj);
		
		//o/p - {vishu=testng} ;
		
//		
//		Map newsubMap = new TreeMap();
//		
//		newsubMap.put("ash", "123");
//		
//		newsubMap.put("bsakar","1222");
//		
//		
//		newsubMap.put("cat", "1223");
//		
//		System.out.println(newsubMap);
		
		
		// {ash=123, bsakar=1222, cat=1223} TreepMap present in sorted order according to natural ordering
//		
//	    Map newsubMap = new LinkedHashMap();
//		
//		newsubMap.put("ash", "123");
//		
//		newsubMap.put("bsakar","1222");
//		
//		
//		newsubMap.put("cat", "1223");
//		
//		System.out.println(newsubMap);
		
		// {ash=123, bsakar=1222, cat=1223}  LinkeddHashMap present in user requirement according to user how they given 
		// by put method
		
		
//		
//		
//	    Map newsubMap = new HashMap();
//		
//	    newsubMap.put(null,null);
//		newsubMap.put("ash", "123");
//		newsubMap.put("ash", "1234");
//		newsubMap.put("ash", "12345");
//		
//		newsubMap.put(null,"1222");
//		newsubMap.put(null,null);
//		
//		newsubMap.put("cat", "1223");
//		
//		System.out.println(newsubMap);
//		
		
		Map<String, String> newobj = new HashMap<String, String>();
		
		newobj.put("vishu", "test");
		newobj.put("vishuwa", "test");
		newobj.put("vishuwamath", "testng");
		
		
		// Entry set , // keyset //entry values
		
		// retrive only value
		
		for(String key : newobj.keySet()) {
			
//			System.out.println(key);
			
//			o/P : vishuwa
//			vishuwamath
//			vishu

		}
		
		// key and values  - Entry set
		
	for(Entry<String, String> entry : newobj.entrySet()) {
			
//			System.out.println(entry.getKey()+ "" + entry.getValue());
			
//			// o/p :   vishuwatest
//			vishuwamathtestng
//			vishutest

	}
		
		
	for(String entry : newobj.values()) {
		
//		System.out.println(entry);
		
		//op : test
//		testng
//		test

		
		
	}
		
		
		
		
		

	}

	
}
