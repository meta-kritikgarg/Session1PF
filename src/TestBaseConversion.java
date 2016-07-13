import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestBaseConversion {

	BaseConversion baseconversion = new BaseConversion(); 

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testConvertBinaryToOctal() {
		assertEquals(77, baseconversion.convertBinaryToOctal(111111));
		
	}

}
