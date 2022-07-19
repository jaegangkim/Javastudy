import kr.ani.oop1.Animal;
import kr.ani.oop1.Dog;

public class oop08_추상클래스 {

	public static void main(String[] args) {
		// 다형성을 보장하는 방법 ?
		//  [ 전제조건 ] 
		// 1. 상속관계     2. 재정의(override)
		// 3. 객체 생성을 upcasting해야 함(부모가 명령)
		// 4. 동적바인딩
		// -> 추상클래스, 인터페이스
		// 추상클래스 : 
		// 1. 객체 생성 불가능
		// 2. upcasting으로 객체 생성
		// Animal ani = new Animal();   불가능
		Animal ani = new Dog();
		ani.eat();  // 다형성이 보장
		ani.move();
		// 3. 일부분만 다형성을 보장한다.
		// 4. 기능이 비슷한 클래스들의 공통을 묶을 때 사용
		
		
	}

}
