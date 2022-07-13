package javaBasic;

import java.util.Scanner;


public class Basic13 {

	public static void main(String[] args) {
		// 문자열 1개를 저장 할 변수를 선언하시오.
		String a;
		a = "Hello";
		// java.lang.String b= new java.lang.String("Hello");
		// 					
		System.out.println(a.toUpperCase());
		System.out.println(a.substring(2,4));
		System.out.println(a.charAt(1));
		System.out.println(a.indexOf("lo"));
		System.out.println(a.replaceAll("l",""));
		//문자열과 문자열을 비교 (=, >, <)
		
	}
	

}
