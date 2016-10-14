package ru.Stringcalculator;


public class StringCalculator{
	public static int add(String text){
		if (text.equals("")) {
			return 0;
		}
		int value = 0;
		if(text.contains(",")){
			// split 
			String[] numbers = text.split(",|\\\n");
			for (String num : numbers){
				if(num.length() > 0){
					value += Integer.parseInt(num);
				}
			}
		}else{
			value = Integer.parseInt(text);	
		}
		
		return value;
	}
}
