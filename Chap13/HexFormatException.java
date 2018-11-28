public class HexFormatException extends Exception{
	private String invalidString;
	
	public HexFormatException(String invalidString){
		this.invalidString = invalidString;
	}
	
	public String getInvalidString(){
		return this.invalidString;
	}
}