import java.sql.*;
import java.util.List;

import kr.board.Board;
import kr.board.BoardDAO;
public class jdbc06_메서드사용 {
	public static void main(String[] args) {
		// 게시판 전체 리스트를 출력하시오.
		BoardDAO dao = new BoardDAO();
		dao.getConnect();
		List<Board> list = dao.boardAllList();
		if(list.size()!=0) {
			for(Board vo : list) {
				System.out.println(vo.toString());
			}
		}	
	}

}
