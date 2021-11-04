import java.util.Scanner;

public class SwitchDemo {
	
	public static void main(String args[]) {
		
		System.out.println("Please press :");
		System.out.println("1. Balance Check");
		System.out.println("2. Credit/Debit card info");
		System.out.println("3. Personal Loan");
		System.out.println("4. Connect to our representative");
		System.out.println("0. exit");
		
		Scanner obj = new Scanner(System.in);
		
		int number = obj.nextInt();
		
		switch(number){
		case 1:
		System.out.println("I will do the balance check");
		break;
		
		case 2:
		System.out.println("I will fetch credit/debit info");
		break;
		
		case 3:
		System.out.println("I will fetch Loan info");
		break;
		
		case 4:
		System.out.println("I will connect to concerned person");
		break;
		
		case 0:
		System.out.println("exit");
		break;
		
		default:
		System.out.println("Please provide correct input");
		break;
	 }
	
  }

}
