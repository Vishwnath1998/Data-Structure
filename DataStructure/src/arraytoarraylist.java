import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class arraytoarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] aStrings = { "red", "grees" };

		List list = new ArrayList(Arrays.asList(aStrings));

		System.out.println(list);

		Map newobj = new HashMap();

		newobj.put("a", "test");
		newobj.put("b", "test");
		newobj.put("c", "testng");
		newobj.put("d", "testng");
		
		
		System.out.println(newobj);
				
		// HashMap convert to Arraylist
		ArrayList newobj1 = new ArrayList(newobj.keySet());
		
		System.out.println(newobj1);

	}

}
