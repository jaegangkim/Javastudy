import java.sql.*;
public class jdbc03_update {

	public static void main(String[] args) {
		int num = 2;
		String title = "수정 된 게시물";
		String content = "수정 된 게시물";
		/////////////////////////////////////
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "scott";
		String password="tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn= DriverManager.getConnection(url, username, password);
			String SQL ="update board set title=?,content=? where num=?";
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3,2);
			ps.executeUpdate(); // 성공되면 1의 값을 가짐
			System.out.println("수정 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
