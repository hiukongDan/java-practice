public class TestTriangleException{
	public static void main(String[] args){
		try{
			SimpleTriangle tri = new SimpleTriangle(1, 4, 2);
		}
		catch(IllegalTriangleException ex){
			System.out.println("Illegal triangle: " + ex.getSides());
		}
	}
}