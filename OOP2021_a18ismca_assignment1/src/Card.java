
public class Card{ //The card has two properties, a suit and a rank. In this game, the card will also have a value added after the card is displayed.
	private String suit;
	private int rank;
	private int value; //is excluded from the constructor as it is not a part of a card.
	
	//The cards are later specified in the deck class.
	
public Card(String suit, int rank){ //The constructor. The card has a suit and a rank as mentioned before. Note that the value is not included in the constructor. If the suit diamonds is gotten, a 4 will together with the rank, be added to the value. If Clubs is gotten, a 6 will be added to the value instead. 
	this.rank = rank;
	this.suit = suit;
	if (getSuit() == "Diamonds") {
		this.value += 4 + rank;
	}
	else if(getSuit() == "Clubs") {
		this.value += 6 + rank;
	}
	else if(getSuit() == "Hearts") {
		this.value += 8 + rank;
	}
	else if(getSuit() == "Spades") {
		this.value += 10 + rank;
	}
}

//Each variable needs to be returned. 
public String getSuit() {
	return suit;
}

public int getRank() {
	return rank;
}


public int getValue() {
	return value;
	}

}
	






