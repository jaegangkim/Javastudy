package javaBasic;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class json_MoiveVO_타입변경_Basic25 {

	public static void main(String[] args) {
		// 데이터 포멧(XML, JSON) : 데이터를 표현하는 방법
		MovieVO m = new MovieVO("범죄도시","홍길동1",10000,"1상영관","16:00");

		Gson g = new Gson();
		String s =g.toJson(m);
		System.out.println(s);
		
		makeObject(s);
		
		MovieVO[] m1 = new MovieVO[3];
		m1[0] = new MovieVO("범죄도시","홍길동1",10000,"1상영관","16:00");
		m1[1] = new MovieVO("탑건","홍길동2",10000,"2상영관","17:00");
		m1[2] = new MovieVO("마녀","홍길동3",10000,"3상영관","18:00");
		String s1 =g.toJson(m1);   //JSON문자열로 변경
		System.out.println(s1);
		
		makeArray(s1);
	}	
		//JSON문자열을 Object로 변경하는 메서드 정의
	public static void makeObject(String json) {
		Gson g = new Gson();
		MovieVO m = g.fromJson(json, MovieVO.class);
		System.out.println(m);
	}
	public static void makeArray(String json) {
		Gson g = new Gson();
		MovieVO[] m = g.fromJson(json, MovieVO[].class);
		for(MovieVO mvo : m) {
			System.out.println(mvo);
		}
	}

}
// 영화
/*
<movie>
	
</movie>
*/