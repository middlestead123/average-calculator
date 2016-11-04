import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.middlestead
 *
 */
public class AvrageCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a scanner for input if we have input
		Scanner userInput = new Scanner(System.in);
		
		//Create variables to store that input
		double firstMark;
		double secondMark;
		double thirdMark;
		double fourthMark;
		double fifthMark;
		
		//Create variables to store calculations
		double average;
		
		//Ask for input and store it in the variables
		System.out.println("what is your first mark?");
		firstMark = userInput.nextDouble();
		System.out.println("what is your second mark?");
		secondMark = userInput.nextDouble();
		System.out.println("what is your third mark?");
		thirdMark = userInput.nextDouble();
		System.out.println("what is your fourth mark?");
		fourthMark = userInput.nextDouble();
		System.out.println("what is your fifth mark?");
		fifthMark = userInput.nextDouble();
		
		//We do our calculations
		average = (firstMark + secondMark + thirdMark + fourthMark + fifthMark)/5;
		
		//Display our info back to the user
		System.out.println("mark 1: "+ firstMark);
		System.out.println("mark 2: "+ secondMark);
		System.out.println("mark 3; "+ thirdMark);
		System.out.println("mark 4: "+ fourthMark);
		System.out.println("mark 5: "+ fifthMark);
		System.out.println("average: "+ average);
		
		//Close our Scanner
		userInput.close();
	}

}
