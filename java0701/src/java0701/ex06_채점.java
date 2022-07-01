package java0701;

import java.util.Scanner;

public class ex06_채점 {

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
		
		System.out.println("");
		
		int score = 0;
		
		int[] ans = {1,4,3,2,1};
		int[] s = {15,25,30,20,10};
		
		for(int i=0;i<=4;i++) {
			if (ans[i]==arr[i]) {
				System.out.print("O ");
				score+=s[i];
			}else {
				System.out.print("X ");
			}
		}
		
		System.out.println("");
		System.out.println("총 점수는 "+score+"점 입니다.");

	}

}
