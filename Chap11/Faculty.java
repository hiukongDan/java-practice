public class Faculty extends Employee{
	private double officeHour = 0;
	private String rank = "";
	
	public Faculty(){
	}
	
	public Faculty(String name, String address, String phoneNumber,
	String emailAddress, String office, double salary, MyDate dateHired,
	double officeHour, String rank){
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHour = officeHour;
		this.rank = rank;
	}
	
	public double getOfficeHour(){
		return this.officeHour;
	}
	
	public String getRank(){
		return this.rank;
	}
	
	public void setOfficeHour(double officeHour){
		this.officeHour = officeHour;
	}
	
	public void setRank(String rank){
		this.rank = rank;
	}
	
	public String toString(){
		return super.toString() + "office hour: " + this.officeHour +
			"\nrank: " + this.rank + "\n";
	}
}
