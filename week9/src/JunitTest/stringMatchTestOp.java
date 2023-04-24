package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringMatchTestOp {

	@Test
	public void test() {
		stringMatchTest objMatchTest = new stringMatchTest();
		String string = objMatchTest.Greet();
		assertEquals("Hello World", string);
	}

}
