package basicjava;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem2 {

    public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	double meal_cost = in.nextDouble();
	int tip_percent = in.nextInt();
	int tax_percent = in.nextInt();

	double tip_cost = meal_cost * tip_percent / 100;
	double tax_cost = meal_cost * tax_percent / 100;
	double total_cost = meal_cost + tip_cost + tax_cost;
	

        System.out.println("The total meal cost is " + Math.round(total_cost) + " dollars." );
	
        in.close();
    }
	 
	

}


