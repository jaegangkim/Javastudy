package java0627;

import java.util.Scanner;

public class ex04_while문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int n = -1;
		
		while (num>=0 && num <=100) {
			System.out.println("숫자를 입력하세요");
			sum += num;
			n++;
			num = sc.nextInt();
			
		}
		
		System.out.print("합계 : "+sum);
		System.out.println(" 평균 : "+sum/(float)n);
		
		
		/*
		while(true) {
			if문 써서 100초과되면 break
		}
		*/
		
		
		
	}

}
