public class Card {
	private int rank;
	private String suit;
	
	public Card( int rank, String suit ) {
		this.rank = rank;
		this.suit = suit;
	}
	
	
	public String toString() {
		return rankAsString() + " of " + suit;
	}
	
	
	public static String[] suits() {
		String[] s = {"Clubs","Diamonds","Hearts","Spades"}; // Makes an array list for the suits of the cards
		return s;
	}
	
	
	public String rankAsString() {
		String[] faces = {"Jack","Queen","King","Ace"}; // Makes an array list for the rank of the cards.
		if( rank > 10 ) {
			// convert rank 11 to 14 to numbers 0 to 3
			return faces[ rank % 10 - 1 ];
		} else {
			return "" + rank;
		}
	}
}
