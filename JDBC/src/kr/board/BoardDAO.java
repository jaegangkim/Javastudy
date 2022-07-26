package kr.board;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class BoardDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	//Connection 객체 생성 메서드
	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "scott";
		String password="tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, username, password);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// 게시물 저장 동작 - boardInsert()
	public int boardInsert(Board vo) {
		String SQL ="insert into board(num,title,content,writer) values(board_num.nextval,?,?,?)";
		conn = getConnect();
		int cnt=-1;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, vo.getWriter());
			cnt = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return cnt;
	}////_boardInsert_////
	
	// select //
	public List boardAllList() {
		String SQL="select * from board order by num desc";
		conn = getConnect();
		List<Board> list = new ArrayList<Board>();
		try {
			ps = conn.prepareStatement(SQL);
			rs = ps.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String content=rs.getString("content");
				String writer=rs.getString("writer");
				String indate=rs.getString("indate");
				int count =rs.getInt("count");
				// 묶고(VO) -> 담고(List)
				Board vo=new Board(num,title,content,writer,indate,count);
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return list;
	}////_boardAllList_////
	
	//delete
	public int boardDelete(int num) {
		String SQL="Delete from board where num=?";
		Connection conn = getConnect();
		int cnt = -1;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, num);
			cnt = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;
	}// _delete__ ////
	
	// update
	public int boardUpdate(Board vo) {
		String SQL = "update board set title=?,content=? where num=?";
		int cnt = -1;
		conn = getConnect();
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setInt(3,vo.getNum());
			cnt = ps.executeUpdate();
			System.out.println("수정 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}return cnt;
	}// __update__ //
	
	//search
	public List boardSearchList(String search) {
		String SQL="select * from board where title like ?";
		conn = getConnect();
		List<Board> list = new ArrayList<Board>();
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, "%"+search+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String content=rs.getString("content");
				String writer=rs.getString("writer");
				String indate=rs.getString("indate");
				int count =rs.getInt("count");
				// 묶고(VO) -> 담고(List)
				Board vo=new Board(num,title,content,writer,indate,count);
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return list;
	}//__search__//
	
	//getByNum
	public Board getByNum(int num) {
		String SQL="select * from board where num=?";
		conn = getConnect();
		Board vo=null;
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if(rs.next()) {
				num = rs.getInt("num");
				String title = rs.getString("title");
				String content=rs.getString("content");
				String writer=rs.getString("writer");
				String indate=rs.getString("indate");
				int count =rs.getInt("count");
				vo = new Board(num,title,content,writer,indate,count);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return vo;
	}//__getBynum__ //
	
	//조회수업데이트
	public void updateCount(int num) {
		String SQL = "update board set count = count+1 where num=?";
		conn = getConnect();
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, num);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			dbClose();
		}
	}//__updateCount__//
	
	public void dbClose() {
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
