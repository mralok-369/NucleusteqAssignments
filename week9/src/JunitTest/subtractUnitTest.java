package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class subtractUnitTest {

	@Test
	public void test() {
		JunitTestClass obj = new JunitTestClass();
		int output = obj.Substract(100, 10);
		// test the output
		assertEquals(90, output);
	}

}
