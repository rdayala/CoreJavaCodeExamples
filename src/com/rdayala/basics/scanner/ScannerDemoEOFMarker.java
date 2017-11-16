package com.rdayala.basics.scanner;

import java.util.Scanner;

// Sometimes, we have to check if the next value we read is of a certain type or 
// if the input has ended (EOF marker encountered).


public class ScannerDemoEOFMarker {

	public static void main(String[] args) {

		// Declare an object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
 
        // Initialize sum and count of input elements
        int sum = 0, count = 0;
 
        // Check if an int value is available
        while (sc.hasNextInt())
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("Mean: " + mean);
		
	}

}
