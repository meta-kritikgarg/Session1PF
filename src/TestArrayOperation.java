import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestArrayOperation {
	
	ArrayOperation arrayoperation =  new ArrayOperation();

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		int[] dataToTest= {2,5,4,6,3,8,5,9,3,7,7,1,7,1,7,3,6,3,9,0};
		int[] dataTocheck= {2,5,4,6,3,8,9,7,1,0};
		

		assertArrayEquals(dataTocheck, arrayoperation.removeDuplicate(dataToTest));
		

	}

}
