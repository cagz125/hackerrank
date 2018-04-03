package basicjava;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class PrecisionAlgo {
    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */
	double sumNeg = 0;
	double sumPos = 0;
	double sumZer = 0;
	double arrlen = arr.length;
	
	for (int i = 0; i < arr.length; i++) {
	    if(arr[i] < 0 ) {
		sumNeg = sumNeg + 1;
	    }else if (arr[i] > 0) {
		sumPos = sumPos + 1;
	    }else {
		sumZer = sumZer + 1;
	    }
	}
	
	double neg = sumNeg / arrlen;
	double pos = sumPos / arrlen;
	double zer = sumZer / arrlen;
	
	//System.out.println(pos);
	System.out.printf("%.6f %n",pos);
	System.out.printf("%.6f %n",neg);
	System.out.printf("%.6f %n",zer);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }  

    
    
    
}
