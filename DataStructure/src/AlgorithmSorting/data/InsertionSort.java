package AlgorithmSorting.data;

import java.util.Arrays;

//Insertion Sort
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 12, 2, 13, 1, 19, 32 };

		int[] b = insertionsort(a);
		System.out.println(Arrays.toString(b));

	}

	private static int[] insertionsort(int[] a) {
		// TODO Auto-generated method stub
//		
//		//sorted Array 
//		for(int i =1;i<a.length;i++) {
//			int key =a[i];
//			int j = i-1;
//		
//			// unsorted Array Loop
//
//		while(j>=0 && a[j]>key) {
//			a[j+1]=a[j];
//			j--;
//			
//		}
//		
//		a[j+1]=key;
//		}
//		return a;
		
		
		for(int i = 0;i<a.length;i++) {
			int key = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1]=key;
		}
		return a;
		
	}

}

//ctr+shift+f
