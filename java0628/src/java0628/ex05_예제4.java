package java0628;

import java.util.Scanner;

public class ex05_예제4 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("작은 수 입력 : ");
		int a = sc.nextInt();
		System.out.print("큰 수 입력 : ");
		int b = sc.nextInt();
		
		int sum = 0;
		for(int i = a; i<=b ; i++) {
			sum += i;
		}
		System.out.print("누적합 : "+sum);
		
	}
}
