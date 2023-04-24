package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareUnit {

	@Test
	public void test() {
		JunitTestClass obj1 = new JunitTestClass();
		int output_f = obj1.square(4);
		// test the output
		assertEquals(16, output_f);
	}

}
