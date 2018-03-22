package fr.unistra.fizzbuzz;

public class ProblemSolver{

	public void solve(Int2String i2s , Displayer d) {
		for(int i = 1; i<=100; i++) {
			String s = i2s.convert(i);
			System.out.println(s);
		}

	}
}
