package com.kata.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	 @Test
	    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
	        Assert.assertEquals("fizz", FizzBuzz.getResult(3));
	    }
	 
	 @Test
	    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
	        Assert.assertEquals("buzz", FizzBuzz.getResult(5));
	        Assert.assertEquals("buzz", FizzBuzz.getResult(15));
	       
	    }
	 
}
