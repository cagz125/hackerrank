package basicjava;

import java.util.Scanner;

public class test_1_1 {

    public static void main(String[] args) {

	// TODO Auto-generated method stub

	int i = 4;
	double d = 4.0;
	String s = "HackerRank";

	Scanner scan = new Scanner(System.in);

	/* Declare second integer, double, and String variables. */
	/* Read and save an integer, double, and String to  variables. */
	
	while (scan.hasNext()) {
	    if (scan.hasNextInt() ) {
		int ixi = scan.nextInt();
		int sumI = i + ixi;
		System.out.println("\n" + sumI  );
	    } 
	    else if (scan.hasNextDouble()) {
		double dxd = scan.nextDouble();
		double sumD = d + dxd;
		System.out.println(sumD );
	    } 
	    else  {
		String sxs = scan.next() + scan.nextLine();
		System.out.println(s + sxs );
	    }
	} 
	/*
	Scanner scan = new Scanner(System.in);
	
	/* Print the sum of both integer variables on a new line. 
	
	ixi = scan.nextInt();
	int sumI = i + ixi;
	System.out.println("\n" + sumI  );

	/* Print the sum of the double variables on a new line. 
	dxd = scan.nextDouble();
	double sumD = d + dxd;
	System.out.println(sumD );
	
	/*Concatenate and print the String variables on a new line;
	 * the 's' variable above should be printed first. 
	
	sxs = scan.next() + scan.nextLine();
	System.out.println(s + " "+ sxs );  */
	

	scan.close();

    }

}
