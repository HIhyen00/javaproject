package orchard;

public abstract class Fruits {
	// 필드
	String name;
	int price;
	// 생성자
	public Fruits() {
		
	}
	public Fruits(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
//	// getter, setter
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
}
