package java0701;

public class ex2_완전수 {

	public static void main(String[] args) {
		
		for(int n =1; n<=1000; n++) {
			int sum= 0;
			for(int i=1; i<=n-1; i++) {
				
				if (n%i==0) {
					sum += i;
				}
			}
			if (n ==sum) {
				System.out.println(n);
				
			}
			
		}

		
		
		
		
	}

}
