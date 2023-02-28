package application;
import java.util.Scanner;

public class FibonacciRecursive {
	
	
	static int RecursiveFibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		
		return RecursiveFibonacci(n - 1) + RecursiveFibonacci(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.nanoTime();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find its fibonacci sequence: ");
		int n = input.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			System.out.print(RecursiveFibonacci(i) + " ");
		}
		
		long totalTime = System.nanoTime() - startTime;
		
		System.out.println("\n" + "Total duration in nanoseconds: " + totalTime);
	}

}
