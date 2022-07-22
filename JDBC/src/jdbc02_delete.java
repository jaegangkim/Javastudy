import java.sql.*;
public class jdbc02_delete {

	public static void main(String[] args) {
		// 삭제하기 실습
		int num = 1;
		//board table에서 num이 1인 게시물을 삭제하시오.
		
		// DB연결 객체 생성 (url, username, password)필요
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "scott";
		String password="tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn= DriverManager.getConnection(url, username, password);
			String SQL ="delete from board where num=?";
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1,1);
			ps.executeUpdate(); // 성공되면 1의 값을 가짐
			System.out.println("삭제 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
