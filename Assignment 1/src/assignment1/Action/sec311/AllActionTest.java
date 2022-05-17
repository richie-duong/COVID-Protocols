package assignment1.Action.sec311;
import java.util.Scanner;

/**
 * This is an Action driver class to test out the functionalities of Java Reflection(s), and also the Occasional and Rare objects.
 * 
 * @author Richard Duong
 * @version 1.0
 * @see Action
 * @since javac 11.0.12
 */
public class AllActionTest {

	/**
	 * This is the main method for this Driver class.
	 * A scanner is declared and initialized to take three integers of the date entered by the users (formatted as: year month day). An overview with the user's input is then printed:
	 * Five separate objects were created and corresponds with their respective constructors depending on what is passed in the parameters (action desc, and date(s)).
	 * The five objects and their description(s) + date(s) were determined by the sample chart provided in the Additional Notes' slides.
	 * An Object array is then declared and initialized for the for loop to go through to perform a condition check and if true, prints out the description from superclass's toString().
	 * 
	 * @param args Stores Java command-line arguments
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a date (like 2010 01 30): ");
		int year = keyboard.nextInt();
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		
		System.out.println("These are your actions on " + month + "/" + day + "/" + year + ":");
		
		Action action1 = new RegularAction("Wash your hands.");
		Action action2 = new RegularAction("Sit two meters apart.");
		Action action3 = new OccasionalAction("Take a PCR Test.", 19);
		Action action4 = new RareAction("Get a booster shot.", 11, 19);
		Action action5 = new RareAction("Wear a mask.", 12, 7);

		
		Action[] actions = {action1, action3, action4, action5, action2};
		
		for(int a = 0; a < actions.length; a++) {
			if(actions[a].occursOn(year, month, day)) {
				System.out.println(actions[a].toString());
			}
		}		
		keyboard.close();
	}

}
