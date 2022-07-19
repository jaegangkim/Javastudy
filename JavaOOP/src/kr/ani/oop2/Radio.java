package kr.ani.oop2;

public class Radio implements RemoCon{

	@Override
	public void chUp() {
		System.out.println("Radio채널 다운");
		
	}

	@Override
	public void chDown() {
		System.out.println("Radio채널 다운");
		
	}

	@Override
	public void internet() {
		System.out.println("Radio는 인터넷x");
		
	}
	
	
	
}
