package java0627;

import java.util.Scanner;

public class ex05_while문예제2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int n = 1;
		
		while(now > goal) {
			
			System.out.print(n+"주차 감량 몸무게 : ");
			int less = sc.nextInt();
			n++;
			now -= less;
		}
		System.out.println(now+"kg 달성!! 축하합니다!");
		
	}
}
