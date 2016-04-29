package finaldeliverable; // remove this when you put into your file, or change to your package name

/*
 * @Author: Ryan Ditsworth, Jeremy St. Ange
 * @Version1: 4/14/16
 * 
 * Class Description:This is a JUnit class that tests Game.
 */

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class GameTest {

	@Test
	//1 Die Test: 1
	public void testScorePoints1()
	{
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
		
		Game game1 = new Game();
		
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
	
	@Test
	// test if points are not null for one die
	public void testScorePoints14()
	{
		Game game = new Game();
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		
		die1.setValue(1);
		die.add(die1);
		
		game.scorePoints(die);
		int points = game.rollPoints;
		assertNotNull(points);
		
	}
	
	@Test
	// test if points are not null for two die
	public void testScorePoints15()
	{
		Game game = new Game();
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		die1.setValue(1);
		die2.setValue(2);
		die.add(die1);
		die.add(die2);
		game.scorePoints(die);
		int points = game.rollPoints;
		assertNotNull(points);
		
	}

	@Test
	// test if points are not null for three die
	public void testScorePoints16()
	{
		Game game = new Game();
		ArrayList <Die> die = new ArrayList<Die>();
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		die1.setValue(1);
		die2.setValue(2);
		die3.setValue(3);
		die.add(die1);
		die.add(die2);
		die.add(die3);
		game.scorePoints(die);
		int points = game.rollPoints;
		assertNotNull(points);
		
	}

}












