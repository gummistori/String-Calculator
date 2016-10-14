package ru.Stringcalculator;
import java.util.regex.Pattern;
public class StringCalculator{
	public static int add(String text) throws NegativeException
	{
		String textAfterFix = "";
		String delimeter = ",";
		if(text.startsWith("//"))
		{
			// delimeter detected!
			
			String[] lines = {text.substring(0,3), text.substring(4)};
			delimeter = lines[0].substring(2);
			textAfterFix = lines[1];
		}
		else
		{
			delimeter = ",";
			textAfterFix = text;
		}
		if (textAfterFix.equals("")) 
		{
			return 0;
		}
		int value = 0;
		
		String negNumbers = "";
		if(text.startsWith("//") || textAfterFix.contains(delimeter))
		{
			String[] numbers;
			// split 
			numbers = textAfterFix.split("\n");
			for (String lines : numbers)
			{
				for(String num : lines.split(delimeter))
				{


					if(num.length() > 0)
					{
						int tempVal = Integer.parseInt(num);
						if(tempVal < 0){
							if(negNumbers.length() != 0)
							{
								negNumbers += ",";
							}
							negNumbers += num;
						}else
						{
							if(tempVal < 1000)
							{
								value += Integer.parseInt(num);
							}
						}
					}
				}
			}
		}else
		{
			value = Integer.parseInt(textAfterFix);	
		}
		if(negNumbers.length() > 0)
		{
			throw new NegativeException("Negatives not allowed: "+negNumbers);
		}
		return value;
	}
}
