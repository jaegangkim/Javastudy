package java0628;

public class ex06_for문예제5 {

		public static void main(String[] args) {
			
			for(int i =1;i<=50; i++) {
				int n = i%10;
				if (n == 3 || n==6 || n==9) {
					System.out.println("박수");
				}else if (n==5 || n==0) {
					System.out.println("으악");
				}else {
					System.out.println(i);
				}
			}
			
		}
}
