package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaddStr {

	@Test
	public void test() {
		JunitFunctions JUnit=new JunitFunctions();
		String result = JUnit.addTwoStr("Nazar","Moin");
		assertEquals("NazarMoin", result);
	}

}