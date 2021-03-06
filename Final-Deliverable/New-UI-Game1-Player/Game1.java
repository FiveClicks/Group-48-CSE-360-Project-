/**
 * Game function

 * @Author: Jeremy St. Ange, Kartik Gupta, Douglas Porter, Ryan Ditsworth
 * @Version: April 28, 2016
 */

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Game1
{
	
	// Running point totals for each roll and the whole turn.
	int rollPoints = 0;
	int turnPoints = 0;
	int totalPointsP1 = 0;
	int totalPointsP2 = 0;
	int allDiceRolled = 0;
	boolean p1Win = false;
	boolean p2Win = false;
	boolean playerTurn = true;
	ArrayList<Die> pointDice = new ArrayList<Die>();
	Die[] dieList = new Die[3];
	private static Scanner userSelect = new Scanner(System.in);
	
	
	/** Turn Constructor */
	public void Game() 
	{
		if (playerTurn == true)
		{
			System.out.println("Player 1:");
		}
		else
		{
			System.out.println("Player 2:");
		}
		// Initialize each dice.
		Die d1 = new Die();
		Die d2 = new Die();
		Die d3 = new Die();
	
		
		// Initial roll for each dice.
		d1.rollDie();
		d2.rollDie();
		d3.rollDie();
		
		/*testing purposes
		d1.setValue(1);
		d2.setValue(1);
		d3.setValue(1);
		*/
		dieList[0] = d1;
		dieList[1] = d2;
		dieList[2] = d3;
	
		printDice();
		selectDie();
	}	
	
	public void printDice() 
	{
		System.out.println("Here are the results of your roll:");
		System.out.println("Die 1: " + dieList[0].getValue());
		System.out.println("Die 2: " + dieList[1].getValue());
		System.out.println("Die 3: " + dieList[2].getValue());
	}
	
	public void selectDie() 
	{
		for (int numDie = 1; numDie < 4; numDie++) {
			if (!(dieList[numDie-1].getScored())) {
				System.out.println("Do you want to select Die: " + numDie + " to be scored?");
				System.out.println("y for yes\tn for no");
				if (userSelect.next().equals("y")) {
					dieList[numDie-1].setSelected(true);
					allDiceRolled++;
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
			System.out.println(pointDice.get(i).getValue());
		}
	}
	
	public void findPointDice() 
	{	
		for (int numDie = 0; numDie < 3; numDie++) 
		{
			if (dieList[numDie].getSelected())
				pointDice.add(dieList[numDie]);
		}
		
		quickSort(pointDice);
		scorePoints(pointDice);
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
				pointDice.get(0).setScored(false);
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
					pointDice.get(iterator).setScored(false);
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
						pointDice.get(iterator).setScored(false);
				}
			}
		}
		System.out.println("You have Scored:" + rollPoints);
		
		farkle();
	}
	
	public void farkle()
	{
		if (rollPoints == 0)
		{
			System.out.println("Farkle!");
			turnPoints = 0;
			endturn();
		}
		else
		{
			turnPoints += rollPoints;
			nextAction();
		}
	}
		
	public void nextAction() 
	{
		String userInput = "";
		System.out.println("Press q: Quit and add your turn score to your game score");
		System.out.println("Press r: Roll any dice that have not been used as point dice");
		
		userInput = userSelect.next();
		
		if (userInput.equals("q"))
		{
			if(playerTurn == true)
			{
				totalPointsP1 += turnPoints;
				
			}
			else
			{
				totalPointsP2 += turnPoints;
			}
			
			System.out.println("Player1 has " + totalPointsP1 + " total points");
			System.out.println("Player2 has " + totalPointsP2 + " total points");
			
			if(totalPointsP1 >= 500 || totalPointsP2 >= 500)
			{
				endGame();
			}
			else
			{
				endturn();
			}
		}
		else if (userInput.equals("r"))
		{
			if(allDiceRolled == 3)
			{
				System.out.println("Sorry, You cannot roll any more dice.");
				endturn();
			}
			else
			{
				reroll();
			}
		}
		else
		{
			nextAction();
		}
	}	
	
	private void reroll() 
	{	
		pointDice.clear();
		for (int numDie = 0; numDie < 3; numDie++) 
		{
			if (!dieList[numDie].getScored()){
				dieList[numDie].rollDie();
				pointDice.add(dieList[numDie]);
				allDiceRolled++;
			}
		}
		printDice();
		quickSort(pointDice);
		scorePoints(pointDice);
	}

	private void endturn() {
		if(playerTurn == true)
			playerTurn = false;
		else
		{
			playerTurn = true;
		}
		pointDice.clear();
		turnPoints = 0;
		Game();
	}
	
	public void endGame()
	{
		if(totalPointsP1 >= 500)
		{
			p1Win = true;
		}
		else if (totalPointsP2 >= 500)
		{
			p2Win = true;
		}
	}

	public boolean getP1Win()
	{
		return p1Win;
	}
	
	public boolean getP2Win()
	{
		return p2Win;
	}
	
	public int getTotalPointsP1()
	{
		return totalPointsP1;
	}
	public int getTotalPointsP2(){
		return totalPointsP2;
	}
	public void quickSort(ArrayList<Die> aList)
	{		
		doQuickSort(aList);
	}
	public ArrayList<Die> doQuickSort(ArrayList<Die> array) 
	{
		// if array is of size 1, return it since no sorting is required
		if(array.size() <= 1)
		{
			return array;
		}
		
		// create lesser and greater arraylists to hold values less than & greater than pivot
		ArrayList<Die> lesser = new ArrayList<Die>();
		ArrayList<Die> greater = new ArrayList<Die>();
		
		int pivotIndex = array.size() - 1; // make the last element in the array the pivot point
		int compareIndex = 0; // make the first element the compare point to start with
		int storeIndex = 0; // make the first element the store point to start with
		int lessIndex = 0; // initialize index for lesser (than pivot) array
		int greatIndex = 0; // initialize index for greater (than pivot) array
		
		// Go through the whole array applying one round of Quicksort algorithm using pivot point
		// 1) compare compare-point element with pivot-point element
		// 2) if it is smaller or equal, add it to lesser arraylist, and then move compare-point to next element, and 
		//    move store-point to next element
		// 3) if it is greater, add element to greater arrraylist, and move compare-point to next element
		// 4) repeat until end of array is reached
		while (compareIndex < pivotIndex)
		{
			if((array.get(compareIndex)).getValue() <= (array.get(pivotIndex)).getValue())
			{// compare-point element is smaller than or equal to pivot-point element
			 // add the compare-point element to lesser arraylist
				lesser.add(array.get(compareIndex));
				lessIndex++;
				compareIndex++;
				storeIndex++;
			}
			else
			{// compare-point element is greater than pivot-point element
			 // add the compare-point element to greater arraylist
				greater.add(array.get(compareIndex));
				greatIndex++;
				compareIndex++;
			}
		}
		// Reached end of array where compare-point is at pivot-point. 		
		// Start Recurring with lesser and greater arraylists
		lesser = doQuickSort(lesser);
		greater = doQuickSort(greater);
		
		
		// At each round, put the partially sorted arraylist together until whole list is sorted using concatenate.
		// the new concatenated is then rewritten to the array.
		copy(concatenate(lesser, array.get(pivotIndex), greater), array);
		return array;
	}
	
	// method used to copy the updated list to array.
	public void copy(ArrayList<Die> one, ArrayList<Die> another)
	{
		for (int i =0; i< one.size(); i++)
		{
			another.set(i,(one.get(i)));
		}
		
	}
	
	// Method to build concatenated list: lesser + pivot + greater
	public  ArrayList<Die> concatenate(ArrayList<Die> lesser,Die pivot,  ArrayList<Die> greater)
	{
		// create a newlist to hold the concatenated arraylist
		ArrayList<Die> newList = new ArrayList<Die>();
		// add lesser portion to newlist		
		for (int i = 0; i < lesser.size(); i++) {
			newList.add(lesser.get(i));
		}
		// add pivot to newlist
		newList.add(pivot);
		// add greaater portion to newlist
		for (int i = 0; i < greater.size(); i++) {
			newList.add(greater.get(i));
			}
		
		return newList;
	}


}