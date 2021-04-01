package com.kata.FizzBuzz;

public class FizzBuzz {

	public static String getResult(int inputValue) {
		
		if (inputValue % 15 == 0)
			 return "fizzbuzz";
		if (inputValue % 3 == 0) 
			return "fizz";
		 if(inputValue % 5 == 0)
			 return "buzz";
		 
		 return Integer.toString(inputValue);
		
	}

}
