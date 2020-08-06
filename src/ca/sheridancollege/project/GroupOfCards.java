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
 * @modifier Puru Dhingra, 6 August, 2020
 */
public class GroupOfCards
{
    private ArrayList <Card> deck;

    public GroupOfCards()
    {
        deck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(suit,rank));
            }
        }
    }
    
    public Card showTopCard()
    {
        return deck.remove(0);
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public int indexOf(Card.Rank rank)
    {
        return rank.ordinal();
    }

}//end class
