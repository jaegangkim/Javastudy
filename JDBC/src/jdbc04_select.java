import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import kr.board.Board;
public class jdbc04_select {

	public static void main(String[] args) {
		
		List<Board> list=new ArrayList<Board>();
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "scott";
		String password="tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url, username, password);
			String SQL = "select * from board order by num desc";
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()==true) {
				int num=rs.getInt("num");
				String title=rs.getString("title");
				String content=rs.getString("content");
				String writer=rs.getString("writer");
				String indate=rs.getString("indate");
				int count =rs.getInt("count");
				// 묶어서(VO) 담기(List)
				Board vo = new Board(num,title,content,writer,indate,count);
				list.add(vo);
			}
			allList(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// 매개변수로 게시판 전체리스트를 받아서 출력하는 메서드 정의
	// allList()
	public static void allList(List<Board> l) {
		for(Board vo : l) {
			System.out.println(vo.toString());
		}
	}
}
