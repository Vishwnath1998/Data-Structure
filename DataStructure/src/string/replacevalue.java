package string;

public class replacevalue {
	
	public static String replaceword(String s1) {
		
		
		int count = 0 ;
		
		StringBuilder sBuilder = new StringBuilder(s1);
		
		for(int i = 0 ; i<sBuilder.length();i++) {
			
			
			if(sBuilder.charAt(i)=='E') {
				
				count++;
			}
			if(count==2) {
				
				sBuilder.setCharAt(i, '#');
				break;
			}
		}

		
		return sBuilder.toString();
		

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(replaceword("BOOKEEPER"));
		
			}
	
}




//Online Java Compiler
//Use this editor to write, compile and run your Java code online
//import java.util.*;
//class Main {
// public static void main(String[] args) {
//     
//     String s1 = "BOOKEEPRF";
//     int count = 0 ; 
//     char [] data = s1.toCharArray() ; 
//     
//     StringBuilder sb = new StringBuilder(s1) ; 
//     
//     for( int i = 0 ; i < data.length ; i++){
//         
//         if(data[i]=='E'){
//             
//             count++;
//         }
//   
//     if(count == 2){
//       sb.setCharAt(i , '#');
//       break;
//     }
//       
//   }
//   
//    System.out.println(sb);
// }
//}
//     
