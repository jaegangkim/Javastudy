package kr.ani.oop2;

public interface RemoCon {
	// 추상메서드와 상수로만 구성
	public static final int MAXCH=10;
	public final static int MINCH=1;
	public void chUp();   //인터페이스에서는 abstract 생략 가능
	public void chDown();
	public void internet();
	
}
