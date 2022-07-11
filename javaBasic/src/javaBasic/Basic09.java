package javaBasic;

public class Basic09 {

	public static void main(String[] args) {
		Book b = new Book();
		b.title="자바";
		b.name ="황기태";
		b.company ="생능출판사";
		b.price=35000;
		b.page=851;
		
		printBook(b);
		

	}
	//책 1권을 매개변수로 받아서 출력하는 메서드 정의
	public static void printBook(Book b) {
		
		System.out.println(b.title+"|"+b.name+"|"+b.company+"|"+b.price+"|"+b.page);
	}

}
