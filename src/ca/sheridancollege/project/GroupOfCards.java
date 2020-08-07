/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class that models our deck and contains methods related to our deck.
 * @author dancye
 * @modifier Puru Dhingra, 6 August 2020
 */
public class GroupOfCards
{
    private ArrayList <Card> deck;

    //Default constructor
    public GroupOfCards()
    {
        deck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) 
        {
            for (Card.Rank rank : Card.Rank.values()) 
            {
                deck.add(new Card(suit,rank));
            }
        }
    }
    
    //Method used to pull cards
    public Card showTopCard()
    {
        return deck.remove(0);
    }

    //Method used to shuffle the deck
    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    //Method that returns the index number of the Card
    public int indexOf(Card.Rank rank)
    {
        return rank.ordinal();
    }
}//end class
