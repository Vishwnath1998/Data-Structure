package array.practise;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Sizefind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int number[] = new int[size];
		
		
		
		for(int i = 0 ; i<size ; i++) {
			
			number[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		for(int i = 0 ; i<number.length;i++) {
			
			if(number[i]==x) {
				
				System.out.println("x found at index :" + i);
			}
			
		}
		
		
		//int[] marks = new int[3];
		
		
		
//		marks[0]=97;
//		marks[1]=98;
//		marks[2]=99;
		
//		for(int i =0; i<3; i++) {
//			
//			System.out.println(marks[i]);
//		}
		

	}

}
