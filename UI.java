import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
	public class UI 
	{// Implements the User Interface for the Periodic Elements program. Accepts requests from users and
	 // performs the requested action. 
		
		private static Scanner in = new Scanner(System.in);
		private boolean edited = false;
		public void run() throws IOException
		{// Six options are available to the user - five perform requested task and one is to exit the
		 // program loop.
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

		private void loadStats() {
			// TODO Auto-generated method stub
			
		}

		private void Instructions() {
			System.out.println("");
			System.out.println("------Instructions------");
			System.out.println("The objective of the game is to score as many points.");
			System.out.println("How to acquire points:");
			System.out.println("A roll of 1 is worth 100 points");
			System.out.println("A roll of 5 is worth 50 points");
			System.out.println("Three dice rolled at the same time with the same value is worth 100 times");
			System.out.println("the face value. Example: three 2's is 200 points.");
			System.out.println("An exception to the three dice is that if three 1s are rolled, you score 1000 points.");
			System.out.println("");
			System.out.println("The objective of the game is to score as many points.");
			System.out.println("You are given 6 dice. On your first roll. You must roll all six dice. ");
			System.out.println("After a player rolls. He/She may set aside any point dice.");
			System.out.println("At this point the player has the option to continue rolling the remaining dice");
			System.out.println("to collect more points, or stop and keep the points.");
			System.out.println("A \"farkle\" is when the dice are rolled but not point dice appear.");
			System.out.println("At this point, the player loses all the points that he/she has collected.");
			System.out.println("The turn ends and the next player plays.");
		}

		private void play() {
			// TODO Auto-generated method stub
			
		}

		private void viewStats() {
			// TODO Auto-generated method stub
			
		}
		public static void exitProgram() {
			System.out.println("*** Exiting program! ***");
			
		}

		public static void handleInvalidMenuChoice() {
			System.out.println("*** Invalid menu choice! ***");		
			
		}
		// Displays the menu options
		public void displayMenu() {
			System.out.println("Main Menu:  ----------------------------------------");
			System.out.println("1) Play!");
			System.out.println("2) Instructions");
			System.out.println("3) See Statistics");
			System.out.println("5) Exit Program.");
			System.out.println();
		}

		public int getMenuChoice() 
		{
			System.out.print("Enter menu choice:");
			return in.nextInt();
		}
	}
