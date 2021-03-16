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
		this.cards = new Card[52];
		int i=0;
		for (int  s = 0;s<suits.length;s++){
			for (int n = 0;n< names.length;n++){
				this.cards[i]=new Card(names[n], suits[s]);
				i++;
			}
		}
	}

	
	//shuffles each card by swapping itself with a random card in the unshuffled part
	public void shuffle() {
		Card temp;
		
			for(int i =0;i<this.cards.length;i++){
				int rnd = randomGen(this.cards.length);
				temp = this.cards[i];
				this.cards[i]=this.cards[rnd];
				this.cards[rnd]=temp;
			}
			
	}

	public String toString(){
		return this.cards[0].getName() + " "+this.cards[0].getSuit();
	}
	
	
	// take the number the player should get, return an array of cards the player gets 
	public Card[] deal(int number) {
		if((52-this.dealtIndex)<number){
			return null;
		}
		else{
			Card [] playerGot = new Card[number];
			for(int i =0;i<playerGot.length;i++){
				dealtIndex++;
				int randN = randomGen(this.cards.length);
				playerGot[i] = this.cards[randN];
				//making sure that I remove this card from the deck to avoid duplicates
				this.cards = removeFromDeck(playerGot[i]);
			}
			return playerGot;
		}
	}

	public int randomGen(int maxVal){
		Random r = new Random();
			int low = 0;
			int high = maxVal;
			int result = r.nextInt(high-low) + low;
			return result;
	}

	public Card[] removeFromDeck(Card card){
		Card [] newStack = new Card[this.cards.length-1];
		
		for(int i=0,k=0;i<this.cards.length;i++){
			if(this.cards[i]!=card){
				newStack[k++]=this.cards[i];
			}
		}
		return newStack;
	}

	//end of class
}