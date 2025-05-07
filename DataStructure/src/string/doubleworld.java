package string;

public class doubleworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		
		StringBuilder charBuilder = new StringBuilder();
		
		char[]arr = s1.toCharArray();
		
		for(int i = 0 ; i<arr.length;i++) {
			
			if(arr[i]!= 'l' ) {
				
				charBuilder.append(arr[i]).append(arr[i]);
			}else {
				
				charBuilder.append(arr[i]);
			}
		}	
		
		System.out.println(charBuilder);

	}	

}
