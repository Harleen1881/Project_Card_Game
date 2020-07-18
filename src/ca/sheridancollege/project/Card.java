/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public class Card 
{

	private Rank rank;
	private Suit suit;
        
        public enum Suit{HEARTS, CLUBS, SPADES, DIAMONDS};
        public enum Rank{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

	/**
	 * 
	 * @param s
	 * @param r
	 */
	public Card(Suit s, Rank r) {
		// TODO - implement Card.Card
		//throw new UnsupportedOperationException();
                setSuit(s);
                setRank(r);
	}
        
        public Rank getRank() {
        return this.rank;
        }

        public Suit getSuit() {
            return this.suit;
        }

        public void setRank(Rank rank) {
            this.rank = rank;
        }

        public void setSuit(Suit suit) {
            this.suit = suit;
        }
    
}
