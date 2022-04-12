package de.proficom;

import java.util.Scanner;

public class Main {

	// run the calculator and put in the values A: 2 and B:2
	// after it try some different numbers
	
	public static void main(String[] args) {
		// Read two numbers from command line
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int numA = scan.nextInt();
        System.out.print("Enter number B: ");
        int numB= scan.nextInt();

        // Use calculator class
		Calculator calc = new Calculator();
		System.out.println("---");
		System.out.println("A + B = " + calc.sum(numA,  numB));
		System.out.println("A - B = " + calc.sub(numA,  numB));
		System.out.println("A * B = " + calc.mul(numA,  numB));
		System.out.println("A / B = " + calc.div(numA,  numB));
		System.out.println("---");
		System.out.println("Is A prime = " + calc.isPrime(numA));
		System.out.println("Is B prime = " + calc.isPrime(numB));

        // Closing Scanner after the use
        scan.close();
	}

}
