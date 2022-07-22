// JDBC Progremming
// JDBC -> MyBatis -> Hibernate -> Spring JPA
import java.sql.*;
public class jdbc01_insert {

	public static void main(String[] args) {
		
		String title="자바에서 입력한 게시판";
		String content = "자바에서 입력한 게시판";
		String writer = "김이박";
		
		// oracle DB연결
		// 1. 접속URL(IP주소) : 프로토콜(oracle)
		// 2. username : scott
		// 3. password : tiger
		//        골뱅이까지는 프로토콜이라고정 / 서브프로토콜, 변경 될 수 있음
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "scott";
		String password="tiger";
		
		//예외처리
		try {
			// 드라이버를 메모리에 로깅 (Driver딩) -> 정적로딩방법 : 잘안씀
			// DriverManager dm = new oracle.jdbc.driver.OracleDriver();
			
			// 1. 동적 로딩 방법 - 드라이버매니저에 자동으로 저장 됨
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// url, username, password등을 드라이버매니저를 통해 연결시키기
			// 2. Connection 객체 생성
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("접속 성공");
			// 게시판 글쓰기
			// 3. SQL쿼리
			String SQL = "insert into board(num,title,content,writer) values(board_num.nextval,?,?,?)";
			// 4. SQL문장을 DB에 전송하는 객체 생성
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			int cnt = ps.executeUpdate(); // 전송(실행)
			System.out.println("등록 성공 : "+cnt);
		} catch (Exception e) {
			e.printStackTrace(); // 예외메세지 출력
		}
		
		
		

	}

}
