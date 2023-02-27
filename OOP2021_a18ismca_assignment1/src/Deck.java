
import java.util.*;

public class Deck{
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck(){ //A deck has 52 card, 4 suits with 13 ranks each. We get 52 cards by multiplying the suits and the ranks when a new Card is created.
	String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
	int[] rank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	for(int i = 0; i < suit.length; i++) {
		for(int j = 0; j < rank.length; j++) {
			deck.add(new Card(suit[i], rank[j]));
			}
	}
	}
	

	public ArrayList<Card> displayThreeCards() { //Here is the output of the three cards in the game. We pick three cards from the ArrayList. We get and randomize a suit, a rank and get a value by reaching the array list of deck. By using a for-loop we don't need to write the output three times.
		ArrayList<Card> threeCards = new ArrayList<Card>();
		for (int i = 0; i <= 2; i++) {
			Card picked = deck.get(51 - i); //We pick card by card three times, which means that there are 49 cards (48 cards in this function as the start number is 0.) left in the deck.
			System.out.println("Card " + (i+1) + ": " + picked.getSuit() + " " + picked.getRank() + " ----> Value = " + picked.getValue());
	threeCards.add(i, picked);
		}	
		return threeCards;
	}
	
	public void winOrLose(ArrayList<Card> threeCards) { //if the value of the third card is between the values of the first two cards, you will win. Otherwise, you will lose.
		if (threeCards.get(2).getValue() > threeCards.get(1).getValue() && threeCards.get(2).getValue() < threeCards.get(0).getValue() || threeCards.get(2).getValue() < threeCards.get(1).getValue() && threeCards.get(2).getValue() > threeCards.get(0).getValue()) {
			System.out.println("You win! ");
		}
		else {
			System.out.println("You lose! ");
		}
			
		}
	


	
public void shuffleDeck() {
	Collections.shuffle(deck);
}


}



