package src.part3;

import java.util.Scanner;

/**
 * Task 3.1 improved dialog with a loop.
 */
public class ImprovedDialog {
	public static void main(String[] args) {
		String  input;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Write a random string: ");
			input = scanner.nextLine();

			System.out.print("Your string in reverse order: ");
			for (int i = input.length() - 1; i >= 0; --i) {
				System.out.print(input.charAt(i));
			}
			System.out.println();

			System.out.print("Press 'y' or 'Y' to continue: ");
			input = scanner.nextLine();
			if (!input.equals("y") && !input.equals("Y")) {
				scanner.close();
				return;
			}
		}
	}
}
