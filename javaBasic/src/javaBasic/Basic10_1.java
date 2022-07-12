package javaBasic;

public class Basic10_1 {

	public static void main(String[] args) {
		Book b1 = new Book("자바","홍길동","영진",30000,820);
		Book b2 = new Book("Oracle","박길동","출판사",32000,810);
		Book b3 = new Book("c++","박길동","출판사",32000,810);
		
		
		//책 3권을 저장 할 변수 선언
		//객체 배열(Object 배열)
		Book[] arr = new Book[3];
		arr[0] = b1;
		arr[1] = b2;
		arr[2] = b3;
				
		for(Book b : arr) {
			System.out.println(b);
		}

	}

}
