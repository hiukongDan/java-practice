public class CheckingAccount extends Account{
	private double overdrawLimit = 0;
	
	public CheckingAccount(){
	}
	
	public CheckingAccount(int id, double balance){
		super(id, balance);
	}
	
	public CheckingAccount(int id, double balance, double overdrawLimit){
		super(id, balance);
		this.overdrawLimit = overdrawLimit;
	}
	
	public double withdraw(double amount){
		if (amount > this.overdrawLimit + super.getBalance())
			amount = this.overdrawLimit + super.getBalance();
			
		super.setBalance(this.overdrawLimit + super.getBalance());
		return amount;
	}
	
	public String toString(){
		return "Checking account\n" + super.toString();
	}
}
