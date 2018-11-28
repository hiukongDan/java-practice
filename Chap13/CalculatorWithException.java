public class CalculatorWithException{
	public static void main(String[] args){
		if (args.length != 3){
			System.out.println("Invalid input\nPlease use operand operator operand");
			System.exit(0);
		}
		
		double a = 0;
		double b = 0;
		try{
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[2]);
		}
		catch(NumberFormatException ex){
			ex.printStackTrace();
			System.out.println("Invalid input\nPlease use operand operator operand");
			System.exit(0);
		}
		
		double res = 0;
		try{
			switch(args[1]){
				case "+": res = a + b; break;
				case "-": res = a - b; break;
				case "*": res = a * b; break;
				case "/": res = a / b; break;
				case "%": res = a % b; break;
				default: break;
			}
		}
		catch(ArithmeticException ex){
			ex.printStackTrace();
			System.exit(0);
		}
		
		System.out.println(a + " " + args[1] + " " + b + " = " + res);
	}
}
