import java.util.ArrayList;

public class Player {
	private String name;
	private ArrayList<Card> hand;
	
	public Player (String name ) {
		this.name = name;
		hand = new ArrayList<>(); //Adjusts the hand based on the ArrayList of the hand
	}	
	
	public void draw( Deck deck ) {
		hand.add( deck.drawCard() ); //Adds a card to the hand from the deck
	}
	
	public ArrayList<Card> hand() {
		return hand;
	}
	
	public String toString() {
		return name + ": " + hand; 
	}
}
