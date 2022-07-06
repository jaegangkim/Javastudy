package java0705;

public class ex05_이차원배열 {

	public static void main(String[] args) {
		int[][] array = new int[3][2];
		
		System.out.println(array.length);
		
		array[0][0] = 1;
		array[0][1] = 2;
		
		array[1][0] = 3;
		array[1][1] = 4;
		
		array[2][0] = 5;
		array[2][1] = 6;

		int[][] array2 = {{1,2},{3,4},{5,6}};
		
		System.out.println(array2[0].length);
		
	}

}
