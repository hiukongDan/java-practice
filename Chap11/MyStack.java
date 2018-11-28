public class MyStack extends java.util.ArrayList<String>{
	public static final long serialVersionUID = 42L;
	public MyStack(){
	}
	
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public int getSize(){
		return super.size();
	}
	
	public String peek(){
		return super.get(super.size() - 1);
	}
	
	public String pop(){
		String s = super.get(super.size() - 1);
		super.remove(super.size() - 1);
		return s;
	}
	
	public void push(String s){
		super.add(super.size(), s);
	}
	
	public int search(String s){
		return super.size() - 1 - super.lastIndexOf(s) ;
	} 
}
