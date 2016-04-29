import static org.junit.Assert.*;

import org.junit.Test;


public class DieTest {

	@Test
	public void testExists() {
		Die test1 = new Die();
		
		assertNotNull(test1);
	}
	
	@Test
	public void testGetScored(){
		Die test2 = new Die();
		
		assertFalse(test2.getScored());
	}
	
	@Test
	public void testGetSelected(){
		Die test3 = new Die();
		
		assertFalse(test3.getSelected());
	}
	
	@Test
	public void testGetValue(){
		Die test4 = new Die();
		
		assertEquals(0, test4.getValue());
	}
	
	@Test
	public void testRollDie(){
		Die test5 = new Die();

		test5.rollDie();
		
		assertTrue(test5.getValue() < 7 && test5.getValue() > 0);
	}

	@Test
	public void testSetSelected(){
		Die test6 = new Die();

		test6.setSelected(true);
		
		assertTrue(test6.getSelected());
	}
}
