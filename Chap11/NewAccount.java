import java.util.Date;
import java.util.ArrayList;
public class NewAccount{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public NewAccount(){
	}
	
	public NewAccount(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public NewAccount(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
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
	
	public ArrayList<Transaction> getTransaction(){
		return this.transactions;
	}
	
	public double withdraw(double amount){
		this.balance -= amount;	
		this.transactions.add(new Transaction('W', amount, balance, "withdraw"));
		return amount;
	}
	
	public void deposit(double amount){
		this.balance += amount;
		this.transactions.add(new Transaction('D', amount, balance, "deposit"));
	}
	
	public String toString(){
		return "id:" + this.id + "\nDate created: " + this.dateCreated.toString() + 
			"\nbalance: " + this.balance;
	}
}
