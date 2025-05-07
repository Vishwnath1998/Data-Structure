package sorting.Code;

public class TwoMatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,4},{1,2,3},{2,3,4}};
		int sum = 0;
		
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length;j++) {
				
				if(i ==j) {
					sum=sum+ a[i][j];
				}
				
				System.out.print(a[i][j]);
				
			}
			
			System.out.println();
				}
		System.out.println(sum);
		
		
		
		

	}
	

}




//From Kinnukumar Singh to Everyone 10:35 PM
//🤸‍♂️
//From Geekster Class to Everyone 10:55 PM
//package dsa_practise_6th_April_2022;
//
//public class SetMatrixZero {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int a[][] = {{1,1,1},{1,0,1},{1,0,1}};
//		
//		int row = -1;
//		int column = -1;
//		
//		boolean found = false;
//		
//		for(int i =0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[i][j] == 0)
//				{
//					found = true;
//					row = i;
//					column = j;
//				}
//			}
//		}
//		
//		
//		//row 
//		if(found==true)
//		{
//			for(int j =0;j<a.length;j++)
//			{
//				a[row][j] = 0;
//			}
//			
//			//column
//			for(int i=0;i<a.length;i++)
//			{
//				a[i][column] = 0;
//			}
//			
//		}
//		
//		
//		for(int i =0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//				
//			}
//			System.out.println();
//		}
//		
//	}
//
//}

