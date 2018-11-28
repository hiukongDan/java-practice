public class SavingsAccount extends Account{
	public SavingsAccount(){
	}
	
	public SavingsAccount(int id, double balance){
		super(id, balance);
	}
	
	// Saving account can not be overdrawn
	public double withdraw(double amount){
		if (amount > super.getBalance())
			amount = super.getBalance();
			
		super.setBalance(super.getBalance() - amount);
		return amount;
	}
	
	public String toString(){
		return "Savings account\n" + super.toString();
	}
}
