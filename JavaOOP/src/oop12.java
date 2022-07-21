import kr.myutil.IntArray;

public class oop12 {

	public static void main(String[] args) {
		// API 만들기
		// 배열에 1,2,3,4,5라는 정수를 저장하고 출력하시오
		
		IntArray arr = new IntArray(5);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		for(int i=0;i<arr.size();i++){ 
			System.out.println(arr.get(i));
		}
		
	
		
	}
}
