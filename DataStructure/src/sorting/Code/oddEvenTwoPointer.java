package sorting.Code;

public class oddEvenTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {2,3,1,56,43,12,23,45	};
		
		segregate(a);
//		System.out.println(a);
		
		

	}

	private static void segregate(int[] a) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = a.length-1;
		
		
		while(left<right) {
			//check even 
			if(a[left]%2 == 1) {
				left++;
			}
			//check Odd
			if(a[right]%2== 0) {
				right--;
			}
			//check condition even or odd Number;
			if(a[left]%2 == 0 && a[right]%2 ==1) {
				int temp = a[left];
				a[left]=a[right];
				a[right]= temp;
				
			}
			
//			for(int i = 0;i<a.length;i++) {
//				System.out.println(a[i]+" ");
//			}
//		System.out.println();
			
		}
		System.out.println(a);
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	
		
		
	}

	
}
