import java.util.Date;
public class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public int getID(){
		return this.id;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	public Date getDateCreated(){
		return this.dateCreated;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate(){
		return this.annualInterestRate / 12;
	}
	
	public double withdraw(double amount){
		this.balance -= amount;	
		return amount;
	}
	
	public void deposit(double amount){
		this.balance += amount;
	}
	
	public String toString(){
		return "id:" + this.id + "\nDate created: " + this.dateCreated.toString() + 
			"\nbalance: " + this.balance;
	}
}
