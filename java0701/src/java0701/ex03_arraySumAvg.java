package java0701;

public class ex03_arraySumAvg {

	public static void main(String[] args) {
		// 정수형 배열 5칸을 생성하고
		// 6, 15, 45, 7, 9로 초기화
		
		// 배열 안의 값들의 총합과 평균을 계산
		
		int[] arr = {6,15,45,7,9};
		int sum = 0;
		
		for(int i=0; i<=4; i++) {
			sum += arr[i];
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+sum/5f);
		

	}

}
