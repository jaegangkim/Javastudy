package kr.ani.oop1;
// 일반클래스 -> 추상클래스
public abstract class Animal {
	public abstract void eat();   //추상메서드 -> 반드시 자식이 구현 (재정의)

	// 모든 동물들의 공통 동작
	// 구현클래스
	public void move() {
		System.out.println("무리를 지어 이동한다.");
	}
	
}
