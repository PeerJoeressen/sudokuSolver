package sudokuSolver.game;

import java.util.Scanner;

public class BoardUtils {

	public static boolean isSolved(Board b) {
		return false;
	}

	public static byte[][] generateRandomBoard() {
		return null;
	}

	public static void getAndSetNewNumber(Board game) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welche Zahl wollen Sie ändern? Geben Sie die Spalte ein:");
		byte col = input.nextByte();
		System.out.println("In welcher Zeile?");
		byte row = input.nextByte();
		System.out.println("Zu welcher Zahl soll Sie geändert werden?");
		byte newNumber = input.nextByte();
		while (newNumber > 9 || newNumber < 1) {
			System.out.println("Die Nummer kann nur zwischen 0 & 10 liegen.");
			System.out.println("Geben Sie eine neue Nummer ein:");
			newNumber = input.nextByte();
		}
		game.setNumber(col - 1, row - 1, newNumber);
		input.close();
	}
}
