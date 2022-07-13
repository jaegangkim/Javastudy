package javaBasic;

public class Basic18_이진탐색 {

	public static void main(String[] args) {
		//검색(Search) : 순차, 블럭, 이진검색(*)
		//이진검색(binary search)
		//         0  1  2   3  4  5  6  7  8  9 
		int[] a = {10,20,30,40,50,60,70,80,90,100};
		
		int sdata=77; // 70의 인덱스 찾기
		
		int low=0,high=a.length-1,middle;
		int index = -1; // 실패(-1) 판별
		while(low<=high) {
			middle = (low+high)/2;
			if(a[middle]==sdata) {
				index = middle;
				break;
			}else if(a[middle]<sdata) {
				low = middle+1;
			}else {
				high = middle-1;
			}
		}
		System.out.println(index);

	}

}
