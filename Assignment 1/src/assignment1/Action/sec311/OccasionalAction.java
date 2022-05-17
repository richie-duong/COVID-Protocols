package assignment1.Action.sec311;

/**
 * OccasionalAction.java subclass for Assignment 1 Submission
 * 
 * This is a subclass and inherits from the Action superclass. OccasionalAction() passes a string to the superclass into setDescription, allowing toString() 
 * from the superclass to retrieve the String and return it. Furthermore OccasionalAction() passes an int to set the field to match the deadline value that was passed.
 * 
 * @author Richard Duong
 * @version 1.0
 * @see Action
 * @since javac 11.0.12
 */
public class OccasionalAction extends Action {
	
	/**
	 * Day field with type int, obtained from OccasionalAction(String desc, int day)
	 */
	private int day;
	
	/**
	 * Default constructor for the Occasional Action object
	 */
	public OccasionalAction() {
	}
	
	/**
	 * OccasionalAction takes in a String description an occasional action object and passes the argument to the superclass's setDescription() method.
	 * Furthermore, an int for day is taken in to initialize the class's 'day' field for it to be referenced in later method(s).
	 * @param desc Takes in a string action description
	 * @param day Takes in a day deadline
	 */
	public OccasionalAction(String desc, int day) {
		super.setDescription(desc);
		setDeadline(day);
	}
	
	/**
	 * This method passes an int value for day from the driver/test method to the OccassionalAction() constructor, to this method to set the 'day' field to equal
	 * the action object's occasional deadline
	 * @param day The integer day passed from constructor to set a value to field
	 */
	public void setDeadline(int day) {
		this.day = day;
	}
	
	/**
	 * occursOn() compares the int value passed into parameter to the OccasionalAction's day field. As long as it equals, the return will always remain true.
	 * Year and Month values are not considered as Occasional Actions fall on a certain day every month and year.
	 * @return True is returned if internal condition met, otherwise returns False
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {
		if (day == this.day) {
			return true;
		}
		else return false;
	}
}
