import java.util.Scanner;

public class RecursionSum {

	public static void main(String[] args) {
		// Create scanner for user input
		Scanner scan = new Scanner(System.in);
		// Integer array for numbers
		int[] numbers = new int[5];
		// Prompt for user to enter numbers
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Enter Number " + (i + 1) + ": ");
			numbers[i] = scan.nextInt();
		}
		// Print sum using recursion method
		System.out.println("Total Sum: " + sum(numbers, 0));
	}
	// Recursion method for sum
	public static int sum(int [] numbers, int i) {
		if(i == numbers.length) {
			return 0;
		}
		
		return numbers[i] + sum(numbers, i + 1);
		
	}

}
