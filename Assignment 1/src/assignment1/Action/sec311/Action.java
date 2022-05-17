package assignment1.Action.sec311;

/**
 * Action.java superclass for Assignment 1 Submission
 * 
* This is the Action Superclass class that provides a catalog of actions to be carried out in view of COVID-19 OPH protocols.
* This abstract class serves as a base for the 3 other subclasses.
* 
* @author Richard Duong
* @version 1.1
* @since javac 11.0.12
*/
public abstract class Action {
	
	/**
	 * Description field with type String, obtained from setDescription()
	 */
	private String description;

/**
   Constructs an action without a description.
*/
	public Action() {
		description = "";
	}

/**
   Sets the description of this action.
   @param description the text description of the action
*/
	public void setDescription(String description) {
		this.description = description;
	}

/**
   Determines if this action occurs on the specified date.
   @param year the year
   @param month the month
   @param day the day
   @return Boolean value returned depending occursOn() conditions within subclasses
*/
	public abstract boolean occursOn(int year, int month, int day);
	
/**
   Converts action activity to string description.
   @return String description field
*/
	public String toString() {
		return description;
	}

}


