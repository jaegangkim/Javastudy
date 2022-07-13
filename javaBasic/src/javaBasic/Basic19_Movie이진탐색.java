package javaBasic;

public class Basic19_Movie이진탐색 {

	public static void main(String[] args) {
		
		MovieVO[] arr = new MovieVO[3];
		arr[0] = new MovieVO("범죄도시","홍길동1",10000,"1상영관","16:00");
		arr[1] = new MovieVO("탑건","홍길동2",10000,"2상영관","17:00");
		arr[2] = new MovieVO("마녀","홍길동3",10000,"3상영관","18:00");

		// 탑건의 영화 정보를 검색하세요.
		String title="탑건";
		selectionSort(arr);
		//이진검색
		int low=0,high=arr.length-1,middle;
		int index = -1; // 실패(-1) 판별
		while(low<=high) {
			middle = (low+high)/2;
			if(arr[middle].getTitle().equals(title)) {
				index = middle;
				break;
			}else if(arr[middle].getTitle().compareTo(title)<0) {
				low = middle+1;
			}else {
				high = middle-1;
			}
		}
		System.out.println(arr[index]);
		
		
		
		
	}
	public static void selectionSort(MovieVO[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].getTitle().compareTo(arr[j].getTitle())>0) {
					MovieVO temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
	}
}
