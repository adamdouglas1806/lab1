import java.util.Scanner;
//This will import the scanner class

public class PopcornTimer {

	public static void main(String[] args) {
		System.out.println("Welcome to Popcorn Timer");
		//This will display a welcome message for the user
		
		System.out.println("************************");
		//This will display multiple * in the next line
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your full name: ");
		//This will display a message asking for the user to input there name
		String name = scanner.nextLine();
		//This will allow the user to enter there name
		
		System.out.println("Hello "+name+", how many Popcorn packs do you have for today?");
		//This will display a message with the user's name
		//This line of code will also display a message asking the user how many popcorn packs they have
		int amount = scanner.nextInt();
		//This will allow the user to enter the number of popcorn packs
		
		System.out.println("You would like "+amount+" Popcorn packs");
		//This will display a message showing how many packs they have
		
		System.out.println("Please set the time to "+amount*205+" seconds");
		//This will display a message for the amount of seconds for the timer
		
		int minute = Math.round((amount*205)/60);
		int seconds = (amount*205) - (minute*60);
		//These lines of code will calculate the amount of minutes and remaining seconds
		
		System.out.println("Please set the time to "+minute+" min and "+seconds+" sec.");
		//This will display a message for the amount of minutes and seconds for the timer
		
	}

}