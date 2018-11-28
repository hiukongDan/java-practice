public class BinaryFormatException extends Exception{
	private String invalidString;
	
	public BinaryFormatException(String invalidString){
		this.invalidString =invalidString;
	}
	
	public String getInvalidString(){
		return this.invalidString;
	}
}