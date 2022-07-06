package java0705;

import java.util.Scanner;

public class ex08_이차원배열예제3 {

	public static void main(String[] args) {
			int[][] array = new int[3][];
			array[0] = new int[5];
			int[] answer= {1,4,3,2,1};
			array[1] = answer;
			int[] score = {15,25,30,20,10};
			array[2] = score;
			
			int[] input = new int[5];
				
			Scanner sc = new Scanner(System.in);
			System.out.println("==채점하기==");
			System.out.println("답을 입력하세요");
				
			for(int i=0;i<=4;i++) {
				System.out.print((i+1)+"번답 >> ");
				array[0][i] = sc.nextInt();
			}
			
			int sum = 0;
			for (int i = 0; i < array[1].length; i++) {
				if(array[0][i]==array[1][i]) {
					System.out.print("O ");
					sum += array[2][i];
				}else {
					System.out.print("X ");
				}
			}
			
			System.out.println("총점 : "+sum);
				
		
		
		
		
		

	}

}
