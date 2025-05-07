	package array.practise;

public class comparetwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a = {1,2,3};
		int[]b = {1,2,4};

		
		boolean flag = true;
		
		if(a.length==b.length) {
		
		for(int i = 0 ; i<a.length-1;i++) {
			
			if(a[i]!=b[i]) {
				
				flag = false;
			}
				
				
		}
	}
		else {
			
			flag = true;
		}
		if(flag==false) {
				
			System.out.println("Arrays are not Equal");
		}
		else {
		System.out.println("Arrays are  Equal");
		
	}
		
	}

}
