/*
 * @Author: Ryan Ditsworth, Kartik Gupta & Jeremy St. Ange
 * @Version: April 28, 2016
 * 
 * Class Description: This class creates 6 dice. They are then given a random number and then displayed. 
 * The UI class uses this class.
 */
public class dicegame 
{
	// Running players points
	int player1_score = 0;
	int player2_score = 0;
	
	// Current roll and turn points
	int rollPoints = 0;
	int turnPoints = 0;
	
	// Finds how many rolled dice have been selected as 'point dice'/.
	public int[] findPointDice(ARRAY_OF_DICE_ROLLED, int[]dieList) {
		
		int numDiceSelected = 0;
		int[] pointDice = new int[NUM_OF_SELECTED_DICE];
		
		if(dieList[0].getAssignment == "selected") {
			pointDice[numDiceSelected] = dieList[0];
			numDiceSelected++; }
		if(dieList[1].getAssignment == "selected") {
			pointDice[numDiceSelected] = dieList[1];
			numDiceSelected++; }
		if(dieList[2].getAssignment == "selected") {
			pointDice[numDiceSelected] = dieList[2];
			numDiceSelected++; }
		if(dieList[3].getAssignment == "selected") {
			pointDice[numDiceSelected] = dieList[3];
			numDiceSelected++; }
		if(dieList[4].getAssignment == "selected") {
			pointDice[numDiceSelected] = dieList[4];
			numDiceSelected++; }
		if(dieList[5].getAssignment == "selected") {
			pointDice[numDiceSelected] = dieList[5];
			numDiceSelected++; }
		
	SORT_pointDice_ARRAY; // Call a method to sort array of point Dice
	
	return pointDice[];
	}
	
	// Determine the points earned for an array of rolled selected dice to be scored.
	public void scorePoints(int[] pointDice){
		rollPoints = 0;
		
		// 1 rolled die is selected to be scored
		if (pointDice.length == 1) {
			if (pointDice[0] == 1)
				rollPoints = rollPoints + 100;
			else if (pointDice[0] == 5)
				rollPoints = rollPoints + 50;
		}
		
		// 2 rolled dice were selected to be scored
		if (pointDice.length == 2) {
			for (int aryPosition = 0; aryPosition < pointDice.length; aryPostion++) {
				if (pointDice[aryPosition] == 1)
					rollPoints = rollPoints + 100;
				else if (pointDice[aryPosition] == 5)
					rollPoints = rollPoints + 50;
			}
		}
		
		// 3 rolled dice were selected to be scored
		// 4 rolled dice were selected to be scored
		// 5 rolled dice were selected to be scored
		// 6 rolled dice were selected to be scored
	}
	
	// This method rolls 6 dice. It creates 6 dice and stores them into an array. they are then put into a different list and 
	// Then displayed.
	public void roll(){
		Boolean t = true;
		
		while (t) {
		    int dice1=(int)(Math.random()*6+1);
		    int dice2=(int)(Math.random()*6+1);
		    int dice3=(int)(Math.random()*6+1);
		    int dice4=(int)(Math.random()*6+1);
		    int dice5=(int)(Math.random()*6+1);
		    int dice6=(int)(Math.random()*6+1);
		    int sum = dice1 + dice2;
		    int [] dieList = new int[6];
		    int [] tempList = new int[6];
		    dieList[0] = dice1;
		    dieList[1] = dice2;
		    dieList[2] = dice3;
		    dieList[3] = dice4;
		    dieList[4] = dice5;
		    dieList[5] = dice6;
		    
		    String diceString = "" + dice1 + dice2 + dice3 + dice4 + dice5 + dice6;
		    System.out.println("You have rolled: ");
		    for(int i = 0; i < dieList.length; i++)
		    {
		    	System.out.print(dieList[i] + " ");
		    }
			System.out.println("");
		    for(int i = 0; i < dieList.length; i++)
		    {
		    	tempList[i] = dieList[i];
		    }
		    t = false;
		}
    }
	
	
}