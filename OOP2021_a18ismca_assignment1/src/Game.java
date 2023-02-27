import java.util.*;

public class Game {

	
	private static void outputThreeCards() { //Here, 3 cards are output. Also includes the win or lose function from the deck.
		System.out.println("-------------------> Playing a game round...");
		Deck deck = new Deck();
		deck.shuffleDeck();
		ArrayList<Card> threeCards = deck.displayThreeCards();
		deck.winOrLose(threeCards);
	}
	
private static boolean continuePlaying(){ //Whether the player wants to restart or leave.
		System.out.println("********** Press 2 to restart. Otherwise enter a number except 2 to quit. **********");
		Scanner input = new Scanner(System.in);
		int decision = input.nextInt();
		return ((decision == 2)?true:false );  //If 2 is pressed, play game again!.
			
		}
	

private static void playGame() { //Includes the outputted three cards and three rounds. 
	outputThreeCards();
}
	
	public static void main(String[] args) {
		System.out.println("Welcome to LuckyCard game! ");
	boolean keepPlaying = true;
	while(keepPlaying) {
		playGame(); //run the game.
keepPlaying = continuePlaying();
	}
	if(keepPlaying == false) {
		System.out.println("Thank you for playing! ");
	}
}}
	

	



