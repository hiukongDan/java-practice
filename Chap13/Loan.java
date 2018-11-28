public class Loan{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan(){
		this(2.5, 1, 1000);
	}
	
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) 
	throws IllegalArgumentException{
		if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0)
			throw new IllegalArgumentException("Arguments must be positive");
		
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException("annualInterestRate must be positive");
		
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfYears(){
		return this.numberOfYears;
	}
	
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException{
		if (numberOfYears <= 0)
			throw new IllegalArgumentException("numberOfYears must be positive");
		
		this.numberOfYears = numberOfYears;
	}
	
	public double getLoanAmount(){
		return this.loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException{
		if (loanAmount <= 0)
			throw new IllegalArgumentException("loanAmount must be positive");
		this.loanAmount = loanAmount;
	}
	
	public double getMonthlyPayment(){
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment(){
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate(){
		return this.loanDate;
	}
}