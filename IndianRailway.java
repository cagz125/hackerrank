package basicjava;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class IndianRailway {


    /*
     * Complete the berthType function below.
     */
    static String berthType(int n) {
        // Return the type of berth as described in the output format section.
	String result = null;
	if (n % 8 == 0 ) {
	    result = "SUB";
	}else if (n % 8 == 7){
	    result = "SLB";
	}else if (n % 8 == 3 || n % 8 == 6) {
	    result = "UB";
	}else if (n % 8 == 5 || n % 8 == 2) {
	    result = "MB";
	}else if (n % 8 == 4 || n % 8 == 1) {
	    result = "LB";
	}
	return result;
    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        String result = berthType(n);
        System.out.println(result);
        //bw.write(result);
        //bw.newLine();
        scan.close();
        //bw.close();
    }
}
    
    
