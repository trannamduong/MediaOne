
public class MediaStore {
	public static String nameStore;
	private int numberOfEmployer;
	private final int MAX_EMPLOYER=20;
	private Employer []NV= new Employer[20];
	public double allMaintenanceCost() {
		
	}
	
	public double importSum() {
		
	}
	
	public double revenue() {
		
	}
	
	public double profit() {
		
	}
	
	public boolean addEmployer(Employer NVM) {
		if(numberOfEmployer<MAX_EMPLOYER) {
			NV[numberOfEmployer]=NVM;
			numberOfEmployer++;
			return true;
		}
		return false;
		
	}
	public boolean deleteEmployer(string ID) {
		for(int i=0;i<numberOfEmployer;i++) {
			if(NV[i]i.iDEmployer)
		}
		
	}
}
