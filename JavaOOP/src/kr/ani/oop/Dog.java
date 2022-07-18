package kr.ani.oop;

public class Dog extends Animal{
	public Dog() {
		super();             // 부모의 생성자 메서드가 생략 되어 있음.
	}
	
	
	// Override (재정의, 부모 무시)
	public void eat() {
		System.out.println("개처럼 먹다");
	}
	
}
