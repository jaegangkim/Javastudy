package java0629;

public class ex_별찍기과제 {

	public static void main(String[] args) {
		for(int a=1;a<=2;a++) {
			for(int b=1;b<=3-a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=2*a;b++) {
				System.out.print("*");
			}
			for(int b=1;b<=5-2*a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=2*a;b++) {
				System.out.print("*");
			}System.out.println("");
		}
		for(int i =1; i<=6 ; i++) {
			for(int k =2; k<=i; k++) {
				System.out.print(" ");
			}
			for(int j =12; j>=i*2 ; j--) {
				System.out.print("*");
			}
			
		System.out.println();
		}

	}

}
