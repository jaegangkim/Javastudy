package javaBasic;

public class Basic01 {

	public static void main(String[] args) {
		
		int[][] a = new int[5][];
		a[0] = new int[5];
		a[1] = new int[4];
		a[2] = new int[3];
		a[3] = new int[2];
		a[4] = new int[1];
		for(int i =0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				a[i][j]='*';
				System.out.print((char)a[i][j]);
			}System.out.println();
		}
		

	}

}
