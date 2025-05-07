package MatrixPattern;

public class Firstoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,2,2,2,4,5,6,4,5,6};
		
		int target = 6;
		
		int index = findfirstOccurance(a,target);
		System.out.println(index+" ");
		
		

	}

	private static int findfirstOccurance(int[] a, int target) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = a.length-1;
		
			while(start<=end) {
				int mid = start+(end-start)/2;
				
				if(a[mid]==target) {
					if(mid==0) {
						return 0;
					}
				
				else if(a[mid-1]!=target) {
					return mid;
				}
				}
				else if(target>a[mid]) {
					start = mid+1;
				}else {
					end=mid-1;
				}
			}
				return -1;
		
	}
			
	}



