package java0623;

public class ex03논리연산자 {

	public static void main(String[] args) {
		// 참 거짓 표현하는 boolean 타입을 계산하는 연산자
		// and , or, not
		
		// and : 양쪽이 모두 참인 경우 참이 나옴
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false&&false);
		System.out.println(false && true);
		
		// or : 양 쪽 중에 하나라도 참이 경우에 참이 나옴
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(false || true);
		
		// not : 논리타입 값을 반대로 바꿈
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
	}

}
