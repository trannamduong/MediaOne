
import javafx.util.Pair;  

public class Bill {
	private String iDBill;
	private String dateAndTime;
	private String createdAt;
	private double Sum=0;
	private int numberOfProduct=0;
	public final double MAX_SUM=5000000;
//	Product []SP=new Product[100];
	List<Product> SP = new ArrayList<Product>();
//	Pair<Product, Integer> 
	private int countPerProduct[];
	
	public void printInfo() {
		System.out.println("ID: "+ this.iDBill);
		System.out.println("Created at: "+ this.createdAt);
		System.out.println("Time and Date: "+this.dateAndTime);
		for(int i=0;i<numberOfProduct;i++) {
			System.out.println(SP[i].name+"     "+countPerProduct[i]);
		}
		System.out.println("Number of products: "+this.numberOfProduct);
		System.out.println("Sum: "+ this.Sum);
	}
	
	public boolean addProduct(Product sp, int count) {
		if(sp.quantity-count>0) {
//			SP[numberOfProduct]=sp;
			SP.add(sp);
			countPerProduct[numberOfProduct]=count;
			sp.reduceQuantity(count);
			numberOfProduct++;
			return true;
		}
		else return false;
	}
	
	public boolean deleteProduct(Product sp,int count) {
		int k=0;
		for(int i=0;i<numberOfProduct;i++ ) {
			if((SP[i].iD==sp.iD)&&(countPerProduct[i]-count>=0)) 
				k=i;
			
		}
		if(k>0) {
		if(countPerProduct[k]-count==0) {
			for(int j=k;j<numberOfProduct-1;j++)
				{
					SP[j]=SP[j+1];
					countPerProduct[j]=countPerProduct[j+1];
				}
			return true;
		}
		else {
			countPerProduct[k]-=count;
			return true;
		}}
		else return false;
	}
	
	public double total() {
		for(int i=0;i<numberOfProduct;i++) {
			Sum+=SP[i].cost;
		}
		return Sum;
	}
	
}
