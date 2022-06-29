package java0624;

import java.util.Scanner;

public class ex03_마트계산대_프로그램 {

	public static void main(String[] args) {
		// 선물세트를 구매 할 때 얼마를 지불해야 하는지
		// 계산하는 프로그램을 만들어보자.
		// 1. 선물세트의 기본가격 : 10000원
		// 2. 11개 이상 구매 시에는 10% 할인
		// 3. 10개들이로 구매를 하면 5% 추가 할인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품 개수 : ");
		int n = sc.nextInt();
		
		int price = 10000;

		if( n % 10 == 0) {
			price -= price*0.05f;
		}
		if ( n >= 11 ) {
			price -= price*0.1f;
		}
		
		System.out.println("가격은 "+n*price+"원 입니다.");
		
		
	}

}
