package sorting.Code;

public class FindSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 121;
		
		int root = SquareRoot(num);
		System.out.println(root);
//		System.out.println(Math.sqrt(num));
		
		
		

	}

	private static int SquareRoot(int num) {
		
		// TODO Auto-generated method stub
		
		for(int i = 0;i<num/2;i++) {
			if(i*i==num) {
				return i;
			}
		}
		return -1;
	}
}
		
//		int start = 0;
//		int end = num;
//		
//		int ans = 0;
//		
//		while(start<=end) {
////			int mid = start +(end-start)/2;
//			
//			int mid = (start+end)/2;
//			
//			if(mid*mid ==num) {
//				return num;
//			}
//			else
//			if(num>mid*mid) {
//				
//				//Check Right Side
//				start = mid+1;
//				ans = mid;
//			}
//			else {
//				//Check Left Side
//				end = mid-1;
//			}
//		}
//		return ans	;
//	}



