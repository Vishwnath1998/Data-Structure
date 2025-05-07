package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet newobj = new HashSet<>();
		
		newobj.add("Vishu");
		newobj.add("Vishuwnath");
		newobj.add("Vishuwa");
		
		
		Iterator itsIterator = newobj.iterator();
		
		while (itsIterator.hasNext()) {
			
			String name = (String) itsIterator.next();
			
			System.out.println(name);
			
			
			
		}
	}

}
