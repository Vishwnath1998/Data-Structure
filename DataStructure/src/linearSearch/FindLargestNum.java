package linearSearch;

public class FindLargestNum {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,10,14,7};
		
		
		int max = a[0];
		
		int maxNum = maximunNumArray(a,max);
		System.out.println(maxNum);
		

		}

	private static int maximunNumArray(int[] a, int max) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
//				return max;
			}
//			return max;
		}
//		return 0;
		return max;
	}


	}


