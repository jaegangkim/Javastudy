import kr.ani.oop.Cat;
import kr.ani.oop.Dog;

public class OOP01 {

	public static void main(String[] args) {
		// 상속 : 클래스를 어떻게 설계하는 것이 가장 효율적인가?
		// 설계 : 1. 수평적 설계 - 코드의 중복, 유지보수가 어렵다
		//	 2. 수직적설계(상속) - 재활용, 확장성, 편리성ㅇㅇㅇ어어어어엉
		
		// Dog의 eat() 호출, Cat의 eat() 호출
		Dog d = new Dog();
		d.eat();
		Cat c =new Cat();
		c.eat();
		c.night();
		
		
		
	}

}
