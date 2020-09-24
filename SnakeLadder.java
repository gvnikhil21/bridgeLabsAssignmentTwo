package snakeLadder;

/**
 * Single Player Snake and Ladder Simulator.
 */

public class SnakeLadder {
	// constants
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE = 3;
	public static final int WINNING_POSITION = 100;

	public static void main(String[] args) {

		// variables
		int playerPosition;
		int numberOnDie;
		int option;
		int noOfTurns = 0;

		// Setting player starting position to zero
		playerPosition = 0;

		System.out.println("-----------------------------------------------");
		System.out.println("numOnDie\toptionType\tplayerPosition");
		System.out.println("-----------------------------------------------");
		// Repeating till the player reaches position 100
		while (playerPosition < WINNING_POSITION) {
			// Get number on Die (between 1 and 6)
			numberOnDie = (int) Math.floor((Math.random() * 6) + 1);
			System.out.print(numberOnDie + "\t\t");
			noOfTurns++;

			// Check for option
			option = (int) Math.floor((Math.random() * 3) + 1);
			switch (option) {
			case NO_PLAY:
				System.out.print("NO_PLAY\t\t\t");
				break;
			case LADDER:
				if (playerPosition + numberOnDie <= WINNING_POSITION)
					playerPosition += numberOnDie;
				System.out.print("LADDER\t\t\t");
				break;
			case SNAKE:
				playerPosition -= numberOnDie;
				if (playerPosition < 0)
					playerPosition = 0;
				System.out.print("SNAKE\t\t\t");
				break;
			}
			System.out.println(playerPosition);
		}
		System.out.println("-----------------------------------------------");
		System.out.println("To win the game, the dice was thrown " + noOfTurns + " times.");
	}

}
