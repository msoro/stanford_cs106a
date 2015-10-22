import acm.program.*;
import acm.util.*;

public class RollDice extends ConsoleProgram {

	/* Constant 
	--
	Number of sides on each die */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int NUM_SIDES = 6;
	
	public void run() {
		int numRolls = readInt("Number of rolls: ");
		
		for (int i = 0; i < numRolls; i++) {
			int roll = rgen.nextInt(1, NUM_SIDES);
			println("You rolled: " + roll);
		}
	}
	
	/* Private instance variable */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}