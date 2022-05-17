package assignment1.Action.sec311;

/**
 * This is an Action driver class to test out the functionalities of Java Reflection(s), and also the Regular and Occasional objects.
 * 
 * @author Richard Duong
 * @version 1.0
 * @see Action
 * @since javac 11.0.12
 */
public class ActionDriver {

	/**
	 * This is the main method for this Driver class.
	 * An object was created for the purpose of making two instances of conditions utilizing Java Reflection to ensure that the RegularAction subclass inherits from the 
	 * Action superclass and does not contain any fields. Furthermore, an additional object was made (this time with a String as an argument) to pass along an action description
	 * and test to see if the toString() and occursOn() methods work as expected.
	 * 
	 * @param args Stores Java command-line arguments
	 */
	public static void main(String[] args) {
		
		RegularAction child = new RegularAction();
		
		System.out.print("RegularAction is just a subclass of Action: ");
		if (child.getClass().getSuperclass() == Action.class) {
			System.out.println(child.getClass().getSuperclass() == Action.class);
		}
		System.out.println("Expected: true");
		
		
		System.out.print("RegularAction activities have no extra fields: ");
		if (child.getClass().getDeclaredFields().length == 0) {
			System.out.print("true\n");
		}
		System.out.println("Expected: true");
		System.out.println(child.getClass().getDeclaredFields().length);
		
		RegularAction message = new RegularAction("Wash your hands");
		System.out.println("Looking at regular actions: " + message.toString());
		System.out.println("Expected: Wash your hands");
		System.out.println(child.occursOn(0, 0, 0));
		System.out.println("Expected: true");
	}

}
