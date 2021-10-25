package gh.java.practice3;


// public => 외부에서 접근가능한 접근제한자
// default  => 같은패키지 안에서만 접근 가능
public class Product {
	
	//상품명, 상품가격, 브랜드명
	// [필드부]
	private String name;
	private int price;
	private String brand = "애플";
	
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price)	{
		this.price = price;
	}
	
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	
	
	// getter메소드
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	
	
	public String information() {
		return "제품의 이름은 " + name + "이고 가격은 " + price + "이고 브랜드명은 " + brand+ "입니다.";
	}

}
