import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.board.Board;
import kr.board.BoardDAO;

public class jdbc08 {
	public static void main(String[] args) {
		// 게시판 정보 수정하기.
		BoardDAO dao = new BoardDAO();
		boardPrint(dao);
		Board vo = new Board();
		Scanner sc = new Scanner(System.in);
		System.out.print("수정 할 번호 : ");
		vo.setNum(sc.nextInt());
		System.out.print("수정 할 제목 : ");
		vo.setTitle(sc.next());
		System.out.print("수정 할 내용 : ");
		vo.setContent(sc.next());
		
		
		
		
		int cnt = dao.boardUpdate(vo);
		if(cnt>0) {
			System.out.println("수정완료");
		}
		
		boardPrint(dao);
	}
	public static void boardPrint(BoardDAO dao) {
		List<Board> list = dao.boardAllList();
		if(list.size()!=0) {
			for(Board vo : list) {
				System.out.println(vo.toString());
			}
		}
	}
}

/*
수정 할 번호 : 4
수정 할 제목 : 수정하기
수정 할 내용 : 수정하기
수정완료
*/