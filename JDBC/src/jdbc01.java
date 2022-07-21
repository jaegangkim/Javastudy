// JDBC Progremming
// JDBC -> MyBatis -> Hibernate -> Spring JPA
import java.sql.*;
public class jdbc01 {

	public static void main(String[] args) {
		// oracle DB연결
		// 1. 접속URL(IP주소) : 프로토콜(oracle)
		// 2. username : scott
		// 3. password : tiger
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String username = "scott";
		String password="tiger";
		//예외처리
		try {
			
		} catch (Exception e) {
			e.printStackTrace(); // 예외메세지 출력
		}
		
		
		

	}

}
