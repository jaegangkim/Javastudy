package javaBasic;

public class Basic02_선택정렬 {

	public static void main(String[] args) {
		
		int[] a= {4,3,1,2,5};
		
		// selection sort ( 선택 정렬 )
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		for(int d: a) {
			System.out.print(d+" ");
		}
		
	}

}
