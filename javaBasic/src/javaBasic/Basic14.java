package javaBasic;

public class Basic14 {
	public static void main(String[] args) {
		
		String a = new String("ABC");
		String b = "DEF";
		b.compareTo(a);           //아스키코드 값 비교
		System.out.println(b.compareTo(a)); // b-a
		
		String x = "ABC";  // 리터럴(문자열 상수)
		String y = "ABC";  // a와 만들어지는 영역이 다름
						   //Literal POOL(memory)에 만들어짐
		System.out.println(x==y);  
						   // POOL은 재활용 가능하기 때문에 true
		
		
	}
}
