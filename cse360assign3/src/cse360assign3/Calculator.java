/** This class is calculator which features methods to add, subtract, divide, and multiply while keeping history 
 * 
 * @version 2/27/16
 * @author Peter K., Pin: 421
 * GitHub URL: https://github.com/Paramity/cse360
 */
package cse360assign3;

public class Calculator {
	
	private int total; // This variable stores the total value after every operation

	private String history; //This String stores the history of operations done
	
	/**This is the constructor for the calculator, it sets the total to 0
	 * 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0"; //initialize history to include 0, which precedes the first operation
	}
	
	/** This is a getter method which will return the private integer total, which stores the total value after operations
	 * 
	 * @return total stores the value after each operation
	 */
	public int getTotal () {
		return total;
	}
	
	/** This method allows the user to add to the total
	 * 
	 * @param value the amount to increment the total by
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/** This method allows for the user to subtract from the total
	 * 
	 * @param value the amount to subtract the total by
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;

	}
	
	/** This method allows the user to multiply the total by a specified amount
	 * 
	 * @param value the amount to multiply the total by
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;

	}
	
	/** This method allows the user to divide the total by a specified amount, if 0 is passed, the total will be set to 0 and no error will be given
	 * 
	 * @param value the amount to divide the total by
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
			
		}
		else {
			total = total / value;
		}
		
		history = history + " / " + value;

	}
	
	/** This method will return a history of operations done in the form of a String
	 * 
	 * @return history a history of operations
	 */
	public String getHistory () {
		return history;
	}
}