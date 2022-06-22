
public class Product {
	public String iD;
	public String name;
	public String kind;
	public double price;
	public double cost;
	public double quantity;
	
	
	public void printGeneralInfo() {
		System.out.println("ID :"+ this.iD);
		System.out.println("Product :"+ this.name);
		System.out.println("Kind :"+ this.kind);
		System.out.println("Price:"+ this.price);
		System.out.println("Cost: "+ this.cost);
		System.out.println("Quantity: "+ this.quantity);
	}
	
	public void upQuantity(double upQuantity) {
		this.quantity=this.quantity+ upQuantity;
	}
	
	public void reduceQuantity(double reduceQuantity) {
		this.quantity-=reduceQuantity;
	}
	
	public String getID() {
		return this.iD;
	}
	public String getName() {
		return this.name;
	}
	public String getKind() {
		return this.kind;
	}
	public double getPrice() {
		return this.price;
	}
	public double getCost() {
		return this.cost;
	}
	public double getQuantity() {
		return this.quantity;
	}
	public void setID(String ID) {
		this.iD=ID;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setCost(double cost) {
		this.cost=cost;
	}
	public void setQuantity(double quantity) {
		this.quantity=quantity;
	}
	public Product(String iD, String name, String kind, double price, double cost, double quantity) {
		this.iD=iD;
		this.name=name;
		this.kind=kind;
		this.price=price;
		this.cost=cost;
		this.quantity=quantity;
	}
}
