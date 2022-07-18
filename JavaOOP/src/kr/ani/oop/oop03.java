package kr.ani.oop;

public class oop03 {

	public static void main(String[] args) {
		// 만약, Dog클래스를 다른 사람에게 받아서 동작을 시키는 경우
		// Dog.java(소스코드x), Dog.class(실행클라스)
		// Animal.java,  Animal.class
		//	  ㅣ eat(){?}
		//	  ㅣ
		//    ㅣ-> Dog.class(동작방식을 모름)
		
		Animal g; 
		g = new Dog();
		g.eat();
		
		g = new Cat();
		g.eat();
		// 다형성 : 상위클래스가 동일한 메세지로
		// 하위클래스를 서로 다르게 동작시키는 객체지향원리
		
		
	}

}
