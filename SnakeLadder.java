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

		// Setting player starting position to zero
		playerPosition = 0;

		// Repeating till the player reaches position 100
		while (playerPosition < 100) {
			// Get number on Die (between 1 and 6)
			numberOnDie = (int) Math.floor((Math.random() * 6) + 1);

			// Check for option
			option = (int) Math.floor((Math.random() * 3) + 1);
			switch (option) {
			case NO_PLAY:
				break;
			case LADDER:
				playerPosition += numberOnDie;
				break;
			case SNAKE:
				playerPosition -= numberOnDie;
				if (playerPosition < 0)
					playerPosition = 0;
				break;
			}
		}
	}

}
