
public class Book extends Product{
	public String author;
	public String publisher;
	
	public void printGeneralInfo() {
		super.printGeneralInfo();
		System.out.println("Author: "+ this.author);
		System.out.println("Publisher: : "+ this.publisher);
	}
	
	public Book(String iD, String name, String kind, double price, double cost, double quantity, String author, String publisher) {
		super(iD,name,kind,price,cost,quantity);
		this.author=author;
		this.publisher=publisher;
	}
}
