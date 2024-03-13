package day2;

public class Food {
	
	String name;
	String category;
	int price;
	@Override
	public String toString() {
		return "Food [name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Food(String name, String category, int price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public Food() {
		// TODO Auto-generated constructor stub
	}
	
	

}