import static org.junit.Assert.*;

import org.junit.Test;


public class DiceTest {

	@Test
	public void testConstructor() {
		Dice test1 = new Dice();
		
		assertNotNull(test1);
	}
	
	@Test
	public void testGetter(){
		Dice test2 = new Dice();
		
		assertEquals(0, test2.getFaceNumber());
	}
	
	@Test
	public void testSetter(){
		Dice test3 = new Dice();
		
		test3.setFaceNumber(5);
		
		assertEquals(5, test3.getFaceNumber());
	}

}
