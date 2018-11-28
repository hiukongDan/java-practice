public class TestAccount{
	public static void main(String[] args){
		Account a1 = new Account(1, 50000);
		SavingsAccount s1 = new SavingsAccount(2, 6000);
		CheckingAccount c1 = new CheckingAccount(3, 50000, 1000);
		
		System.out.println(a1.toString());
		System.out.println();
		System.out.println(s1.toString());
		System.out.println();
		System.out.println(c1.toString());
	}
}
