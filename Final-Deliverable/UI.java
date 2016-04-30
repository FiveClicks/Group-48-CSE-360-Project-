/*
 * @Author: Kartik
 * @Version1: 4/14/16
 * 
 * Class Description: This class is the UI for Farkle. It displays the option menu when first entered. It then goes to the 
 * method that is asked for. The game will be implemented here.
 * This class uses the Player class and the dicegame class.
 */
import java.util.ArrayList;

import java.util.Scanner;
import java.io.IOException;
import java.io.Serializable;
	public class UI  implements Serializable
	{// Implements the User Interface for the Periodic Elements program. Accepts requests from users and
	 // performs the requested action. 
		
		private static Scanner in = new Scanner(System.in);
		private int numPlayers = 0;
		
		// 4 options are available to the user - 3 perform requested task and one is to exit the program loop.
		public void run() throws IOException
		{
			int menuChoice;
			do {
				displayMenu();
				menuChoice = getMenuChoice();
				loadStats();
				
				switch (menuChoice) {
					case 1: play(); 
						break;
					case 2: Instructions(); 	
						break; 
					case 3: viewStats(); 		
						break; 
					case 5: exitProgram(); 		
						break;
					default: handleInvalidMenuChoice();
				}
				
			} while (menuChoice != 5);
		
		}

		//Yet to implement loading the stats from a file.
		private void loadStats() {
			// TODO Auto-generated method stub
			
		}
		
		//Prints out the instructions to the user.
		private void Instructions() {
			System.out.println("");
			System.out.println("------Instructions------");
			System.out.println("The objective of the game is to score as many points.");
			System.out.println("You are given 6 dice. On your first roll. You must roll all six dice. ");
			System.out.println("After a player rolls. He/She may set aside any point dice (dice that scored points).");
			System.out.println("At this time the player has the option to continue rolling the remaining dice");
			System.out.println("to collect more points, or stop and keep the points.");
			System.out.println("A \"farkle\" is when the dice are rolled but no point dice appear.");
			System.out.println("At this point, the player loses all the points that he/she has collected.");
			System.out.println("The turn ends and the next player plays.");
			System.out.println("The game ends when a player hits 5000 points");
			System.out.println("");
			System.out.println("How to acquire points:");
			System.out.println("A roll of 1 is worth 100 points");
			System.out.println("A roll of 5 is worth 50 points");
			System.out.println("Three dice rolled at the same time with the same value is worth 100 times");
			System.out.println("the face value. Example: three 2's is 200 points.");
			System.out.println("An exception to the three dice is that if three 1s are rolled, you score 1000 points.");
			System.out.println("");
		}

		//Method used to play the game.
		private void play() 
		{
			System.out.println("There are two players in this game!");
			//System.out.println("Player 1:");
			Game1 newGame = new Game1();
			newGame.Game();		
			boolean p1Win = newGame.getP1Win();
			boolean p2Win = newGame.getP2Win();
			int p1Points = newGame.getTotalPointsP1();
			int p2Points = newGame.getTotalPointsP2();
			if (p1Win == true)
			{
				System.out.printf("Congratulations Player 1! You won with %d Points", p1Points);
				System.out.println("");
			}
			else if(p2Win == true)
			{
				System.out.printf("Congratulations Player 2! You won with %d Points", p2Points);
				System.out.println("");
			}
			//newGame.printFindDieList();
		}
		

		//Yet to be implemented. Once the stats are loaded in they can be displayed.
		private void viewStats() 
		{
			System.out.println("Yet to be implemented");
		}
		
		//Exits the program.
		public static void exitProgram() 
		{
			System.out.println("*** Exiting program! ***");
			
		}

		//Handles an option outside of the range.
		public static void handleInvalidMenuChoice() 
		{
			System.out.println("*** Invalid menu choice! ***");		
			
		}
		
		// Displays the menu options
		public void displayMenu() 
		{
			System.out.println("Main Menu:  ----------------------------------------");
			System.out.println("1) Play!");
			System.out.println("2) Instructions");
			System.out.println("3) See Statistics");
			System.out.println("5) Exit Program.");
			System.out.println();
		}

		//Gets the menu Choice.
		public int getMenuChoice() 
		{
			System.out.print("Enter menu choice:");
			return in.nextInt();
		}
	}
