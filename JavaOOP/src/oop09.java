import kr.ani.oop2.Radio;
import kr.ani.oop2.RemoCon;
import kr.ani.oop2.TV;

public class oop09 {

	public static void main(String[] args) {
		//RemoCon으로 TV를 동작시키시오.
		// 1. 객체 생성 불가능
		// 2. upcasting으로 객체 생성
		// 3. 100%다형성 보장
		// 4. 서로 다른 기능의 클래스의 공통을 묶을 때 사용
		// 5. 추상메서드 + final static 멤버변수(상수)
		RemoCon rc = new TV();
		rc.chUp();
		rc.chDown();
		rc.internet();
		
		rc = new Radio();
		rc.chUp();
		rc.chDown();
		rc.internet();
		
		
	}
}
