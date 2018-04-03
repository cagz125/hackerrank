package basicjava;


import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ProblemAlgos2 {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */
	//int [] arr = new int [] {8, 5, 15, 23, 1, 7};
        int[] A = new int [] {a0, a1, a2};
        int[] B = new int [] {b0, b1, b2}; 
        int[] C = new int[101];
        
        for (int i = 0 ; i < A.length ; i++) {
            C[i] = A[i] - B[i];
        }
        
        int[] score = new int [] {0, 0};
        
        for (int i = 0; i < C.length; i++) {
            if ( C[i] > 0 ) {
                score[0] = score[0] + 1;
            }else if (C[i] < 0) {
        	score[1] = score[1] + 1;
            }
        }
        return score;
        
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] a0A1A2 = scan.nextLine().split(" ");

        int a0 = Integer.parseInt(a0A1A2[0].trim());

        int a1 = Integer.parseInt(a0A1A2[1].trim());

        int a2 = Integer.parseInt(a0A1A2[2].trim());

        String[] b0B1B2 = scan.nextLine().split(" ");

        int b0 = Integer.parseInt(b0B1B2[0].trim());

        int b1 = Integer.parseInt(b0B1B2[1].trim());

        int b2 = Integer.parseInt(b0B1B2[2].trim());

        int[] result = solve(a0, a1, a2, b0, b1, b2);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
