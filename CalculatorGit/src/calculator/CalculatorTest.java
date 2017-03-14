package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		assertEquals(1, new Calculator().calculate("2+2"));
		
	}

}
