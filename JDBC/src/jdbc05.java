import java.util.Scanner;

import kr.board.Board;
import kr.board.BoardDAO;

public class jdbc05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제목을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("내용을 입력하세요 : ");
		String content = sc.nextLine();
		System.out.print("작성자을 입력하세요 : ");
		String writer = sc.nextLine();
		// 파라메터 수집
		Board vo = new Board();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		//////////////////////////////////////////////////
		BoardDAO dao = new BoardDAO();
		int cnt = dao.boardInsert(vo);
		if(cnt>0) {
			System.out.println("등록 성공");
		}else {
			System.out.println("등록 실패");
		}
		

	}

}
