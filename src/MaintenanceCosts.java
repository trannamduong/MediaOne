
public class MaintenanceCosts {
	private String iDBill;
	private String dateAndTime;
	private String createdAt;
	private String name;
	private double sum;
	public void printInfo() {
		System.out.println("ID: "+this.iDBill);
		System.out.println("Name: "+this.name);
		System.out.println("Date and Time: "+ this.dateAndTime);
		System.out.println("Created at: "+this.createdAt);
		System.out.println("Sum: "+this.sum);
	}
	public double getSum() {
		return this.sum;
	}
	
	
}
