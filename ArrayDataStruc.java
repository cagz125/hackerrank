package mcy;

import java.util.Scanner;

public class ArrayDataStruc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
       String word = "";
        
        for(int i = n-1; i > -1; i--) {
        	if(i == 0) {
        		word += arr[i];
        	}else {
        		word += arr[i]+" ";
        	}
        }
        System.out.println(word);
        in.close();	
	}

}
