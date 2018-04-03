package basicjava;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5Loops {

    //@SuppressWarnings("resource")
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int prod = 0;
	for (int i = 1; i < 10 + 1; i++) {
	    prod = n * i;
	    System.out.println(n + " x " + i + " = " + prod  );
	} 
	
    }
}
