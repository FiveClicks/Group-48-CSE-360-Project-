import java.util.Scanner;
import java.io.IOException;

public class Turn {

	// Running point totals for each roll and the whole turn.
	int rollPoints = 0;
	int turnPoints = 0;
	
	Die[] dieList = new Die[6];
	
	private static Scanner userSelect = new Scanner(System.in);
	
	
	/** Turn Constructor */
	public Turn() {
		
		// Initialize each dice.
		Die d1 = new Die();
		Die d2 = new Die();
		Die d3 = new Die();
		Die d4 = new Die();
		Die d5 = new Die();
		Die d6 = new Die();
		
		// Initial roll for each dice.
		d1.randomRoll();
		d2.randomRoll();
		d3.randomRoll();
		d4.randomRoll();
		d5.randomRoll();
		d6.randomRoll();
		
		for (int numDie = 0; numDie < 6; numDie++) {
			dieList[numDie] = d1;
		}
		
		// Present each initial roll
		System.out.println("Here are the results of your first roll:");
		System.out.println("Die 1: " + d1.getValue());
		System.out.println("Die 2: " + d2.getValue());
		System.out.println("Die 3: " + d3.getValue());
		System.out.println("Die 4: " + d4.getValue());
		System.out.println("Die 5: " + d5.getValue());
		System.out.println("Die 6: " + d6.getValue());
		
		selectDie();
		//Prompt user for next action
		nextAction();
	}	
	
	public void selectDie() {
		for (int numDie = 1; numDie < 7; numDie++) {
			if (!(dieList[numDie-1].getScored())) {
				System.out.println("Do you want to select Die: " + numDie + " to be scored?");
				System.out.println("y for yes\tn for no");
				if (userSelect.next().equals("y")) {
					dieList[numDie-1].setSelected(true);
				}
			}
				
		}
	}
	
	public void nextAction() {
		String userInput = "";
		
		System.out.println("Press q: Quit and add your turn score to your game score");
		System.out.println("Press r: Roll any dice that have not been used as point dice");
		
		userInput = userSelect.next();
		
		if (userInput.equals("q"))
			endTurn();
		else if (userInput.equals(r))
			roll();
	}
	
	public int endTurn(){
		// Add that players turnScore to their appropriate totalScore
		// Return that players totalScore 
		return;
	}
	public void roll() {
		
		for (int dieNum = 1; dieNum < 7; dieNum++) {
			
		}
	}
	
	
}
