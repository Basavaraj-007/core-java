package Employee.demo;

public class EmployeeDto {

	
	private int bikeid;
	private String name;
	private String color;
	private int price;
	private String engine;
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "EmployeeDto [bikeid=" + bikeid + ", name=" + name + ", color=" + color + ", price=" + price
				+ ", engine=" + engine + "]";
	}
	
	
}
