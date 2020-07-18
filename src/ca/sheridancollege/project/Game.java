/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public class Game 
{
    
        private int Player1score = 0;
	private int Player2score = 0;
	private Card deck1;
	private Card deck2;
	private GroupOfCards deck;
	private Card player1Card;
	private Card player2Card;
    
    /**
	 * Play the game. This might be one method or many method calls depending
	 * on your game.
	 */
    public void play()
    {
        
    }

	/**
	 * 
	 * @param player1
	 * @param player2
	 * @param player1Card
	 * @param player2Card
	 */
	public void war(Player player1, Player player2, Card player1Card, Card player2Card) {
		// TODO - implement Game.war
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param winner
	 * @param looser
	 * @param winnerScore
	 * @param looserScore
	 * @param winnerSize
	 * @param looserSize
	 */
	public void roundWinner(Player winner, Player looser, int winnerScore, int looserScore, int winnerSize, int looserSize) {
		// TODO - implement Game.roundWinner
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param deck1
	 * @param deck2
	 */
	public boolean isEmpty(ArrayList<Card> deck1, ArrayList<Card> deck2) {
		// TODO - implement Game.isEmpty
		//throw new UnsupportedOperationException();
                return true;
	}

	/**
	 * 
	 * @param deck1
	 * @param deck2
	 * @param player1
	 * @param player2
	 */
	public void displayWinner(ArrayList<Card> deck1, ArrayList<Card> deck2, Player player1, Player player2) {
		// TODO - implement Game.displayWinner
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param player1
	 * @param player2
	 */
	public void displayWinnerBetween(Player player1, Player player2) {
		// TODO - implement Game.displayWinnerBetween
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param winner
	 */
	public void displayString(String winner) {
		// TODO - implement Game.displayString
		throw new UnsupportedOperationException();
	}

	

   
    
}//end class
