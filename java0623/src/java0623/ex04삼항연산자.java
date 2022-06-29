package java0623;

import java.util.Scanner;

public class ex04삼항연산자 {

	public static void main(String[] args) {
		// 변수에 들어있는 값이 짝수인지 홀수인지 판단하는 프로그램
		int number = 10;
		System.out.println(number%2 == 0 ? "짝수" : "홀수"); 
		
		
		

		// 예제 1
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		
		
		System.out.print("두 수의 차 : ");
		System.out.println(num1<num2? num2-num1 : num1-num2);
		
		
		
		// 예제 2
		System.out.println("노동 시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int money = time>8 ? 5000*8 + 7500*(time-8) : 5000*time;
		System.out.println("총 임금은 "+(int)money+"원 입니다");
		
		
		
		
		
		

	}

}
