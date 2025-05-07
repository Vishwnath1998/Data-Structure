import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class iteratorclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList(Arrays.asList("a", "b", "c", "d"));
		
		// Iterator move forwared only
		
		

//		Iterator its = list.iterator();

//		while (its.hasNext()) {
//
//			System.out.println(its.next());
//		}

		
		
		
		// List Iterator moved forward and backward
		
		List<String> name = new LinkedList<>();
		
		name.add("learn");
		name.add("leave");
		name.add("apply");
	
		
		
		ListIterator <String>iterator = name.listIterator();
		
		
		while (iterator.hasNext()) {
			
			iterator.next();
			
		}

		while (iterator.hasPrevious()) {

			System.out.println(iterator.previous());
		}

	}

}
