package finalCodingProject06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	// --------Class Fields--------
	private List<Card> hand = new ArrayList<>();
	private int score = 0;
	private String name;
	
	// --------Class Methods--------
	// print out information about the player and call the describe method for each card 
	// in the hand list
	public void describe() {
		System.out.println("Player: " + name + "\tHand:");
		System.out.println("---------------------------------");
		for (Card card : hand) {
			card.describe();
		}
		System.out.println("---------------------------------");
	}
	
	// remove and return the top card of the player's hand
	public Card flip() {
		Card result = hand.remove(0);
		return result;
	}
	
	// take a Deck argument, call the draw method on the deck, and add the
	// returned Card to the hand field
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	// add 1 to the Player's score field
	public void incrementScore() {
		score++;
	}

	
	// ------Getters and Setters------
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
