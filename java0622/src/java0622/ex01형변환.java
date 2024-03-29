package java0622;

import java.nio.file.spi.FileSystemProvider;

public class ex01형변환 {

	public static void main(String[] args) {
		// 형변환
		// 변수를 다른 데이터타입으로 변경하는 행위
		//byte -> short, int-> double , char-> int 등
		
		// 자동형변환 : 데이터 타입이 자동으로 변경되는 것
		short s = 10;   // 좌변 : 선언 , 우변 : 초기화
		int i = s;      // 작은 공간 -> 큰공간 갈 때는 자동형변환이 일어남.
		// 강제형변환 : 명시적으로 변경할 데이터 타입을 작성해서 강제로 변환하는 것
		long l = 100;
		int i2 = (int)l;   
		
		// char타입 형변환
		char c = 'a'; 
		int i3 = c;  // 자동 형변환
		System.out.println(i3);
		System.out.println(c+1);         // 연산에서도 자동형변환
		System.out.println((char)(c+1));
		
		c++;
		System.out.println(c);  // ++ <=> += 1 
		
		c = (char) (c+1);
		System.out.println(c);
	}

}
