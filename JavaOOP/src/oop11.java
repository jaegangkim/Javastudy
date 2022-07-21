import kr.ani.oop2.A;
import kr.ani.oop2.B;

public class oop11 {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		// A,B클래스를 다른 메서드로 이동하고자 한다.
		// A,B를 묶어주는 배열?
		Object[] obj = {a,b};
		myPrint(obj);

	}
	public static void myPrint(Object[] obj) {
		for(int i=0;i<obj.length;i++) {
			if(obj[i] instanceof A) {
				((A)obj[i]).display();
			}else {
				((B)obj[i]).display();
			}
		}
	}
	
}
