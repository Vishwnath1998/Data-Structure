package array.practise;

import java.util.Arrays;


public class RotateArayLast {

	/**
	 * @param args
	 * @return 
	 */
	public static int main(String[] args) {
		// TODO Auto-generated method stub

//			int []a = {1,2,3,4,5};
//			
//			int temp = a[a.length-1];
//			for(int i = a.length-1;i>0;i--) {
//				
//				a[i]=a[i-1];		
//			}
//			a[0]=temp;
//			System.out.println(Arrays.toString(a));
	int n = 5;
	if(n<=1) {
		return n;
				
	}
	return (n-1)+(n-2);

}
}
