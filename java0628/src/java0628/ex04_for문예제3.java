package java0628;

import java.util.Scanner;

public class ex04_for문예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 수 : ");
		int b = sc.nextInt();
		
		int s = b;
		int l = a;
		
		if (a<b) {
			s = a;
			l = b; 					
		}
		
		for(int i=s; i<=l; i++) {
			System.out.println(i);
		}

	
		
	}

}
