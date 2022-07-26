import java.util.List;
import java.util.Scanner;
import java.sql.*;
import kr.board.Board;
import kr.board.BoardDAO;

public class jdbc09_검색하기 {

	public static void main(String[] args) {
		// 게시물 제목에 특정 문자열이 포함 된 게시물 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 할 제목 입력 : ");
		String search = sc.nextLine();
		
		BoardDAO dao = new BoardDAO();
		List<Board> list = dao.boardSearchList(search);
		if(list.size() != 0) {
			for (Board vo : list) {
				System.out.println(vo);
			}
		}else {
			System.out.println("데이터가 없습니다.");
		}

	}

}




/* 
검색 할 제목 입력 : 수정

 */

