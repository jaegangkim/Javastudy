package javaBasic;

public class Basic08 {

	public static void main(String[] args) {
		int[] a = makeArr();
		int sum = 0 ;
		for(int i:a) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	
	// 5개의 정수를 저장하는 배열을 만들어서 리턴 하시오.
	public static int[] makeArr() {
		int[] a = {4,3,1,2,5};
		return a;
	}
	
}
