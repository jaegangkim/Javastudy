package javaBasic;

public class Basic24 {

	public static void main(String[] args) {

		String[] s = {"10","20","30","40","50"};
		// 배열의 총합
		int sum = 0;
		for(String i : s) {
			sum+=Integer.parseInt(i);
		}
		System.out.println(sum);
		

	}

}
