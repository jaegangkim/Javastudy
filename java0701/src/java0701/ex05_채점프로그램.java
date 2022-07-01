package java0701;

import java.util.Scanner;

public class ex05_채점프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		for(int i =0;i<=4;i++) {
			System.out.print((i+1)+"번 답 >>");
			arr[i] = sc.nextInt();
		}
		System.out.print("입력한 답은 : ");
		for(int i=0;i<=4;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
