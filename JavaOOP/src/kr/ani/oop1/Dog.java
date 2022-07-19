package kr.ani.oop1;

public class Dog extends Animal{
	public Dog() {
		super();             // 부모의 생성자 메서드가 생략 되어 있음.
	}

	@Override
	public void eat() {
		System.out.println("개처럼 먹다");
		
	}
	
}
