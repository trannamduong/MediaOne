

public class Music extends Product {
	public String singer;
	
	public void printGeneralInfo() {
		super.printGeneralInfo();
		System.out.println("Singer: "+ this.singer);
	}
	
	public Music(String iD, String name, String kind, double price, double cost, double quantity, String singer) {
		super(iD,name,kind,price,cost,quantity);
		this.singer=singer;
	}
}
