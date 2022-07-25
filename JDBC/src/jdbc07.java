
import java.util.List;
import java.util.Scanner;

import kr.board.Board;
import kr.board.BoardDAO;
public class jdbc07 {

	public static void main(String[] args) {
		//키보드로 부터 게시판 번호를 입력받아서 해당하는 게시물을 삭제하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제 할 번호를 입력 하세요 : ");
		int num = sc.nextInt();
		BoardDAO dao = new BoardDAO();
		dao.getConnect();
		int cnt = dao.boardDelete(num);
		if(cnt>0) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
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
삭제번호 : 1
삭제 성공
삭제 실패
*/       