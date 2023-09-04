package src.part4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Task 4.1 improve improved dialog from previous project;
 */
public class DoubleImprovedConversation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("This program recommends a music album based on your age and asked genre.");
		while (true) {
			System.out.print("Please, enter a music genre: ");
			String genre = scanner.nextLine();

			try {
				System.out.print("Please, enter your age: ");
				int age = scanner.nextInt();

				if (age < 0) {
					System.out.println("Welcome stranger, we don't have any music for non human species, sorry.");
				} else if (genre.equals("funk")) {
					if (age < 16) {
						System.out.println("\"Autonomy\" by Brother Moving" +
								" will be a great choice for you.");
					} else if (age < 50) {
						System.out.println("\"Blood Sugar Sex Magic\" by Red Hot Chili Peppers" +
								" will be a great choice for you.");
					} else {
						System.out.println("\"Raise!\" by Earth, Wind & Fire" +
								" will be a great choice for you.");
					}
				} else if (genre.equals("blues")) {
					if (age < 16) {
						System.out.println("\"El Camino\" by The Black Keys" +
								" will be a great choice for you.");
					} else if (age < 50) {
						System.out.println("\"Abbey Road\" by The Beatles" +
								" will be a great choice for you.");
					} else {
						System.out.println("\"Morrison Hotel\" by The Doors" +
								" will be a great choice for you.");
					}
				} else {
					System.out.print("We are not familiar with this genre, but you can try this albums: ");
					if (age < 16) {
						System.out.println("\"The Dark Side of the Moon\" by Pink Floyd");
					} else if (age < 50) {
						System.out.println("\"The Empyrean\" by John Frusciante");
					} else {
						System.out.println("\"In The Court Of The Crimson King\" by King Crimson");
					}
				}
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("\u001B[31mIt is not a number.\u001B[0m");
			}

			scanner.nextLine();
			System.out.print("Press 'y' or 'Y' to continue: ");
			String input = scanner.nextLine();
			if (!input.equals("y") && !input.equals("Y")) {
				scanner.close();
				return;
			}
		}
	}
}
