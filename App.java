package finalCodingProject06;

public class App {

	public static void main(String[] args) {
		
		// Instantiate a Deck and two Players. Shuffle the deck.
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
		Player player1 = new Player();
		player1.setName("Player 1");
		Player player2 = new Player();
		player2.setName("Player 2");
		
		/*
		 * Using a traditional for loop, iterate 52 times calling the Draw method on the 
		 * other player each iteration using the Deck you instantiated
		 */
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(gameDeck);
			} else {
				player2.draw(gameDeck);
			}
		}
		
		// show each player's hand as a quick check
		player1.describe();
		System.out.println();
		player2.describe();
		
		
		/*
		 *  Using a traditional for loop, iterate 26 times and call the flip method for
		 *  each player 
		 */
		for (int i = 0; i < 26; i++) {
			Card p1Card = player1.flip(); // player 1's dealt card
			Card p2Card = player2.flip(); // player 2's dealt card
			
			// display each player's card for each "battle"
			System.out.println("\nBattle # " + (i+1));
			System.out.println("Player 1's Card: " + p1Card.getName() + "\tPlayer 2's Card: "
					+ p2Card.getName());
			
			// determine the results of each battle and print the result
			if (p1Card.getValue() > p2Card.getValue()) {	
				player1.incrementScore();
				System.out.println("Player 1 received a point!");
			} else if (p2Card.getValue() > p1Card.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 received a point!");
			} else {
				System.out.println("Draw. No point awarded.");
			}
		}
		
		// print out the final results for the game and identify the winner
		System.out.println("\n----------Final Results----------");
		System.out.println("Player 1: " + player1.getScore() + " Points" +
				"\tPlayer 2: " + player2.getScore() + " Points");
		System.out.println("\nAnd the winner is:");
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2");
		} else {
			System.out.println("Draw");
		}
		

	} // end of main

}
