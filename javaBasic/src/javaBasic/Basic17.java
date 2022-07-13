package javaBasic;

public class Basic17 {

	public static void main(String[] args) {
		
		MovieVO[] arr = new MovieVO[3];
		arr[0] = new MovieVO("범죄도시","홍길동1",10000,"1상영관","16:00");
		arr[1] = new MovieVO("탑건","홍길동2",10000,"2상영관","17:00");
		arr[2] = new MovieVO("마녀","홍길동3",10000,"3상영관","18:00");
		// 영화제목을 기준으로 오름차순 정렬
		
		selectionSort(arr);
		for(MovieVO mvo : arr) {
			System.out.println(mvo);
		}
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
