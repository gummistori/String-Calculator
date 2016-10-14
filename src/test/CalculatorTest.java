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
}