/** This class is calculator which features methods to add, subtract, divide, and multiply while keeping history 
 * 
 * @version 2/27/16
 * @author Peter K., Pin: 421
 */
package cse360assign3;

public class Calculator {
// This variable stores the total value per operation
	private int total;
	
	/**This is the constructor for the calculator, it sets the total to 0
	 * 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** This is a getter method which will return the private integer total, which stores the total value after operations
	 * 
	 * @return
	 */
	public int getTotal () {
		return 0;
	}
	
	/** This method allows the user to add to the total
	 * 
	 * @param value the amount to increment the total by
	 */
	public void add (int value) {
		
	}
	
	/** This method allows for the user to subtract from the total
	 * 
	 * @param value the amount to subtract the total by
	 */
	public void subtract (int value) {
		
	}
	
	/** This method allows the user to multiply the total by a specified amount
	 * 
	 * @param value the amount to multiply the total by
	 */
	public void multiply (int value) {
		
	}
	
	/** This method allows the user to divide the total by a specified amount
	 * 
	 * @param value the amount to divide the total by
	 */
	public void divide (int value) {
		
	}
	
	/** This method will return a history of operations done in the form of a String
	 * 
	 * @return history a history of operations
	 */
	public String getHistory () {
		return "";
	}
}