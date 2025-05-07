package string;

public class removeduplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Automation";
		
		char[]array = s1.toCharArray();
		
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i<array.length;i++) {
			
			boolean  repeated = false;
			for(int j = i+1 ; j<array.length;j++) {
				
				if(array[i]==array[j]) {
					
					repeated=true;
					break;
				}
			}
			
			if(!repeated) {
				
				sb.append(array[i]);
			}
			
	
		}
		System.out.println(sb);

	}

}
