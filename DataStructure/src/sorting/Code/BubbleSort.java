package sorting.Code;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5,8,9};
		int s = 10;
		int index = bubbleSort(arr,s);
		System.out.println(index);

	}

	private static int bubbleSort(int [] arr,int s) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			
			
			int mid = (start +	end) /2;
//			System.out.println(mid);
			
			if(arr[mid]== s) {
				return mid;
			}
			
			//check Right Side
				if(s>arr[mid]) {
					start = mid+1;
				}
				else {
					
					
			//Check Left Side
					end = mid-1;
				}
				}	
		return -1;
		
		
	}
		

}

