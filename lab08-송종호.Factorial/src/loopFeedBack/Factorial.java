package loopFeedBack;

public class Factorial {

	public int factorial(int input) { 
		
		int result = 1;
		
		for (int idx = 1; idx < input + 1; idx++) { 
			result *= idx; 
		}
		
		return result;
	}

}
