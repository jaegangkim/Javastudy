package java0623;

import java.util.Scanner;

public class ex07_조건문예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int a = sc.nextInt();
		
		System.out.print("전자계산기 구조 : ");
		int b = sc.nextInt();
		
		System.out.print("OS : ");
		int c = sc.nextInt();
		
		System.out.print("데이터통신 : ");
		int d = sc.nextInt();
		
		System.out.print("소프트웨어공학 : ");
		int e = sc.nextInt();
		
		if (a+b+c+d+e >= 60 && a>=8 && b>=8 && c>=8 && d>=8 && e>=8) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("불합격입니다!");
		}   

	}

}
