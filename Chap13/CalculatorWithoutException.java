public class CalculatorWithoutException{
	public static void main(String[] args){
		if (args.length != 3){
			System.out.println("Invalid input\nPlease use operand operator operand");
			System.exit(0);
		}
		
		double a = 0;
		double b = 0;
		
		if (!validInput(args[0]) || !validInput(args[2])){
			System.out.println("Wrong input\nPlease use operand operator operand");
			System.exit(0);
		}	
		
		a = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[2]);
		
		double res = 0;
		switch(args[1]){
			case "+": res = a + b; break;
			case "-": res = a - b; break;
			case "*": res = a * b; break;
			case "/": res = a / b; break;
			case "%": res = a % b; break;
			default: break;
		}
		
		System.out.println(a + " " + args[1] + " " + b + " = " + res);
	}
	
	public static boolean validInput(String input){
		for (int i = 0; i < input.length(); i++)
			if (!Character.isDigit(input.charAt(i)))
				return false;
		return true;
	}
}
