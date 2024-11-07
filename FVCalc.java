// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		// Replace this comment with your code
		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);

		//crate The number of years n is assumed to be a nonnegative integer.
		int n = Integer.parseInt(args[2]);

		//the formula for finding the future value
		double futureValue = (currentValue) * Math.pow((1 + rate / 100.0), n);

		// covert the future value to an integer 
		int futureValueAsInt = (int) futureValue;

		// covert the future value to an integer 
		int currentValueInt = (int) currentValue;

			// the command for getting the required out put
			System.out.println("After " + n + " years, a " + '$' + currentValueInt + " saved at " + rate + "% will yield "+ '$' + futureValueAsInt);
	
	}
}