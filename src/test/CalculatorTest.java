package ru.Stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	
	@Test
	public void testEmpty(){
		assertEquals(0, StringCalculator.add(""));
	}
}