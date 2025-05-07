package MatrixPattern;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[][] arr = { { 1, 2, 3 }, { 4, 3, 2 }, { 9, 8, 9 } };
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j =0;j<arr.length;j++)
			{
				if(i+j == arr.length-1)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			
			System.out.println();
		}

	}

}
