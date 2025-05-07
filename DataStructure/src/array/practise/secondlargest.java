package array.practise;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]array = {2,3,4,1,5,6};
		
		for(int i = 0 ; i<array.length;i++) {
			
			for(int j = i+1 ; j < array.length; j++) {
				
				if(array[i]>array[j]) {
					
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp ; 
				}
			}
		}
		
		// 1 , 2 , 3, 4, 5, 6
		// 6 , 5, 4, 3, 2, 1
		System.out.println(array[4]); // Second laregest
		
		
		for(int i = 0 ; i<array.length-1 ; i++) {
			
			for(int j = 0 ; j<array.length-1-i;j++) {
				
				if(array[j]<array[j+1]) {
					
					
					int temp = array[j];
					
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(int value : array) {
			
			System.out.print(" "+ value);
		}
		

	}

}
