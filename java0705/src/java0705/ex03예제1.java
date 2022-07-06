package java0705;

import java.util.Scanner;

public class ex03예제1 {

	public static void main(String[] args) {
		// 1. 사람 이름으로 초기화 된 배열을 만들어보세요.
		String[] names = {"황해도","한수진","강성관","박병관"};
		
		// 2. Scanner를 이용해 검색 할 사람 이름을 입력받으세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 할 이름을 입력 >> ");
		String input = sc.next();
		
		// 3. 해당 이름이 존재하는 인덱스를 출력해주세요.
		
		int no = 0;
		
		for(int i = 0; i<names.length;i++) {
			if (names[i].equals(input)) {
				System.out.println("인덱스 = "+i);
				no = 1;
				break;          // 더 빨라짐
			}
		}
		
		// 4. 만약 해당 이름이 배열에 없다면, "검색결과가 없습니다." 를 출력 해주세요.
		if(no==0) {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}

}
