package trycatchablock;

import javax.sound.midi.Soundbank;

public class trycatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		try {
//			
//			//System.out.println("error");
//		
//			System.out.println(10/0);
//			
//			System.out.println("error");			
//		} //catch (Exception e)
//		
//		
//		catch (NullPointerException e) {
//			// TODO: handle exception
//			
//			System.out.println("nullpointer");
//		}
//		
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}{
//			//
//			
//			System.out.println("exceptoin ar");
//		}
//		
//		System.out.println("outofblock");

	
	

		
//		
//		try {
//			
//			System.out.println("hi");
//			System.out.println(20/0);
//			System.out.println("vishu".charAt(29));
//			
//			
//		} catch (StringIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			
//			System.out.println("string");
//			System.out.println(10/0); // it wont run next execution
//		}
//		catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println(20/0);
//			
//			System.out.println("arithmatic");
//		}
//		
//		System.out.println("rest of code");
		
		
		
	/*	********** Finally ******************** */
		
		
//		try {
//			
//			System.out.println(10/0);
//			
//		}
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//			
//			
//			System.out.println(e);
//			System.out.println(10/0);
//		}
		
//		catch (ArithmeticException e) {
//			
//			
//			System.out.println("Arithmatic");
//			// TODO: handle exception
//		}
//		
//		finally {
//			
//			System.out.println("finally block");
//			
//		}
		
		
//		System.out.println(10/0); // here frst run itself found exception whole code nt run
//		System.out.println("hello ji");
//		System.out.println(10/0);
//	try {
//			
//		
//			System.out.println(10/0);
//			
//			System.out.println("exception");   // - This code will not print
//			
//		}
//	
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//			
//			
//			System.out.println(e);
//			System.out.println(10/0);
//		}
//		
//		catch (ArithmeticException e) {
//			
//			
//			System.out.println("Arithmatic");
//			// TODO: handle exception
//			
//			System.out.println(10/0);
//			System.out.println("all over");
//		}
//		
//		finally {
//			
//			System.out.println("finally block");
//			
//		}
		

/******************************************/
		
		
//		System.out.println(10/0);
		int i = 1 ;
		try {
			
//			
//			System.out.println("10");
			i++;
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			++i;
//			System.out.println("vishu".charAt(1));
		}
		finally {
			
			++i;
//			
//			int[] a = {2,3,4,5};
//			
//			System.out.println(a[1]);
//			System.out.println("finally block");
			
			System.out.println(i);
			
			
		}
		
	}
	
}



