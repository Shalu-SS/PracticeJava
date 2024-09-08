package CodeTest;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int numA;
        int numB;
        System.out.println("Enter A: ");
 
        // Create Scanner object
        Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        numA = s.nextInt();

        System.out.println("Enter B: ");
        
        // Create Scanner object
        Scanner s1 = new Scanner(System.in);
 
        // Read the next integer from the screen
        numB = s1.nextInt();
        
        int temp = numA;
        numA =  numB;
        numB = temp;
        System.out.println("A is " + numA);
        System.out.println("B is " + numB);

	}

}
