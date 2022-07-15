package javaBasic;

public class Basic20 {
	public Basic20() {             // 생성자 생략 부분
		
	}
	public static void main(String[] args) {
		
		Basic20 b20 = new Basic20();
		// 2개 정수를 받아서 두 수 사이의 짝수의 합을 구하여 리턴하는 메서드정의
		System.out.println(b20.evenHap(30,780));
	}
	// 인스턴스메서드, 클래스메서드
	public int evenHap(int n1,int n2) {
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	
}
