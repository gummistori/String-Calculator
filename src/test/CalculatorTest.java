package ru.Stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	
	@Test
	public void testEmpty(){
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testSingle(){
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testSingleNegative(){
		assertEquals(-11, StringCalculator.add("-11"));
	}

	@Test
	public void testDouble(){
		assertEquals(5, StringCalculator.add("2,3"));
	}
	@Test
	public void testDoubleWithNegative(){
		assertEquals(1, StringCalculator.add("-2,3"));
	}

	@Test
	public void testDoubleNegatives(){
		assertEquals(-5, StringCalculator.add("-2,-3"));
	}
	@Test
	public void testDoubleWithMoreCommas(){
		assertEquals(5, StringCalculator.add("2,,3,"));
	}
	@Test
	public void testWithManyNumbers(){
		assertEquals(10, StringCalculator.add("2,2,3,3"));
	}
}