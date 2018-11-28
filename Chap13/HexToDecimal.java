import java.util.Scanner;

public class HexToDecimal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
		int decimalValue = 0;
		try{
			decimalValue = hexToDecimal(hex);
		}
		catch(HexFormatException ex){
			System.out.println("Invalid hex string: " + ex.getInvalidString());
		}
		System.out.println("The decimal value for hex number " + hex + " is " +
			decimalValue);
	}
	
	public static int hexToDecimal(String hex) throws HexFormatException{
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++){
			char hexChar = hex.charAt(i);
			try{
				decimalValue = decimalValue * 16 + hexCharToDecimalChar(hexChar);
			}
			catch(HexFormatException ex){
				throw new HexFormatException(hex);
			}
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimalChar(char ch) throws HexFormatException{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= 'a' && ch <= 'f')
			return 10 + ch - 'a';
		else if (ch >= '0' && ch <= '9')
			return (int)(ch - '0');
		else
			throw new HexFormatException("");
	}
}