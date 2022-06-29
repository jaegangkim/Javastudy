package java0624;

import java.util.Scanner;

public class ex01_조건문예제3 {

	public static void main(String[] args) {
		//사용자로부터 성적을 입력받아 학점으로 변환해보자.
		//90~100 : A
		//80~89 : B
		//70~79 : C
		//70미만 : D
		// 리팩토링 : 코드를 재구축하는 행위
		Scanner sc = new Scanner(System.in);
		System.out.print("성적입력 : ");
		int grade = sc.nextInt();
		
		if (grade>=90) {
			System.out.println("A학점입니다.");
		}else if (grade>=80) {
			System.out.println("B학점입니다.");
		}else if (grade>=70) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("D학점입니다.");
		}
		
		

	}

}
