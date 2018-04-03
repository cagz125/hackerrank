package basicjava;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StairCaseAlgos {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
	/*
	 * Write your code here.
	 */
	String [][] ar = new String [n][n];
	for (int i = 0; i < n ; i++) {
	    for (int j = n -1; j > i - 1; j--) {
	    ar[i][j] = "#";
	    }
	}
	System.out.println(ar);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int n = Integer.parseInt(scan.nextLine().trim());

	staircase(n);
    }
}
