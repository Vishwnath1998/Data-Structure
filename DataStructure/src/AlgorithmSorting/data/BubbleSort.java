package AlgorithmSorting.data;

//Bubble Sort---> Comparing adjacent Element to each other  and swap them to 
//arrange in order number 
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,34,2,4,65,7,8,89};
		
		int temp = 0;
		
		int sort = Bubble(a);
		System.out.println(sort);
			

	}

	private static int Bubble(int[] a) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
		}
		
		System.out.println("Sorted List Number");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			System.out.println();
		}
		return 0;
	}

}
