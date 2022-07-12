package javaBasic;

public class Basic12_movie {

	public static void main(String[] args) {
		
		MovieVO[] arr = new MovieVO[3];
		
		arr[0] = new MovieVO("영화1","홍길동1",10000,"1상영관","16:00");
		arr[1] = new MovieVO("영화2","홍길동2",10000,"2상영관","17:00");
		arr[2] = new MovieVO("영화3","홍길동3",10000,"3상영관","18:00");

		for(MovieVO m: arr) {
			System.out.println(m);
		}

	}

	
	
}
