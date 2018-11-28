import java.util.Scanner;
public class ArrayOutBounds{
	public static void main(String[] args){
		int[] array = new int[100];
		for (int i = 0; i < 100; i++)
			array[i] = getRandomInt();
		
		Scanner input = new Scanner(System.in);
		int index = 0;
		try{
			System.out.print("Enter an index: ");
			index = input.nextInt();
			System.out.println("The " + index + " number of the array is " + array[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Out of Bounds: 0 - 99: ");
		}
	}
	
	public static int getRandomInt(){
		return (int)(Math.random() * 100);
	}
}