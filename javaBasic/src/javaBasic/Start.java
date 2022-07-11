package javaBasic;

public class Start {

	public static void main(String[] args) {
		
		// 변수, DataType(자료형), 할당(=)
		// 정수 1개를 저장 할 변수를 선언하시오.
		int a;
		a = 10;
		System.out.println(a);
		// 정수 3개를 저장 할 변수 선언
		int a1=10,b1=20,c1=30;
		int sum =a1+b1+c1;
		System.out.println(sum);
		
		int[] arr= new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		// 총합?
		int tot = 0;
		for(int i=0;i<arr.length;i++) {
			tot += arr[i];
		}
		System.out.println(tot);
		
		
	}

}
