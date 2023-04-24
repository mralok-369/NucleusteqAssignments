package JunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ divisionUnitTest.class, squareUnit.class, stringMatchTestOp.class, subtractUnitTest.class,
		sumUnitTest.class })
public class AllTests {

}
