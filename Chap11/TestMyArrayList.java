public class TestMyArrayList{
	public static void main(String[] args){
		MyArrayList a1 = new MyArrayList();
	a1.add("Lilith");
	a1.add("Lily");
	a1.set(1, "John");
	a1.add("Leah");
	System.out.println("is empty? " + a1.isEmpty());
	for (int i = 0; i < a1.size(); i++)
		System.out.println(a1.get(i));
	}
}
