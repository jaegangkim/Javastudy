package java0701;

public class ex01_배열생성 {

	public static void main(String[] args) {
		// 정수형 배열 선언
		int[] array;
		
		//정수형 배열 초기화
		array = new int[5];
		
		// 배열 접근
		System.out.println(array);         //배열의 주소값
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		// 배열 값 할당
		array[0] = 10;
		array[3] = 50;
	
		// 배열의 길이 확인
		System.out.println("배열의 길이 : "+array.length+"\n");
		
		//배열 선언 시 원하는 값으로 초기화
		float[] farray = {0.1f, 0.35f, 0.7f};
		
		System.out.println(farray[0]);
		System.out.println(farray[1]);
		System.out.println(farray[2]);
		System.out.println("배열의 길이 : "+farray.length);
		System.out.println(farray);         // 주소
		
		// 배열을 초기화를 안한 경우
		int[] array2=null;
		System.out.println(array2);
		
		
	}

}
