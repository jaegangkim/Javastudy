package java0705;

public class ex01 {

	public static void main(String[] args) {
		
		double[] array = new double[3];
		double[] array2 = array;
		
		System.out.println(array);
		System.out.println(array2);
		
		array[0] = 3.14;
		System.out.println(array[0]);
		
		array2[0] = 5.67;
		System.out.println(array[0]);
		
		
	}

}
