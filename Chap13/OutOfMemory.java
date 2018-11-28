import java.util.ArrayList;

public class OutOfMemory{
	public static void main(String[] args){
		try{
			ArrayList<Nothin> n = new ArrayList<Nothin>();
			while(true)
				n.add(new Nothin(12));
		}
		catch(OutOfMemoryError err){
			System.out.println("JVM: out of memory");
		}
	}
}

class Nothin{
	private int meaningless;
	
	public Nothin(){
		this(1);
	}
	
	public Nothin(int meaningless){
		this.meaningless = meaningless;
	}
}