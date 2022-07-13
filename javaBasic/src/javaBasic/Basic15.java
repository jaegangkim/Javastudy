package javaBasic;

public class Basic15 {

	public static void main(String[] args) {

		String a = "ABCDE";
		for(int i =0;i<a.length();i++) {
			System.out.println(a.toLowerCase().charAt(i));
		}
		//또는 (char) (a.charAt(0)+32)
		
		String b = "12345"; // 1+2+3+4+5=?
		int sum = 1;
		System.out.print(1);
		for(int i =1;i<a.length();i++) {
			System.out.print("+"+b.charAt(i));
			sum+=b.charAt(i)-'0';    //또는 -48
		}System.out.print("="+sum);
		
		
	}
}
