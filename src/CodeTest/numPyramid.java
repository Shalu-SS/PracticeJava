package CodeTest;

import java.util.Scanner;

public class numPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int inputNum;
        
        System.out.println("Enter the integer: ");
 
        // Create Scanner object
        Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        inputNum = s.nextInt();
        
        for(int i=0; i<inputNum; i++) {
        	for(int j=1; j<=i+1; j++) {
        		System.out.print(j);
        	}
//        	System.out.print(inputNum-i);
        	System.out.println();
        }

	}

}
