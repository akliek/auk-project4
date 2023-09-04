package src.part2;

import java.util.Scanner;

/**
 * Task 2.1 simple dialog with a loop.
 */
public class SimpleDialog {
	public static void main(String[] args) {
		String  input;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Write a random string: ");
			input = scanner.nextLine();

			System.out.println("Your string, but capitalized: " + input.toUpperCase());

			System.out.print("Press 'y' or 'Y' to continue: ");
			input = scanner.nextLine();
			if (!input.equals("y") && !input.equals("Y")) {
				scanner.close();
				return;
			}
		}
	}
}
