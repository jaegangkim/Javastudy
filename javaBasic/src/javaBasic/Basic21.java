package javaBasic;

public class Basic21 {

	public static void main(String[] args) {
		int a = 30,b=780;
		
		//MyUtil my = new MyUtil();  // 생성자가 private이라 에러
		int v = MyUtil.hap(a, b);   // static은 상관없음
		//int v2 = MyUtil.hap1(a, b);  // 인스턴스 메서드는 에러
		System.out.println(v);
		
		System.out.println(Math.max(a, b));
		
	}

}
