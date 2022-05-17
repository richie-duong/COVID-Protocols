package assignment1.Action.sec311;

/**
 * This is an Action driver class to test out the functionalities of Java Reflection(s), and also the Occasional and Rare objects.
 * 
 * @author Richard Duong
 * @version 1.0
 * @see Action
 * @since javac 11.0.12
 */
public class ActionDriver2 {

	/**
	 * This is the main method for Driver class 2.
	 * An object was created for the purpose of making two instances of conditions utilizing Java Reflection to ensure that the Occasional and Rare classes inherits from the 
	 * Action superclass and does not contain any more than 1 and 2 fields respectively. Furthermore, an Occasional and Rare object was created to pass along arguments
	 * to make sure that the toString() and occursOn() methods from both subclasses work as expected.
	 * 
	 * @param args Stores Java command-line arguments
	 */
	public static void main(String[] args) {
		
		OccasionalAction occ = new OccasionalAction();
		System.out.print("OccasionalAction is a subclass of Action: ");
		if (occ.getClass().getSuperclass() == Action.class) {
			System.out.print("true\n");
		}
		System.out.println("Expected: true");
		
		RareAction rare = new RareAction();
		System.out.print("RareAction is subclass of Action: ");
		if (rare.getClass().getSuperclass() == Action.class) {
			System.out.print("true\n");
		}
		System.out.println("Expected: true");
		
		System.out.print("OccasionalAction activities have no extra fields: ");
		if (occ.getClass().getDeclaredFields().length == 1) {
			System.out.print("true\n");
		}
		System.out.println("Expected: true");
		
		System.out.print("RareAction activities have no extra fields: ");
		if (rare.getClass().getDeclaredFields().length == 2) {
			System.out.print("true\n");
		}
		System.out.println("Expected: true");
		System.out.println(rare.getClass().getDeclaredFields().length);
		
		System.out.println("Expected: Take a PCR Test.");
		OccasionalAction test = new OccasionalAction("Take a PCR Test.", 5);
		System.out.println(test.occursOn(2022, 12, 5));
		System.out.println("Expected: true");
		
		System.out.println("Expected: Get a booster shot.");
		RareAction test2 = new RareAction("Take a PCR Test.", 12, 15);
		System.out.println(test2.occursOn(2022, 12, 15));
		System.out.println("Expected: true");
		
	}

}
