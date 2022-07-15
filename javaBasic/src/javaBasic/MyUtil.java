package javaBasic;

public class MyUtil {
	private MyUtil() {
		
	}
	
	
	public static int hap(int a, int b) {
		return a+b;
	}
	public int hap1(int a, int b) {
		return a+b;
	}
	
	// 메서드의 오버로딩 (중복정의)
	public static float hap(float a, float b) {
		return a+b;               
	}
	
}	
