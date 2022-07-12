package javaBasic;

public class Basic11 {

	public static void main(String[] args) {
		// 책 1권의 데이터를 표현
		// 키보드로 부터 책 데이터를 입력
		String title = "자바";
		String name="홍길동";
		String company="영진";
		int price = 35000;
		int page = 500;
		
		
		// bookPring() 메서드에서 책 데이터를 출력하시오.
		// 묶어주는 도구를 활용 => Book
		Book b = new Book(title, name, company, price, page);
		
		bookPrint(b);
	}

	public static void bookPrint(Book b) {
		System.out.println(b);
	}
	
}
