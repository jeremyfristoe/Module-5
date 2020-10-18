package m5v1;

//This is a program which will run the Fibonacci sequence iteratively for 30 loops.
//It includes functionality to keep track of the time it took to run the sequence.
//Created by Jeremy Fristoe for CEN-3024C-17056 Module 5 assignment.

public class FibIt {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime(); // establishes startTime as a long variable
		
		int n0 = 0; // establishes n0 as an integer and sets it to 0
		int n1 = 1; // establishes n1 as an integer and sets it to 1
		int n2, i, count = 30; // establishes n2, i, and count as integers, and sets the loop count to 30
		System.out.print(n0 + "\n" + n1); // outputting 0 and 1 to establish the first loop

		// additional loops continue until count is reached
		for(i = 2; i < count; ++i){ // for loops 2 through 3, do the following...
			n2 = (n0 + n1); // sets n2 to equal the sum of the previous values for n0 and n1
			System.out.print("\n" + n2); // output the value for n2 on a new line
			n0 = n1; // sets the "new" n0 to the "old" n1
			n1 = n2; // sets the "new" n1 to the "old" n2
		}

		long endTime = System.nanoTime(); // establishes endTime as a long variable
		
		// outputs the time it took for the method to run (in nanoseconds) by subtracting startTime from endTime
		System.out.println("\n\nTotal time was " + (endTime - startTime) + " nanoseconds.");

	}
}

