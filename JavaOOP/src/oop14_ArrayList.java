import java.util.ArrayList;

import kr.ani.oop2.A;
import kr.ani.oop2.B;

public class oop14_ArrayList {

	public static void main(String[] args) {
		// 배열에 A, B, A, A, B 클래스를 저장하고 출력
		// ArrayList
		ArrayList<A> arr = new ArrayList<A>();  // size제한이 없음
		
		arr.add(new A());
		//arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		//arr.add(new B());
		
		arr.remove(1);
//		arr.clear();
		
		for(int i = 0;i<arr.size();i++) {
			if(arr.get(i) instanceof A) {
				((A) arr.get(i)).display();
			}else {
				//((B) arr.get(i)).display();
			}
		}

		
		
	}
}
