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
	public void testSetValue(){
		Die test5 = new Die();
		
		test5.setValue(3);
		
		assertEquals(3, test5.getValue());
	}
	
	@Test
	public void testRollDie(){
		Die test6 = new Die();

		test6.rollDie();
		
		assertTrue(test6.getValue() < 7 && test6.getValue() > 0);
	}

	@Test
	public void testSetSelected(){
		Die test7 = new Die();

		test7.setSelected(true);
		
		assertTrue(test7.getSelected());
	}
}
