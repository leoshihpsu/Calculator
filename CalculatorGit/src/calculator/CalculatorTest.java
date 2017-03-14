package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		assertEquals(1, new Calculator().calculate("2+2"));
	}
		@Test
		public void test1() {
			assertEquals(1, new Calculator().calculate("2-5"));
	}
		@Test
		public void test3() {
			assertEquals(1, new Calculator().calculate("25/5"));
	}
		@Test
		public void test2() {
			assertEquals(1, new Calculator().calculate("12*5"));
	}
	

}
