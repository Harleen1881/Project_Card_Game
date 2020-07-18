/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * @modifier Harleen Kaur Grewal, 17 July 2020
 */
public class GroupOfCards 
{
    private ArrayList <Card> deck;
    
    public GroupOfCards() 
    {
        // TODO - implement GroupOfCards.GroupOfCards
	throw new UnsupportedOperationException();
    }
    
    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public Card showTopCard() {
	// TODO - implement GroupOfCards.showTopCard
	throw new UnsupportedOperationException();
    }

	/**
	 * 
	 * @param rank
	 */
	public int indexOf(Card.Rank rank) {
		// TODO - implement GroupOfCards.indexOf
		throw new UnsupportedOperationException();
	}

	
    
}//end class
