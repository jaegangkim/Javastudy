package javaBasic;
// 책(Object:객체) -> 제목,지은이,출판사,가격,페이지 
//                  (속성=멤버변수=프로퍼티=상태정보 )
public class Book extends Object{  //extent Object : 디폴트값이라 생략 가능
	private String title;
    private	String name;
	private String company;
	private int price;
	private int page;
	
	
	// 디폴트 생성자 메소드 
		public Book(){
			
			//객체 생성 코드가 생략되어있음
		}   
	
	public Book(String title, String name, String company, int price, int page) {
		super();  // new Object()
		this.title = title;
		this.name = name;
		this.company = company;
		this.price = price;
		this.page = page;
	}

	
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	//모든 멤버 변수의 값을 리턴하는 메서드 정의
	@Override           //부모에게 있던 메서드를 다시 재정의
	public String toString() {
		return "Book [title=" + title + ", name=" + name + ", company=" + company + ", price=" + price + ", page="
				+ page + "]";
	}
	

}
