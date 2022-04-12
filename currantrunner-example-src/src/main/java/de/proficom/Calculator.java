package de.proficom;

public class Calculator {

	// task 1: execute and fix the calculator, there are 2 wrong calculations inside the functions.
	
	/**
	 * Calculate SUM of A and B
	 * 
	 * @param a		First value
	 * @param b		Second value
	 * @return		Result
	 */
	public int sum(int a, int b) {
		return a + b;
	}
	
	/**
	 * Calculate DIFFERENCE of A and B
	 * 
	 * @param a		First value
	 * @param b		Second value
	 * @return		Result
	 */
	public int sub(int a, int b) {
		return a - b;
	}
	
	/**
	 * Calculate PRODUCT of A and B
	 * 
	 * @param a		First value
	 * @param b		Second value
	 * @return		Result
	 */
	public int mul(int a, int b) {
		return a * b;
	}
	
	/**
	 * Calculate QUOTIENT of A and B
	 * 
	 * @param a		First value
	 * @param b		Second value
	 * @return		Result
	 */
	public int div(int a, int b) {
		return a / b;
	}
	
	/**
	 * Checks if a number is prime
	 * 
	 * @param n		Value to be checked
	 * @return		TRUE if value is prime, otherwise FALSE
	 */
	public boolean isPrime(int n) {
		boolean foundDivider = false;
		for (int i = 2; i < n; i++) {
			if ((n % i) == 0) {
				foundDivider = true;
				break;
			}
		}
		return ((n >= 2) && (foundDivider == false));
	}
}
