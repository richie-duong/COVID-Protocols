package assignment1.Action.sec311;

/**
 * RegularAction.java subclass for Assignment 1 Submission
 * 
 * This class is a subclass and inherits from the Action superclass. RegularAction() passes a string to the superclass into setDescription 
 * to set the field to match the passed description, evidently allowing toString() from the superclass to retrieve the String and return it.
 * 
 * @author Richard Duong
 * @version 1.0
 * @see Action
 * @since javac 11.0.12
 */
public class RegularAction extends Action {
	
	/**
	 * This is the default constructor for RegularAction object
	 */
	public RegularAction() {
	}
	
	/**
	 * RegularAction takes in a String description from a regular action object and passes the argument to the superclass's setDescription() method.
	 * @param desc String action description
	 */
	public RegularAction(String desc) {
		super.setDescription(desc);
	}

	/**
	 * occursOn have no conditions and will always return true as Regular Actions are performed daily or regardless of date entered.
	 * @return Boolean returns true with no condition(s)
	 */
	@Override
	public boolean occursOn(int year, int month, int day) {
		return true;
	}
	
	
}

