package recursiveMethod;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 123456;
		int count = 0;

		int counter =coundigit(n,count); 
		System.out.println(counter);
		
		
		

	}

	private static int coundigit(int n, int count) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			return count;
		}
		else {
			
					
			count++;
			return coundigit( n/10 , count);
		}

}
}
