package Collection;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		List<String> fruits = new ArrayList<>();
		
		List<String>fruits = new LinkedList<>();
		
		fruits.add("bpple");
		fruits.add("aanana");
		fruits.add("cherry");
		
		
		System.out.println(""+fruits);
		
		Collections.sort(fruits);
		
//		System.out.println(" "+fruits);
		

	}

}
