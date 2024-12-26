package book;

public class Book {
	String name;
	int numOfCopies;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public int getNumOfCopies() {
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book(String name, int numOfCopies, double price) {
		super();
		this.name = name;
		this.numOfCopies = numOfCopies;
		this.price = price;
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", numOfCopies=" + numOfCopies + ", price=" + price + "]";
	}
	
	

}
