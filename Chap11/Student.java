public class Student extends Person{
	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	
	private int status = FRESHMAN;
	public Student(){
	}
	
	public Student(String name, String address, String phoneNumber,
	String emailAddress, int status){
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}
	
	public String getStatus(){
		String res = "";
		switch(this.status){
			case 1: res += "Freshman\n"; break;
			case 2: res += "Sophomore\n"; break;
			case 3: res += "Junior\n"; break;
			case 4: res += "Senior\n"; break;
		}
		return res;
	}
	
	public String toString(){
		return super.toString() + this.getStatus();
	}
}
