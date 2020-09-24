package snakeLadder;

/**
 * Two Player Snake and Ladder Simulator.
 */

public class SnakeLadder {
	// constants
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE = 3;
	public static final int WINNING_POSITION = 100;

	public static void main(String[] args) {

		// variables
		int playerOnePosition;
		int playerTwoPosition;
		int numberOnDie;
		int option;
		int noOfTurns = 0;
		int playerOneTurns = 0;
		int playerTwoTurns = 0;
		int isPlayerOneTurn;

		// Setting player starting position to zero
		playerOnePosition = 0;
		playerTwoPosition = 0;

		// Repeating till the player reaches position 100

		// playerOne starts the game (1->true 0->false)
		isPlayerOneTurn = 1;

		System.out.println("-----------------------------");
		System.out.println("posPlayerOne\tposPlayerTwo");
		System.out.println("-----------------------------");
		while (playerOnePosition < WINNING_POSITION && playerTwoPosition < WINNING_POSITION) {

			switch ((int) isPlayerOneTurn) {
			case 1:
				// PlayerOne
				// Get number on Die (between 1 and 6)
				numberOnDie = (int) Math.floor((Math.random() * 6) + 1);
				playerOneTurns++;

				// Check for option
				option = (int) Math.floor((Math.random() * 3) + 1);
				switch (option) {
				case NO_PLAY:
					break;
				case LADDER:
					if (playerOnePosition + numberOnDie <= WINNING_POSITION)
						playerOnePosition += numberOnDie;
					break;
				case SNAKE:
					playerOnePosition -= numberOnDie;
					if (playerOnePosition < 0)
						playerOnePosition = 0;
					break;
				}
				if (option == LADDER)
					break;
				else
					isPlayerOneTurn = 0;
				System.out.print(playerOnePosition + "\t\t");
				break;
			case 0:
				// PlayerTwo
				// Get number on Die (between 1 and 6)
				numberOnDie = (int) Math.floor((Math.random() * 6) + 1);
				playerTwoTurns++;

				// Check for option
				option = (int) Math.floor((Math.random() * 3) + 1);
				switch (option) {
				case NO_PLAY:
					break;
				case LADDER:
					if (playerTwoPosition + numberOnDie <= WINNING_POSITION)
						playerTwoPosition += numberOnDie;
					break;
				case SNAKE:
					playerTwoPosition -= numberOnDie;
					if (playerTwoPosition < 0)
						playerTwoPosition = 0;
					break;
				}
				if (option == LADDER)
					break;
				else
					isPlayerOneTurn = 1;
				System.out.println(playerTwoPosition);
				break;
			}
		}

		if (playerOnePosition == WINNING_POSITION) {
			System.out.println(playerOnePosition + "\t\t" + playerTwoPosition);
			System.out.println("-----------------------------");
			System.out.println("Player One has won the game!");
		}

		else {
			System.out.println(playerTwoPosition);
			System.out.println("-----------------------------");
			System.out.println("Player Two has won the game!");
		}
	}

}
