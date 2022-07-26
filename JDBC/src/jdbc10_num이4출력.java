import java.util.Scanner;

import kr.board.Board;
import kr.board.BoardDAO;

public class jdbc10_num이4출력 {

	public static void main(String[] args) {
		// 특정 게시물 번호에 해당하는 게시물 정보 1개 가져오기
		System.out.print("검색 할 게시물 번호 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BoardDAO dao = new BoardDAO();
		Board vo =dao.getByNum(num);
		if(vo!=null) {
			dao.updateCount(num); // 조회수 업데이트 시키기
			System.out.println(vo);
			
		}else {
			System.out.println("검색 실패");
		}
		
	}
}
