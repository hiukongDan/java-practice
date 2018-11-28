import java.util.Scanner;

public class NumberFormatHandling{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		while(true){
			try{
				System.out.print("Enter an enteger a: ");
				String tmp = input.next();
				a = Integer.parseInt(tmp);
				break;
			}
			catch(NumberFormatException ex){
				System.out.println("Invalid input, please enter: integer");
			}
		}
		
		while(true){
			try{
				System.out.print("Enter an enteger b: ");
				String tmp = input.next();
				b = Integer.parseInt(tmp);
				break;
			}
			catch(NumberFormatException ex){
				System.out.println("Invalid input, please enter: integer");
			}
		}
		
		// Display sum
		System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
	}
}