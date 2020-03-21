import java.util.Random;
import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cards;
	private Random rand;
	
	public Deck() {
		rand = new Random(); //ini rng
		cards = new ArrayList<>(); //ini cards
		for( String suit : Card.suits() ) { //for loop
			for(int rank = 2;rank<15;rank++) { //for loop
				cards.add( new Card( rank, suit )); //adds a new card of the rank and suit 
			}
		}
	}
	
	public String toString() {
		String result = "";
		for( Card card : cards) {
			result += card + "\n"; //adds the new card to the deck
		}
		return result;
	}
	
	public Card drawCard() {
		return cards.remove( rand.nextInt(cards.size())); //removes card based on the rng
	}
	
	public int size() {
		return cards.size();
	}
	
}
