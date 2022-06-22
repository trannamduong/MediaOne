
public class Employer {
	private String iDEmployer;
	private String name;
	private double salary;
	private int age;
	private String sex;
	private String position;
	
	public void printGenaralInfo() {
		System.out.println("ID: "+this.iDEmployer);
		System.out.println("Name: "+this.name);
		System.out.println("Salary: "+this.salary);
		System.out.println("Age: "+this.age);
		System.out.println("Sex: "+this.sex);
		System.out.println("Positon: "+this.position);
	}
	
	public void changeSalary(double changeSalary) {
		this.salary = changeSalary;
	}
	public String getName(){
		return this.name;
	}
	public double getSalary(){
		return this.salary;
	}
	public int getAge(){
		return this.age;
	}
	public String getSex(){
		return this.sex;
	}
	public String getPosition(){
		return this.position;
	}
	public String getIDEmployer(){
		return this.iDEmployer;
	}
	public void setIDEmployer(String iDEmployer) {
		this.iDEmployer=iDEmployer;
	}
	public void setName(String name) {
		this.name=name;
	}public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	
	
	public Employer(String iDEmployer,String name, double salary, int age, String sex, String position) {
		this.iDEmployer=iDEmployer;
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.sex=sex;
		this.position=position;
	}
	
}
