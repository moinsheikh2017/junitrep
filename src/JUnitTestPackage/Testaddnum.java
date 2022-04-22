package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testaddnum {

	@Test
	public void test() {
		JunitFunctions JUnit=new JunitFunctions();
		int result = JUnit.addTwoNum(100, 200);
		assertEquals(300, result);
	}

}