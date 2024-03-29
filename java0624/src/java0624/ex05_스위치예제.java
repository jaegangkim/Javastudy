package java0624;

import java.util.Scanner;

public class ex05_스위치예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		/* 
		반복문 +
		if (month >12) {
			System.out.print("1~12월 입력 : ");
			month = sc.nextInt();     
		}           */
		String season;
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;

		default:                                           // 생략 가능
			season = "가을";
			break;
		}
		System.out.println(month+"월은 "+season+"입니다!");
		
	}

}
