
public class Film extends Product {
	public String author;
	public String mainActor;
	public int timeLimit;
	
	public void printGeneralInfo() {
		super.printGeneralInfo();
		System.out.println("Author: "+ this.author);
		System.out.println("The main actor: : "+ this.mainActor);
		System.out.println("Time:"+ this.timeLimit);
	}
	
	public Film(String iD, String name, String kind, double price, double cost, double quantity, String author, String mainActor, int timeLimit) {
		super(iD,name,kind,price,cost,quantity);
		this.author=author;
		this.mainActor=mainActor;
		this.timeLimit=timeLimit;
	}
}
