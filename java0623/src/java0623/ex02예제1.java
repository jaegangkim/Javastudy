package java0623;

import java.util.Scanner;

public class ex02예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Java 점수 입력: ");
		int javaScore = sc.nextInt();

		System.out.print("Web 점수 입력: ");
		int webScore = sc.nextInt();

		System.out.print("Android 점수 입력: ");
		int androidScore = sc.nextInt();

		int sum = javaScore + webScore + androidScore;

		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum /3.0f);

	}

}
