import java.util.ArrayList;

import kr.myutil.MovieVO;

public class oop15 {

	public static void main(String[] args) {
		// Movie(영화) 3편을 ArrayList에 저장하고 출력
		ArrayList<MovieVO> arr = new ArrayList<MovieVO>();
		
		arr.add(new MovieVO("영화1","홍길동1",10000,"1상영관","16:00"));
		arr.add(new MovieVO("영화2","홍길동2",10000,"2상영관","17:00"));
		arr.add(new MovieVO("영화3","홍길동3",10000,"3상영관","18:00"));
		
		for(int i =0;i<arr.size();i++) {
			System.out.println(arr[i]===.get.toString());
		}
	}

}
