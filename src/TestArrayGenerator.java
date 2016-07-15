import static org.junit.Assert.*;

import org.junit.Test;


public class TestArrayGenerator {
	
	ArrayGenerator arraygenerator = new ArrayGenerator();
	

	@Test
	public void test() {
		int[] a={1,2,3,4,56,98,741,985,1000};
		int[] b= {2,2,3,6,9,55,78,87,256,652,754,1001,9522};
		int[] c=new int[a.length+b.length];
		
		int[] result={1,2,2,2,3,3,4,6,9,55,56,78,87,98,256,652,741,754,985,1000,1001,9522};
		
		assertArrayEquals(result, arraygenerator.joint(a, a.length, b, b.length));
		
		assertArrayEquals(result, arraygenerator.joint(b, b.length, a, a.length));
		

		
	}

}
