import java.util.Scanner;

public class WhileLoopDemo{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		int number = obj.nextInt();
		
		
		//I need to print square of a number from "USER INPUT" to number 10
		
		
	while(number<=10)	
	{
		System.out.println(number*number);
		number++;
	}	
	
	}
}	