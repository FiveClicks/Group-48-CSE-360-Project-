/**
 * Game function
 * @Author: Jeremy St. Ange, Kartik Gupta, Douglas Porter, Ryan Ditsworth
 * @Version: April 28, 2016
 */

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
	public void Game() 
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
		
		dieList[0] = d1;
		dieList[1] = d2;
		dieList[2] = d3;
		dieList[3] = d4;
		dieList[4] = d5;
		dieList[5] = d6;
		
	}	
	
	public void printDice() 
	{
				System.out.println("Here are the results of your roll:");
				System.out.println("Die 1: " + dieList[0]);
				System.out.println("Die 2: " + dieList[1]);
				System.out.println("Die 3: " + dieList[2]);
				System.out.println("Die 4: " + dieList[3]);
				System.out.println("Die 5: " + dieList[4]);
				System.out.println("Die 6: " + dieList[5]);
	}
	
	public void selectDie() 
	{
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
	
	// PRINT OUT ARRAYLIST FOR TESTING PURPOSES
	public void printFindDieList()
	{
		for(int i = 0; i< pointDice.size(); i++)
		{
			System.out.println(pointDice.get(i));
		}
	}
	
	public ArrayList<Die> findPointDice() 
	{
		
		ArrayList<Die> pointDice = new ArrayList<Die>();
		
		for (int numDie = 0; numDie < 6; numDie++) 
		{
			if (dieList[numDie].getSelected())
				pointDice.add(dieList[numDie]);
		}
		
		//SORT ARRAY?
		return pointDice;
	}
	
	// Determine the points earned for an array of rolled selected dice to be scored.
		public void scorePoints(ArrayList<Die> pointDice)
		{
			rollPoints = 0;
			
			// 1 rolled die is selected to be scored
			if (pointDice.size() == 1) 
			{
				if (pointDice.get(0).getValue() == 1) 
				{
					rollPoints = rollPoints + 100;
					pointDice.get(0).setScored(true);
				}
				else if (pointDice.get(0).getValue() == 5) 
				{
					rollPoints = rollPoints + 50;
					pointDice.get(0).setScored(true);
				}
				else
					pointDice.get(0).setSelected(false);
			}
			
			// 2 rolled dice were selected to be scored
			if (pointDice.size() == 2) {
				for (int iterator = 0; iterator < pointDice.size(); iterator++) 
				{
					if (pointDice.get(iterator).getValue() == 1) 
					{
						rollPoints = rollPoints + 100;
						pointDice.get(iterator).setScored(true);
					}
					else if (pointDice.get(iterator).getValue() == 5) 
					{
						rollPoints = rollPoints + 50;
						pointDice.get(iterator).setScored(true);
					}
					else
						pointDice.get(iterator).setSelected(false);
				}
			}
			// 3 rolled dice were selected to be scored
			if (pointDice.size() == 3) 
			{
				if (pointDice.get(0).getValue() == 1 && pointDice.get(1).getValue() == 1 && pointDice.get(2).getValue() == 1) 
				{
					rollPoints = rollPoints + 1000;
					pointDice.get(0).setScored(true);
					pointDice.get(1).setScored(true);
					pointDice.get(2).setScored(true);
				}
				else if (pointDice.get(0).getValue() == pointDice.get(1).getValue() && pointDice.get(1).getValue() == pointDice.get(2).getValue()) 
				{
					rollPoints = rollPoints + (100 * pointDice.get(0).getValue());
					pointDice.get(0).setScored(true);
					pointDice.get(1).setScored(true);
					pointDice.get(2).setScored(true);
				}
				else {
					for (int iterator = 0; iterator < pointDice.size(); iterator ++) 
					{
						if (pointDice.get(iterator).getValue() == 1) 
						{
							rollPoints = rollPoints + 100;
							pointDice.get(iterator).setScored(true);
						}
						else if (pointDice.get(iterator).getValue() == 5) 
						{ 
							rollPoints = rollPoints + 50;
							pointDice.get(iterator).setScored(true);
						}
						else
							pointDice.get(iterator).setSelected(false);
					}
				}
			}
			// 4 rolled dice were selected to be scored
			// 5 rolled dice were selected to be scored
			// 6 rolled dice were selected to be scored
		}
	
	public void nextAction() 
	{
		String userInput = "";
		
		System.out.println("Press q: Quit and add your turn score to your game score");
		System.out.println("Press r: Roll any dice that have not been used as point dice");
		
		userInput = userSelect.next();
		
		if (userInput.equals("q"))
			// End the turn
			;
		else if (userInput.equals("r"))
			// Roll again
			;
	}	
}
