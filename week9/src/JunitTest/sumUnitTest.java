package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumUnitTest {

	@Test
	public void test() {
		JunitTestClass obj = new JunitTestClass();
		int output = obj.sum(50, 10);
		assertEquals(60, output);
	}

}
