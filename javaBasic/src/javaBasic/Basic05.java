package javaBasic;

public class Basic05 {

	public static void main(String[] args) {
		// 1~10 총합
		// hap메서드를 호출(call)
		hap();
		System.out.println("종료");
	}
	
	// 1~10까지 합을 구하는 hap()이라는 메서드 정의
	public static void hap() {          // 리턴 타입
		int sum=0;
		for(int i =1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	
	}	
	
	
}
