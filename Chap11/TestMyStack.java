import java.util.Scanner;

public class TestMyStack{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		MyStack s1 = new MyStack();
		System.out.println("Enter 5 string: ");
		for (int i = 0; i < 5; i++){
			String s = input.next();
			s1.push(s);
		}
		
		// Display them
		for(int i = 0; i < 5; i++)
			System.out.println(s1.pop());
	}
}
