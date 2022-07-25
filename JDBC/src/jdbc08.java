import java.util.List;
import java.util.Scanner;

import kr.board.Board;
import kr.board.BoardDAO;

public class jdbc08 {
	public static void main(String[] args) {
		// 게시판 정보 수정하기.
		Scanner sc = new Scanner(System.in);
		System.out.print("수정 할 번호 : ");
		int num = sc.nextInt();
		System.out.print("수정 할 제목 : ");
		String title = sc.next();
		System.out.print("수정 할 내용");
		String content = sc.next();
		
	
		
		// TODO  vo로 묶기
		BoardDAO dao = new BoardDAO();
		int cnt = dao.boardUpdate(vo);
		if(cnt>0) {
			System.out.println("수정완료");
		}
		
		
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