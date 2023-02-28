package application;

import java.util.Scanner;

public class FibonacciIterative {
	
	static void IterativeFibonacci (int n) {
		int num1 = 0;
		int num2 = 1;
		int counter = 0;
		
		while (counter < n ) {
			System.out.print(num1 + " ");
			
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
			counter = counter + 1;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find its fibonacci sequence: ");
		int n = input.nextInt();
		
		IterativeFibonacci(n);
		
		
		long totalTime = System.nanoTime() - startTime;
		
		
		System.out.println("\n" + "Total duration in nanoseconds: " + totalTime);
		
	}

}
