public class IllegalTriangleException extends Exception{
	private double a;
	private double b;
	private double c;
	
	public IllegalTriangleException(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String getSides(){
		return "" + a + ", " + b + ", " + c;
	}
}