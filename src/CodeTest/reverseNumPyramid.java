package CodeTest;

import java.util.Scanner;

public class reverseNumPyramid {

	public static void main(String[] args) {
		

        int inputNum;
        int sum =0;
        System.out.println("Enter the integer: ");
 
        // Create Scanner object
        Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        inputNum = s.nextInt();
        
        for(int i=0; i<inputNum; i++) {
        	for(int j=1; j<=inputNum-i; j++) {
        		
        		System.out.print(j);
        	}
//        	System.out.print(inputNum-i);
        	System.out.println();
        }


	}

}
