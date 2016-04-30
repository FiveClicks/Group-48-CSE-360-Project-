import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class Game1Test {

	@Test
	//1 Die Test: 1
	public void testScorePoints1()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		//Die die2 = new Die();
		//Die die3 = new Die();
		
		die1.setValue(1);
		die.add(die1);
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(100, points);
	}
	
	@Test
	//1 Die Test: 5
	public void testScorePoints2()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		//Die die2 = new Die();
		//Die die3 = new Die();
		
		die1.setValue(5);
		die.add(die1);
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(50, points);
	}
	
	@Test
	//1 Die Test: Value worth no points
	public void testScorePoints3()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		//Die die2 = new Die();
		//Die die3 = new Die();
		
		die1.setValue(4);
		die.add(die1);
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(0, points);
	}
	
	@Test
	//2 Die Test: 1 and 1
	public void testScorePoints4()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		//Die die3 = new Die();
		
		die1.setValue(1);
		die2.setValue(1);
		die.add(die1);
		die.add(die2);
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(200, points);
	}
	
	@Test
	//2 Die Test: 1 and 5
	public void testScorePoints5()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		//Die die3 = new Die();
		
		die1.setValue(1);
		die2.setValue(5);
		die.add(die1);
		die.add(die2);
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(150, points);
	}
	
	@Test
	//2 Die Test: 5 and 5
	public void testScorePoints6()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		//Die die3 = new Die();
		
		die1.setValue(5);
		die2.setValue(5);
		die.add(die1);
		die.add(die2);
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(100, points);
	}
	
	@Test
	//2 Die Test: Both values not worth anything
	public void testScorePoints7()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		//Die die3 = new Die();
		
		die1.setValue(2);
		die2.setValue(4);
		die.add(die1);
		die.add(die2);
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(0, points);
	}
	
	@Test
	//3 Die Test: 1, 1, 1
	public void testScorePoints8()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		
		die1.setValue(1);
		die2.setValue(1);
		die3.setValue(1);
		die.add(die1);
		die.add(die2);
		die.add(die3);
		
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(1000, points);
	}
	
	@Test
	//3 Die Test: Any 3 of a Kind
	public void testScorePoints9()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		
		die1.setValue(3);
		die2.setValue(3);
		die3.setValue(3);
		die.add(die1);
		die.add(die2);
		die.add(die3);
		
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(300, points);
	}
	
	@Test
	//3 Die Test: 1, 5, value worth nothing
	public void testScorePoints10()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		
		die1.setValue(1);
		die2.setValue(5);
		die3.setValue(3);
		die.add(die1);
		die.add(die2);
		die.add(die3);
		
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(150, points);
	}
	
	@Test
	//3 Die Test: 5, 2 values worth nothing
	public void testScorePoints11()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		
		die1.setValue(5);
		die2.setValue(2);
		die3.setValue(4);
		die.add(die1);
		die.add(die2);
		die.add(die3);
		
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(50, points);
	}
	
	@Test
	//3 Die Test: 1, 2 values worth nothing
	public void testScorePoints12()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		
		die1.setValue(1);
		die2.setValue(2);
		die3.setValue(4);
		die.add(die1);
		die.add(die2);
		die.add(die3);
		
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(100, points);
	}
	
	@Test
	//3 Die Test: No values worth any points
	public void testScorePoints13()
	{
		
		Game1 game1 = new Game1();
		
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		
		die1.setValue(2);
		die2.setValue(2);
		die3.setValue(4);
		die.add(die1);
		die.add(die2);
		die.add(die3);
		
		
		game1.scorePoints(die);
		int points = game1.rollPoints;
		assertEquals(0, points);
	}
	

}
