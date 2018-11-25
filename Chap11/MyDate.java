public class MyDate{
	private int year = 0;
	private int month = 0;
	private int day = 0;
	
	public MyDate(){
	}
	
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public int getMonth(){
		return this.month;
	}
	
	public int getDay(){
		return this.day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public String getDate(){
		return "year: " + this.year + " month: " + this.month + 
			" day: " + this.day;
	}
	
	public void setDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString(){
		return getDate() + "\n";
	}
}
