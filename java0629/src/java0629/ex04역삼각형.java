package java0629;

public class ex04역삼각형 {

	public static void main(String[] args) {
		
		for(int i =1; i<=5 ; i++) {
			for(int k =2; k<=i; k++) {
				System.out.print(" ");
			}
			for(int j =10; j>=i*2 ; j--) {
				System.out.print("*");
			}
			
		System.out.println();
		}
	}
	
}

