package assignment1.Action.sec311;

/**
 * RareAction.java subclass for Assignment 1 Submission
 * 
 * This is a subclass and inherits from the Action superclass. RareAction() passes a string to the superclass into setDescription, allowing toString() 
 * from the superclass to retrieve the String and return it. Furthermore OccasionalAction() passes 2 ints to set the fields to match the deadline values that were passed.
 * 
 * @author Richard Duong
 * @version 1.0
 * @see Action
 * @since javac 11.0.12
 */
public class RareAction extends Action{
	
	/**
	 * Month field with type int, obtained from RareAction(String desc, int month, int day)
	 */
	private int month;
	
	/**
	 * Year field with type int, obtained from RareAction(String desc, int month, int day)
	 */
	private int day;
	
	
	/**
	 * Default construction for Rare Action object
	 */
	public RareAction() {
	}
	
	/**
	 * OccasionalAction takes in a String description an occasional action object and passes the argument to the superclass's setDescription() method.
	 * Furthermore, an int for day is taken in to initialize the class's 'day' field for it to be referenced in later method(s).
	 * @param desc Takes in a String action description
	 * @param month Takes in a month deadline
	 * @param day Takes in a day deadline
	 */
	public RareAction(String desc, int month, int day) {
		super.setDescription(desc);
		setDeadline(month, day);
	}
	
	/**
	 * This method passes int values for month and day from the driver/test method to the RareAction() constructor, to this method to set the 'day' and 'month fields to equal
	 * the action object's rare deadline
	 * @param month The integer month is passed from constructor to set a value to the 'month' field
	 * @param day The integer day is passed from constructor to set a value to the 'day' field
	 */
	public void setDeadline(int month, int day) {
		this.month = month;
		this.day = day;
	}
	
	/**
	 * occursOn() compares the two int values passed into parameter to both declared RareAction's fields. As long as all equals, the return will always remain true.
	 * This only occurs on a certain date, therefore year, month, and day are all utilized.
	 * @return True is returned if internal condition met, otherwise returns False
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {
			return month == this.month && day == this.day;
		}
	}

