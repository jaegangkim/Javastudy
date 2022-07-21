import kr.myutil.ObjectArray;
import kr.ani.oop2.A;
import kr.ani.oop2.B;

public class oop13 {

	public static void main(String[] args) {

		// 배열에 A, B, A, A, B 클래스를 저장하고 출력
		// ObjectArray -> ArrayList ( 원래 있는 클래스 )
		ObjectArray arr = new ObjectArray(5);
	
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i) instanceof A) {
				((A) arr.get(i)).display();
			}else {
				((B) arr.get(i)).display();
			}
		}
		
		
	}
}
