package m5v1;

//This is a program which will run the Fibonacci sequence recursively for 30 loops.
//It includes functionality to keep track of the time it took to run the sequence.
//Created by Jeremy Fristoe for CEN-3024C-17056 Module 5 assignment.

public class FibRec {
		
	static int n0 = 0; // establishes n0 as a static integer and sets it to 0
	static int n1 = 1; // establishes n1 as a static integer and sets it to 1
	static int n2 = 0; // establishes n2 as a static integer and sets it to 0
	
	static void fibOut (int count) {
		if (count > 0) { // if the count is greater than 0, do the following
			n2 = n0 + n1; // sets n2 to equal the sum of the previous values for n0 and n1
			n0 = n1; // sets n0 equal to n1
			n1 = n2; // sets n1 equal to n2
			System.out.println(n2); // outputs the value of n2
			fibOut (count - 1); // subtracts 1 from the loop counter (30) to account for the output of the first value
		}
	}
	
	public static void main(String args[]) {
		long startTime = System.nanoTime(); // establishes startTime as a long variable
		int count = 30; // establishes the loop count as an integer and sets it to 30
		System.out.println(n0 + "\n" + n1); // output initial values for n0 and n1
		fibOut (count - 2); // subtracts 2 from the loop counter (30) to account for the output of the first two values
		long endTime = System.nanoTime(); // establishes endTime as a long variable

		// outputs the time it took for the method to run (in nanoseconds) by subtracting startTime from endTime
		System.out.println("\nTotal time was " + (endTime - startTime) + " nanoseconds.");
	}

}