import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCheckArraySequence {
	
	CheckArraySequence checkarraysequence= new CheckArraySequence();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckSequence() {

		int[] dataToTest0= {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,0,4,5,6,7,8,9,10,11};

		int[] dataToTest1= {1,1,22,23,56,98,455,500,987,1000};

		int[] dataToTest2= {90,80,70,68,60,52,50,25,6,6,5,2,1,0,-9};

		
		assertEquals(0, checkarraysequence.checkSequence((dataToTest0)));
		assertEquals(1, checkarraysequence.checkSequence((dataToTest1)));
		assertEquals(2, checkarraysequence.checkSequence((dataToTest2)));
	
	}

}
