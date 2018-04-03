package mcy;

import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String word ;
		String[] wordOne = new String[n];
		String[] wordTwo = new String[n];
		for (int i = 0; i < n; i++) {
			wordOne[i] = "";
			wordTwo[i] = "";
		}
		//word = scan.next();
		
		for (int i = 0; i < n ; i++) {
			
			word = scan.next(); 
			//System.out.println(word + " " + i);
			char[] myCharArray = word.toCharArray();
			
			for (int j = 0;j < word.length(); j++ ) {
				if (j % 2 == 0) {
					wordOne[i] += myCharArray[j];	
				}
				else{
					wordTwo[i] += myCharArray[j];
				}	
			}
		System.out.println(wordOne[i] + " " + wordTwo[i]);
		}	      
	}
}
