package java0701;

import java.util.Random;

public class ex02_Randomarray {
	
	public static void main(String[] args) {
		//10칸짜리 정수형 배열을 만들고
		//1~20 사이의 난수로 초기화해보자.
		
		int[] arr = new int[10];
		
		Random rd = new Random();  //난수 생성하는 데이터타입
		int number = rd.nextInt(20)+1;
		System.out.println(number);
		
		// 난수로 초기화하기
		for(int i =0; i<=9; i++) {
			arr[i] = rd.nextInt(20)+1;
		}
		
		// 배열 값 확인
		for(int i =0; i<=9; i++) {
		System.out.print(arr[i]+", ");
		}
		
		
	}
}
