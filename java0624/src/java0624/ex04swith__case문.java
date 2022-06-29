package java0624;

import java.util.Scanner;

public class ex04swith__case문 {

	public static void main(String[] args) {
		// switch_case 사용하기
		// 간단 챗봇 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력해주세요 : ");
		String str = sc.nextLine();     // 띄어쓰기를 포함한 문자열 입력	
		
		switch (str) { 
		case "안녕":
			System.out.println("안녕하세요!");
			break;
		case "배고파":
			System.out.println("나도..");
			break;
		default:
			System.out.println("무슨 말인지 모르겠어..");
			break;
		}
		
	}

}
