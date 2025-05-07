package sorting.Code;

public class InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 99;
		int index = infinite(num);
		System.out.println("index found::"+index);
		

	}

	private static int infinite(int num) {
		// TODO Auto-generated method stub
			
		int start = 0;
		int end = 1;
		
		while(end<=num) {
			System.out.println("end:: "+end);
			end = 2*end;
		}
		
		System.out.println("END::"+end);
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(mid==num) {
				return mid;
			}
			
			if(mid<num) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}

}
