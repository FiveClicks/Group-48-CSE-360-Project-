/**
 * @Author: Jeremy St. Ange, Kartik Gupta, Douglas Porter, Ryan Ditsworth
 * @Version1: April 15, 2016
 * @Version: April 28, 2016
 * Class Description: This class will be the base of player objects. It will be used to store the players' 
 *					  statistics in a text file. 
 */
import java.io.Serializable;

public class Player 
{
	// player attributes
	private int wins = 0;
	private String playerName = "";
	
	/**
	 * sets the electron number
	 * @param incWins
	 */
	public void setWins(int incWins)
	{
		wins = incWins;
	}
	
	/**
	 * gets the electron number.
	 * @return	wins
	 */
	public int getWins()
	{
		return wins;
	}
	
	/**
	 * sets the neutron number.
	 * @param playerName
	 */
	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}
	
	/**
	 * gets the neutron number.
	 * @return	playerName
	 */
	public String getPlayerName()
	{
		return playerName;
	}
	
	/**
	 * turns the Player object into a String.
	 * @return Player
	 */
	public String toString() 
	{
		return String.format("Player%s, Wins: %d ", playerName, wins);
	}

	/**
	 * serializes the String
	 */
	public String serialize() 
	{
		return String.format("%s:%d", 
				 playerName,wins);
	}
	
	/**
	 * reads the element information from the text file.
	 * @param playerData
	 * @return newElement
	 */
	public static Player deserialize(String playerData)
	{
		Player newElement = new Player();
		
		String[] data = playerData.split(":");
		
		newElement.setPlayerName(data[0]);
		newElement.setWins(Integer.parseInt(data[1]));
		return newElement;
	}
}