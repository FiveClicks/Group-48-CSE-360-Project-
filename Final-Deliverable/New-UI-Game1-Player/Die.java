/**
 * 
 * @author Jeremy St. Ange

 * @version 1
 * 
 * A die object that allows for manipulation.
 *
 */
import java.util.*;

public class Die {
	
	private int value;
	private boolean scored;
	private boolean selected;
	
	/** Die constructor */
	public Die() {
		
		value = 0;
		scored = false;
		selected = false;
	}
	
	/**
	 * Randomly rolls the die
	 */
	public void rollDie() {
		value = randomRoll();
	}
	
	/**
	 * Getter for whether a die has been scored.
	 * @return	scored
	 */
	public boolean getScored() {
		return scored;
	}
	
	/**
	 * Getter for whether a die has been selected to be scored.
	 * @return	selected
	 */
	public boolean getSelected() {
		return selected;
	}
	
	public void setSelected(boolean trueOrFalse) {
		selected = trueOrFalse;
	}
	
	
	/**
	 * Getter for the die value
	 * @return	value
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Generates a random die value
	 * @return	randomInt
	 */
	public int randomRoll() {
		int randomInt = (int)(Math.random()*6+1);
		
		return randomInt;
	}

	public void setScored(boolean trueOrFalse) {
		scored = trueOrFalse;
	}
	
	public void setValue(int incValue) {
		value = incValue;
	}
	
	
	
}