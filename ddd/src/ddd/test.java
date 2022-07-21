package ddd;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("java 점수 : ");
		int java = sc.nextInt();
		System.out.print("jweb 점수 : ");
		int web = sc.nextInt();
		System.out.print("and 점수 : ");
		int and = sc.nextInt();
		
		int[] arr = {java,web,and};
		int sum = 0;
		for(int n:arr) {
			sum+=n;
		}
		System.out.println("java : "+java);
		System.out.println("web : "+web);
		System.out.println("and : "+and);
		System.out.println("sum : "+sum);
		System.out.println("avg : "+sum/arr.length);
		
	
		
		
	}
	
}
