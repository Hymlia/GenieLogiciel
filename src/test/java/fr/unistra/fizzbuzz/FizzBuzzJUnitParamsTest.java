package fr.unistra.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzJUnitParamsTest {

	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	@Parameters({"1", "2", "4", "7", "11", "13", "14"})
	public void returnsNumberForInputNotDivisibleByThreeOrFive(int number) {
		assertThat(fizzbuzz.convert(number)).isEqualTo("" + number);
	}

	@Test
	@Parameters({"3", "6", "9", "12", "18"})
	public void returnsNumberForInputDivisibleByThreeButNoFive(int number) {
		assertThat(fizzbuzz.convert(number)).isEqualTo("Fizz");
	}

	@Test
	@Parameters({"5", "10", "20", "25", "35"})
	public void returnsNumberForInputDivisibleBynoThreeButFive(int number) {
		assertThat(fizzbuzz.convert(number)).isEqualTo("Buzz");
	}

	@Test
	@Parameters({"15", "30", "45", "60", "75"})
	public void returnsNumberForInputDivisibleByThreeAndFive(int number) {
		assertThat(fizzbuzz.convert(number)).isEqualTo("FizzBuzz");
	}
}
