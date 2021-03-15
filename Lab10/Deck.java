/* skeleton starter file of Deck
   Author: Meng Yang
   Date: May, 2020
*/
//Peter Boldyrev CSSSKL 142 // Lab 10
import java.util.Arrays;
import java.util.Random;

public class Deck {
	private String[] names = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] suits = {"Club", "Diamond", "Heart", "Spade"};
	
	private Card[] cards; 
	private int dealtIndex = 0; // the number of the cards dealt
	
	public Deck() {
		
	}

	//shuffles each card by swapping itself with a random card in the unshuffled part
	public void shuffle() {
		
	}
	// swaps two cards
	private void swap(Card[] cards, int i, int j) {
		
	}
	
	// take the number the player should get, return an array of cards the player gets 
	public Card[] deal(int number) {
		
	}
}