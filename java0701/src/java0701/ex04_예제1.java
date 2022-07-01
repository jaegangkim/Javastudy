package java0701;

import java.util.Random;

public class ex04_예제1 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		Random rd = new Random();
		for(int i =0; i<=9; i++) {
			arr[i] = rd.nextInt(100);
		}
		
		int n = 0;
		System.out.print("array에 들어있는 홀수는 ");
		for(int j=0;j<arr.length;j++) {
			if (arr[j] % 2==1) {
				System.out.print(arr[j]+" ");
				n++;
			}
		}
		System.out.println("이며, 총"+n+"개 입니다.");
		

	}

}
