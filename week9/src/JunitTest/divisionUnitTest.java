package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class divisionUnitTest {

	@Test
	public void test() {
		JunitTestClass obj = new JunitTestClass();
		int output = obj.Division(100, 10);
		// test the output
		assertEquals(10, output);
	}

}
