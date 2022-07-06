package java0705;

public class ex06_이차원배열예제 {
	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		
		for(int i = 0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				array[i][j] = 5*i+j+1;
				System.out.print(array[i][j]+"\t");
			}System.out.println("");
		}
		
		
		
		
	}
}
