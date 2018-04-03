package basicjava;

import java.util.*;

public class primes {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a positive integer please ");
	int userInput = scanner.nextInt();
	/*
	 * print number is divisible by 1 and itself x % y computes remainder when x is
	 * divided by y
	 */
	int potentialFactor = 2;
	while (userInput % potentialFactor != 0) {
	    potentialFactor++;// increment potentialFactor
	}
	if (potentialFactor == userInput) {
	    System.out.println("the number is prime");
	} 
	else {
	    System.out.println("the number is not prime, factor is " + potentialFactor);
	}

    }

}
