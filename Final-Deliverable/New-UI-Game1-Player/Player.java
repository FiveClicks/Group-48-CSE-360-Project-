/*
 * @Author: Jeremy St. Ange, Kartik Gupta, Douglas Porter, Ryan Ditsworth
 * @Version1: 4/15/16
 * @Version: April 28, 2016
 * Class Description: This class will be the base of player objects. It will be used to store the game stats in 
 * a text file. 
 */
import java.io.Serializable;

public class Player 
{
	private int wins = 0;
	private String playerName = "";
	
	// sets the electron number.
	public void setWins(int incWins){
		wins = incWins;
	}
	
	// gets the electron number.
	public int getWins(){
		return wins;
	}
	
	// sets the neutron number.
	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}
	
	// gets the neutron number.
	public String getPlayerName(){
		return playerName;
	}
	public String toString() {
		return String.format("Player%s, Wins: %d ", playerName, wins);
	}

	
	public String serialize() {
		return String.format("%s:%d", 
				 playerName,wins);
	}
	
	
	// the deserialize is used to read the element information from a file. 
	public static Player deserialize(String playerData){
		Player newElement = new Player();
		
		String[] data = playerData.split(":");
		
		newElement.setPlayerName(data[0]);
		newElement.setWins(Integer.parseInt(data[1]));
		return newElement;
	}
	
	
}
