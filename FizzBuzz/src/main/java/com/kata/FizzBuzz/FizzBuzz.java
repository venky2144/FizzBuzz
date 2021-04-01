package com.kata.FizzBuzz;

public class FizzBuzz {

	public static String getResult(int inputValue) {
		if (inputValue % 3 == 0) 
			return "fizz";
		 if(inputValue % 5 == 0)
			 return "buzz";
		 if (inputValue % 15 == 0)
			 return "fizzbuzz";
		 return Integer.toString(inputValue);
		
	}

}
