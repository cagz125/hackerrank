package basicjava;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<String> studentNames = new ArrayList<String>();
	studentNames.add("Student1");
	studentNames.add("Student2");
	System.out.println(studentNames.size());
	
	int [] arr = new int [] {8, 5, 15, 23, 1, 7};
	for (int i =  arr.length - 1; i > 0; i--) {
	    arr[i - 1] = arr[i];
	    System.out.println("print out i  " + i);

	    System.out.println("print out arr[i] " + arr[i]);
	 
	}
	System.out.println(arr[0]);
    }

}
