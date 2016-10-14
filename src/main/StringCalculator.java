package ru.Stringcalculator;


public class StringCalculator{
	public static int add(String text) throws NegativeException
	{
		if (text.equals("")) {
			return 0;
		}
		int value = 0;
		String[] numbers = text.split(",|\\\n");
		String negNumbers = "";
		if(text.contains(",")){
			// split 
			

			for (String num : numbers){
				if(num.length() > 0){
					int tempVal = Integer.parseInt(num);
					if(tempVal < 0){
						if(negNumbers.length() != 0){
							negNumbers += ",";
						}
						negNumbers+= num;
					}else{
						if(tempVal < 1000)
						{
							value += Integer.parseInt(num);
						}
					}
				}
			}
		}else{
			value = Integer.parseInt(text);	
		}
		if(negNumbers.length() > 0){
			throw new NegativeException("Negatives not allowed: "+negNumbers);
		}
		return value;
	}
}
