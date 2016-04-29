import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Game
{

	// Running point totals for each roll and the whole turn.
	int rollPoints = 0;
	int turnPoints = 0;
	ArrayList<Die> pointDice = new ArrayList<Die>();
	Die[] dieList = new Die[6];
	
	private static Scanner userSelect = new Scanner(System.in);
	
	
	/** Turn Constructor */
	public void Turn() 
	{
		
		// Initialize each dice.
		Die d1 = new Die();
		Die d2 = new Die();
		Die d3 = new Die();
		Die d4 = new Die();
		Die d5 = new Die();
		Die d6 = new Die();
		
		// Initial roll for each dice.
		d1.rollDie();
		d2.rollDie();
		d3.rollDie();
		d4.rollDie();
		d5.rollDie();
		d6.rollDie();
		
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
		findPointDice();
	}
	
	public void printFindDieList()
	{
		for(int i = 0; i< pointDice.size(); i++)
		{
			System.out.println(pointDice.get(i));
		}
	}
	
	public /*ArrayList<Die>*/ void findPointDice() 
	{
		
		for (int numDie = 0; numDie < 6; numDie++) {
			if (dieList[numDie].getSelected())
				pointDice.add(dieList[numDie]);
		}
		
		//pointDice.sort(Die.getValue());
		//return pointDice;
	}
	
	// Determine the points earned for an array of rolled selected dice to be scored.
		public void scorePoints(ArrayList<Die> pointDice){
			rollPoints = 0;
			
			// 1 rolled die is selected to be scored
			if (pointDice.size() == 1) {
				if (pointDice.get(0).getValue() == 1)
					rollPoints = rollPoints + 100;
				else if (pointDice.get(0).getValue() == 5)
					rollPoints = rollPoints + 50;
			}
			
			// 2 rolled dice were selected to be scored
			if (pointDice.size() == 2) {
				for (int aryPosition = 0; aryPosition < pointDice.size(); aryPosition++) {
					if (pointDice.get(aryPosition).getValue() == 1)
						rollPoints = rollPoints + 100;
					else if (pointDice.get(aryPosition).getValue() == 5)
						rollPoints = rollPoints + 50;
				}
			}
			// 3 rolled dice were selected to be scored
			// 4 rolled dice were selected to be scored
			// 5 rolled dice were selected to be scored
			// 6 rolled dice were selected to be scored
		}
	
	public void nextAction() {
		String userInput = "";
		
		System.out.println("Press q: Quit and add your turn score to your game score");
		System.out.println("Press r: Roll any dice that have not been used as point dice");
		
		userInput = userSelect.next();
		
		if (userInput.equals("q"))
			endTurn();
		else if (userInput.equals("r"))
			roll();
	}
	
	public void endTurn(){
		// Add that players turnScore to their appropriate totalScore
		// Return that players totalScore 
	//	return;
	}
	public void roll() {
		
		for (int dieNum = 1; dieNum < 7; dieNum++) {
			
		}
	}
	
	
}