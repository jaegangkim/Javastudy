package javaBasic;
// 영화(Object) ->제목, 주인공, 가격, 상영관, 시간
public class MovieVO {

	private String title;
	private String name;
	private int price;
	private String location;
	private String time;
	
	public MovieVO() {
		
	}
		
	public MovieVO(String title, String name, int price, String location, String time) {
		super();
		this.title = title;
		this.name = name;
		this.price = price;
		this.location = location;
		this.time = time;
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



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", name=" + name + ", price=" + price + ", location=" + location + ", time="
				+ time + "]";
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
