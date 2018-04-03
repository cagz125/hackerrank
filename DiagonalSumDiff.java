package basicjava;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiagonalSumDiff {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
	/*
	 * Write your code here.
	 */
	int sumOne = 0;
	int sumTwo = 0;
	int mL = a.length  - 1;

	for (int i = 0, j = a.length-1 ; i < a.length ; i++, j--) {
	    sumOne = sumOne + a[i][i];
	    sumTwo = sumTwo + a[i][j];
	}
	int absol = Math.abs(sumOne - sumTwo);
	return absol;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	//BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	int n = Integer.parseInt(scan.nextLine().trim());

	int[][] a = new int[n][n];

	for (int aRowItr = 0; aRowItr < n; aRowItr++) {
	    String[] aRowItems = scan.nextLine().split(" ");

	    for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
		int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
		a[aRowItr][aColumnItr] = aItem;
	    }
	}

	int result = diagonalDifference(a);
	
	System.out.println( result);
	
	scan.close();

	//bw.write(String.valueOf(result));
	//bw.newLine();

	//bw.close();
    }
}
