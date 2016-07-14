import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author KRITIK GARG
 *
 */
public class TestSequenceFinder {
	SequenceFinder sequencefinder = new SequenceFinder();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * Test method for {@link SequenceFinder#longestSequence(int[])}.
	 */
	@Test
	public void testLongestSequence() {
		int[] dataToTest= {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,0,4,5,6,7,8,9,10,11};
		int[] dataTocheck= {0,4,5,6,7,8,9,10,11};
		assertArrayEquals(dataTocheck, sequencefinder.longestSequence(dataToTest));
	}

}
