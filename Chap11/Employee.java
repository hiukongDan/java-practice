public class Employee extends Person{
	private String office;
	private double salary = 0;
	private MyDate dateHired = new MyDate();
	
	public Employee(){
	}
	
	public Employee(String name, String address, String phoneNumber,
	String emailAddress, String office, double salary, MyDate dateHired){
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice(){
		return this.office;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public MyDate getDateHired(){
		return this.dateHired;
	}
	
	public void setOffice(String office){
		this.office = office;
	}
	
	public void setSalary(double Salary){
		this.salary = salary;
	}
	
	public void setDateHired(MyDate dateHired){
		this.dateHired = dateHired;
	}
	
	public String toString(){
		return super.toString() + "office: " + this.office +
			"\nsalary: " + this.salary + "\ndate hired: " + this.dateHired.toString();
	}
}
