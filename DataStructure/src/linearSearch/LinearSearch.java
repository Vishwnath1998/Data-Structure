package linearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,};
		
		int n =1;
		
		int index = SearchIndex(a,n);
		System.out.println(index);
		
		
	
		
		

	}

	private static int SearchIndex(int[] a, int n) {
		// TODO Auto-generated method stub
		
		for(int i= 0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println("Element Found At Index");
				return i;
			}
		}
		
		return -1;
		
		
	}

}
