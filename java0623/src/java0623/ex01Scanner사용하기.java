package java0623;

import java.util.Scanner;   //Scanner를 사용하기 위한 import

public class ex01Scanner사용하기 {
	public static void main(String[] args) {
		// Scanner : 사용자로부터 입력을 받을 수 있는 데이터타입
		// 변수의 선언과 초기화
		int num = 11;
		int num2;            // 변수 선언만 하고
		num2 = 100;          // 나중에 초기화 가능
		
		System.out.println("정수입력 >>");
		Scanner sc = new Scanner(System.in);   
		int input = sc.nextInt(); // 정수를 입력 받음
		
		System.out.println(input);
		
		//글자 입력 받기
		System.out.println("좋아하는 과일을 입력하세요>>");
		String inputStr = sc.next();
		System.out.println(inputStr);
		
		
		
		
	}
}
