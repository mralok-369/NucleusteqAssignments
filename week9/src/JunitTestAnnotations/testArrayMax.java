package JunitTestAnnotations;

import static org.junit.Assert.*;

import org.junit.Test;

public class testArrayMax {

	@Test
	public void test() {
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
//		assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
	}

}
