package application;

public class Modo {
	public double calculate(double nbr1, double nbr2, String operator) {
	    switch (operator) {
	        case "+":
	            return nbr1 + nbr2;
	        case "-":
	            return nbr1 - nbr2;
	        case "*":
	            return nbr1 * nbr2;
	        case "/":
	            if (nbr1 == 0) {
	                throw new ArithmeticException("Division by zero");
	            }
	            return (double) nbr1 / nbr2;
	        default:
	            return 0;
	    }
	}
}
