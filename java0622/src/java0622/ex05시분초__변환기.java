package java0622;

public class ex05시분초__변환기 {

	public static void main(String[] args) {
		// 정수형 변수에 초를 초기화
		int second = 3723;
		
		// second를 시 분초 로 변환하기
		
				System.out.println(second/3600+"시 "+second/60%60+"분 "+(second%60)+"초");

	}

}
