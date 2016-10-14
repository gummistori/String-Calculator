package ru.Stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	
	@Test
	public void testEmpty() throws NegativeException
	{
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testSingle() throws NegativeException
	{
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testSingleNegative() throws NegativeException
	{
		assertEquals(-11, StringCalculator.add("-11"));
	}

	@Test
	public void testDouble() throws NegativeException
	{
		assertEquals(5, StringCalculator.add("2,3"));
	}
	@Test(expected=NegativeException.class) 
	public void testDoubleWithNegative()throws NegativeException{
		assertEquals(1, StringCalculator.add("-2,3"));
	}

	@Test(expected=NegativeException.class) 
	public void testDoubleNegatives()throws NegativeException{
		assertEquals(-5, StringCalculator.add("-2,-3"));
	}
	@Test
	public void testDoubleWithMoreCommas() throws NegativeException
	{
		assertEquals(5, StringCalculator.add("2,,3,"));
	}
	@Test
	public void testWithManyNumbers() throws NegativeException
	{
		assertEquals(10, StringCalculator.add("2,2,3,3"));
	}

	@Test
	public void testWithNewlines() throws NegativeException
	{
		assertEquals(5, StringCalculator.add("2\n,3,"));
	}

	@Test
	public void testSkipOverThousand() throws NegativeException
	{
		assertEquals(20, StringCalculator.add("20,1004"));
	}
	
	@Test
	public void testCustomDelimeter() throws NegativeException
	{
		assertEquals(10, StringCalculator.add("//;\n7;3"));
	}

}