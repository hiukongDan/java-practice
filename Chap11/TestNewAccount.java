import java.util.ArrayList;

public class TestNewAccount{
	public static void main(String[] args){
		NewAccount a1 = new NewAccount("George", 1122, 1000);
		a1.setAnnualInterestRate(1.5);
		a1.deposit(30);
		a1.deposit(40);
		a1.deposit(50);
		a1.withdraw(5);
		a1.withdraw(4);
		a1.withdraw(2);
		
		System.out.println("name: " + a1.getName());
		System.out.println("Interest rate: " + a1.getAnnualInterestRate());
		System.out.println("balance: " + a1.getBalance());
		ArrayList<Transaction> t1 = a1.getTransaction();
		for (int i = 0; i < t1.size(); i++){
			System.out.println(t1.get(i).toString());
		}
	}
}
