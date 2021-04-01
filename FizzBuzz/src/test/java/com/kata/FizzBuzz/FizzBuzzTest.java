package com.kata.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	 @Test
	    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
	        Assert.assertEquals("Fizz", FizzBuzz.getResult(3));
	    }
	 
	 @Test
	    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
	        Assert.assertEquals("Buzz", FizzBuzz.getResult(5));
	        Assert.assertEquals("Buzz", FizzBuzz.getResult(10));
	       
	    }
	 
	 @Test
	    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
	        Assert.assertEquals("FizzBuzz", FizzBuzz.getResult(15));
	        Assert.assertEquals("FizzBuzz", FizzBuzz.getResult(30));
	    }
	 
	 @Test
	    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
	        Assert.assertEquals("1", FizzBuzz.getResult(1));
	        Assert.assertEquals("2", FizzBuzz.getResult(2));
	        Assert.assertEquals("4", FizzBuzz.getResult(4));
	    }
}
