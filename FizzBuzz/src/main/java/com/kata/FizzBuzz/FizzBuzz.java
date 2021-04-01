package com.kata.FizzBuzz;

public class FizzBuzz {

	private static final int FIFTEEN = 15;
	private static final int THREE = 3;
	private static final int FIVE = 5;
	private static final int ZERO = 0;
	static final String FIZZ = "Fizz";
	static final String BUZZ = "Buzz";
	static final String FIZZ_BUZZ = "FizzBuzz";

	public static String getResult(int inputValue) {

		if (inputValue % FIFTEEN == ZERO)
			return FIZZ_BUZZ;
		else if (inputValue % THREE == ZERO)
			return FIZZ;
		else if (inputValue % FIVE == ZERO)
			return BUZZ;

		else return Integer.toString(inputValue);

	}

}
