import kr.ani.oop.Animal;
import kr.ani.oop.Cat;
import kr.ani.oop.Dog;

public class oop07 {

	public static void main(String[] args) {
		
		Dog g = new Dog();
		Cat c = new Cat();
		// display라는 메서드에서 eat()를 동작시키시오.
		display(g);
		display(c);
		display1(g);
		display1(c);
		
		
		
	}
								//다형성 인수
	public static void display(Animal a) {
		a.eat();
		if(a instanceof Cat) {
			((Cat) a).night();
		}
		
	}
	public static void display1(Object a) {
		((Animal) a).eat();
		if(a instanceof Cat) {
			((Cat) a).night();
		}
		
	}
	
}
