package javaBasic;

public class Basic03 {
	// 메서드(Method), 함수(Function) => 동작
	public static void main(String[] args) {
		// 변수 -> 배열 -> 클래스
		// 정수 1개를 저장 할 변수 선언, 10 할당
		int a = 10;
		if(a%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		// 정수 3개를 저장 할 변수를 선언하고 10,20,30을 저장
		int[] arr = {10,20,30};
		
		// 책 1권을 저장 할 변수를 선언하시오
		// class : 새로운 자료형을 만드는 도구
		// 객체를 생성(Book) : 객체를 생성하는 메서드(생성자메서드)
		Book b = new Book();
		/* b.title="명품 자바";
		b.name ="황기태";
		b.company ="생능출판사";
		b.price=33000;
		b.page=851;   */  // private이라 안됨
		
		//System.out.println(b.title+"|"+b.name+"|"+b.company+"|"+b.price+"|"+b.page);
	
		
	
	}

}
