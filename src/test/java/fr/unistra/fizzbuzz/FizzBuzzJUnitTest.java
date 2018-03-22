package fr.unistra.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzJUnitTest {

	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	public void returnsNumberForInputNotDivisibleByThreeAndFive() {
		assertEquals("1", fizzbuzz.convert(1));
		assertEquals("2", fizzbuzz.convert(2));
		assertEquals("4", fizzbuzz.convert(4));
		assertEquals("7", fizzbuzz.convert(7));
		assertEquals("11",fizzbuzz.convert(11));
		assertEquals("13",fizzbuzz.convert(13));
		assertEquals("14",fizzbuzz.convert(14));
	}

	@Test
	public void returnsFizzForInputDivisobleByThreeAndNoFive() {
		assertEquals("Fizz", fizzbuzz.convert(3));
		assertEquals("Fizz", fizzbuzz.convert(6));
		assertEquals("Fizz", fizzbuzz.convert(9));
		assertEquals("Fizz", fizzbuzz.convert(12));
		assertEquals("Fizz", fizzbuzz.convert(18));

	}

	@Test
	public void returnsBuzzForInputDivisobleByFiveAndNoThree() {
		assertEquals("Buzz", fizzbuzz.convert(5));
		assertEquals("Buzz", fizzbuzz.convert(10));
		assertEquals("Buzz", fizzbuzz.convert(20));
		assertEquals("Buzz", fizzbuzz.convert(25));
		assertEquals("Buzz", fizzbuzz.convert(35));

	}

	@Test
	public void returnsFizzBuzzForInputDivisobleByFiveAndThree() {
		assertEquals("FizzBuzz", fizzbuzz.convert(15));
		assertEquals("FizzBuzz", fizzbuzz.convert(30));
		assertEquals("FizzBuzz", fizzbuzz.convert(45));
		assertEquals("FizzBuzz", fizzbuzz.convert(60));
		assertEquals("FizzBuzz", fizzbuzz.convert(75));

	}


}
