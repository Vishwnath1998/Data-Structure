package MatrixPattern;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]arr = {{0,1,0},{0,1,0},{0,1,0}};
		
		int flag = 1;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(arr[i][j]!=0) {
					flag = 0;
					break;
					
				}
				
				
				
			}
			if(flag==1) {
				System.out.println("its identity matrix");
				
			}
			else {
				System.out.println("Its not");
			}
		}
		
		

	}

}
