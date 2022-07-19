import kr.ani.oop.Animal;
import kr.ani.oop.Cat;
import kr.ani.oop.Dog;

public class oop04_업다운캐스팅 {

	public static void main(String[] args) {
		// up casting
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();         //타입이 animal이라 night 불가능
		
		// down casting
//		Cat cc = (Cat) ani;
//		cc.night();        
		((Cat) ani).night();    // (Cat)보다 . 이 우선이라 ()필요
		
		

	}

}
