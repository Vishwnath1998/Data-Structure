	package string;

public class duplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Automation";
		
	
		char[]arr = s1.toCharArray();
		
		int count =  0 ; 
		
		for(int i = 0 ; i<arr.length;i++) {
			
			for(int j = i+1 ; j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("Duplicate string is "+ arr[i]);
					count++;
				}
			}
		}
		
		System.out.println("Total count is " + count);
		
	}

}
