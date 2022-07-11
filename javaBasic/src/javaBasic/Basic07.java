package javaBasic;

public class Basic07 {

	public static void main(String[] args) {
		// a 배열의 총합
		int[] a = {4,3,1,2,5};
		
		System.out.println(arrhap(a));
	}

	public static int arrhap(int[] a) {
		int sum = 0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
	
}
