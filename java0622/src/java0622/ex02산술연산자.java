package java0622;

public class ex02산술연산자 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //몫
		System.out.println(a%b); //나머지
		
		float num1 = 3.14f;
		float num2 = 16.999f;
		
		System.out.println(a+num1);  // 둘다 4byte. 예외적으로 int가 float으로 자동행변환 됨.
		
		// char은 한글자만 담을 수 있음.
		// 여러글자를 사용 할 때는 String 타입을 사용.
		char c= '안';
		String str = "안녕하세요"; // 큰따옴표 사용
		String num3 = "100";
		
		System.out.println(a+num3); // String 으로 자동 행변환이 일어남
		
		
	}

}
