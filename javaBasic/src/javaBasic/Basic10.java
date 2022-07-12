package javaBasic;

public class Basic10 {

	public static void main(String[] args) {
		// 책 1권을 저장 할 객체를 생성하시오
		Book b = new Book();
		System.out.println(b.title);  
		
		b.title = "파이썬";
		System.out.println(b.title);
		
		int a;
		// System.out.println(a); 지역변수라서 초기화 없으면 에러
		
		
		//초기화를 다르게 하는 방법>
		Book b1 = new Book();   //자바
		Book b2 = new Book("Oracle","박길동","출판사",32000,810);   //Oracle
		System.out.println(b1); // b1.toString() 생략가능
		System.out.println(b2);
		
		
	}

}
