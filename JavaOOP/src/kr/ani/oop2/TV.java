package kr.ani.oop2;

public class TV implements RemoCon{
	int currCH=5;
	@Override
	public void chUp() {
		if(currCH==MAXCH) {
			currCH = 1;
		}else {
		currCH++;
		}
		System.out.println("TV채널업 : "+currCH);
		
	}

	@Override
	public void chDown() {
		if(currCH==MINCH) {
			currCH = 10;
		}else {
		currCH--;
		}
		System.out.println("TV채널업 : "+currCH);
		
	}

	@Override
	public void internet() {
		System.out.println("TV의 인터넷 동작");
		
	}
	
	
	
}
