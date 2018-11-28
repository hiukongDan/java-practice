public class SimpleTriangle{
	private double a;
	private double b;
	private double c;
	
	public SimpleTriangle() throws IllegalTriangleException{
		this(1, 1, 1);
	}
	
	public SimpleTriangle(double a, double b, double c)
	throws IllegalTriangleException{
		if (isValid(a, b, c)){
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else
			throw new IllegalTriangleException(a, b, c);
	}
	
	private boolean isValid(double a, double b, double c){
		if ((a + b <= c) || (a + c <= b) || (b + c <= a))
			return false;
		
		return true;
	}
}