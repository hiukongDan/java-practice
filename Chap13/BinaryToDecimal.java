import java.util.Scanner;

public class BinaryToDecimal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary string: ");
		String binaryString = input.nextLine();
		
		int decimalValue = 0;
		try{
			decimalValue = binaryToDecimal(binaryString);
		}
		catch(BinaryFormatException ex){
			System.out.println("Invalid input: " + ex.getInvalidString());
			System.exit(0);
		}
		
		System.out.println("The equivalent decimal value of binary " + binaryString +
			" is " + decimalValue);
	}
	
	public static int binaryToDecimal(String binaryString)
	throws BinaryFormatException{
		int decimalValue = 0;
		for (int i = 0; i < binaryString.length(); i++){
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1')
				throw new BinaryFormatException(binaryString);
			else
				decimalValue = decimalValue * 2 + (int)(binaryString.charAt(i) - '0');
		}
		
		return decimalValue;
	}
}