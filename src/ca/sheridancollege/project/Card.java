/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 *The basic Card class
 *@author dancye, 2018
 *@modifier Harleen Grewal, 17 July 2020
 */
public class Card 
{
	private Rank rank;
	private Suit suit;
        
        public enum Suit{HEARTS, CLUBS, SPADES, DIAMONDS};
        public enum Rank{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

	/**
	 * Parametrized constructor
	 * @param s
	 * @param r
	 */
	public Card(Suit s, Rank r) 
        {	
            setSuit(s);
            setRank(r);
	}
        
        public Rank getRank() 
        {
            return this.rank;
        }

        public Suit getSuit() 
        {
            return this.suit;
        }

        public void setRank(Rank rank) 
        {
            this.rank = rank;
        }

        public void setSuit(Suit suit) 
        {
            this.suit = suit;
        } 
}
