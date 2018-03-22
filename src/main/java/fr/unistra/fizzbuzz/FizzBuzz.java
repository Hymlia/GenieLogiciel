package fr.unistra.fizzbuzz;

public class FizzBuzz implements Int2String{

	public String convert(int number) {
		String res ="";
		if(number % 3 == 0 && number%5==0) {
			res = "FizzBuzz";
		}
		else if (number %3==0) {
			res ="Fizz";
		}
		else if (number %5==0) {
			res ="Buzz";
		}
		else {
			res = number+"";
		}
		return res;
	}
}
