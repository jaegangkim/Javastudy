package java0627;

import java.util.Scanner;

public class ex01_조건문예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> ");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			choice = 800;
		}else if (choice == 2) {
			choice = 500;
		}else {
			choice = 1500;
		}
		
		
	
		if (money < choice) {
			System.out.println("돈이 부족해요ㅠㅠ");
		}else {
			int change = money - choice;
			System.out.println("잔돈 "+change+"원");
			int a = change / 1000;
			int b = change%1000 / 500;
			int c = change%500 / 100;
			System.out.print("천원 :"+a+"개  오백원 :"+b+"개  백원: "+c+"개");
			
		}
		

	}

}
