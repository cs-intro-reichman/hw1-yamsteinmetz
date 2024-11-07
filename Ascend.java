// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Random;

public class Ascend {
	public static void main(String[] args) {
		int lim = 100;  
        // Generate three random integers
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);
        
        // Print the original numbers
        System.out.println("Original numbers: " + a + " " + b + " " + c);
        
        // Find the smallest, middle, and largest using Math.min() and Math.max()
        int smallest = Math.min(Math.min(a, b), c);
        int largest = Math.max(Math.max(a, b), c);
        int middle = a + b + c - smallest - largest; // sum of all three minus smallest and largest
        
        // Print the numbers in ascending order
        System.out.println("Sorted numbers: " + smallest + " " + middle + " " + largest);
    }
	}

