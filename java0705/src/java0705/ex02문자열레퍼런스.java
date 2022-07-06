package java0705;

import java.util.Scanner;

public class ex02문자열레퍼런스 {

	public static void main(String[] args) {
		String base = "apple";
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(base == str);
		System.out.println(base.equals(str));
		
		

	}

}
