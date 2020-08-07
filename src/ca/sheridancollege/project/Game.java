/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models our game.
 * @author dancye, 2018
 * @modifier Ann Rachel Panicker
 * 6 August 2020
 */
public class Game 
{
    private ArrayList<Card> deck1;
    private ArrayList<Card> deck2;
    private GroupOfCards deck;
    private int Player1score = 0;
    private int Player2score = 0;
    private Card player1Card;
    private Card player2Card;
    
    /**
     * play() starts the game
     */
    public void play()
    {
        try 
        {
            String response;
            Scanner input = new Scanner(System.in);
            System.out.println("This is the war game");
            System.out.println("Enter player 1 name");
            String player1 = input.nextLine();
            System.out.println("Enter player 2 name");
            String player2 = input.nextLine();

            Player playerOne = new Player(player1);
            Player playerTwo = new Player(player2);

            playerOne.check(playerTwo);

            System.out.println("The game begins now");

            deck = new GroupOfCards();
            deck.shuffle();
            deck1 = new ArrayList();
            deck2 = new ArrayList();

            for (int i = 1; i <= 52; i++) {
                if (i % 2 == 0) {
                    deck1.add(deck.showTopCard());
                } else {
                    deck2.add(deck.showTopCard());
                }
            }

            do {
                player1Card = deck1.remove(0);
                player2Card = deck2.remove(0);

                System.out.println(playerOne.getPlayerID() + " got " + player1Card.getRank() + " of " + player1Card.getSuit());
                System.out.println(playerTwo.getPlayerID() + " got " + player2Card.getRank() + " of " + player2Card.getSuit());

                if (deck.indexOf(player1Card.getRank()) > deck.indexOf(player2Card.getRank())) {
                    Player1score++;
                    deck1.add(player2Card);
                    deck1.add(player1Card);
                    roundWinner(playerOne, playerTwo, Player1score, Player2score, deck1.size(), deck2.size());
                } else if (deck.indexOf(player2Card.getRank()) > deck.indexOf(player1Card.getRank())) {
                    Player2score++;
                    deck2.add(player1Card);
                    deck2.add(player2Card);
                    roundWinner(playerTwo, playerOne, Player2score, Player1score, deck2.size(), deck1.size());
                } else {
                    war(playerOne, playerTwo, player1Card, player2Card);
                }
                System.out.println("Type y or Y to continue plating");
                response = input.nextLine();
                displayWinner(deck1, deck2, playerOne, playerTwo);
            } while (response.equals("y") || response.equals("Y"));
            displayWinnerBetween(playerOne,playerTwo);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }  
    }

    /*
    * war() is invoked when both players pull cards of same ranks
    */
    public void war(Player player1, Player player2, Card player1Card, Card player2Card) 
    {
        System.out.println("This is a war");
        System.out.println("Each player draws one card");
        Card warCard1 = deck1.remove(0);
        Card warCard2 = deck2.remove(0);

        System.out.println(player1.getPlayerID() + " got " + warCard1.getRank() + " of " + warCard1.getSuit());
        System.out.println(player2.getPlayerID() + " got " + warCard2.getRank() + " of " + warCard2.getSuit());

        System.out.println("Now each player draws another card which will determine who gets all cards");
        Card warCard3 = deck1.remove(0);
        Card warCard4 = deck2.remove(0);

        System.out.println(player1.getPlayerID() + " got " + warCard3.getRank() + " of " + warCard3.getSuit());
        System.out.println(player2.getPlayerID() + " got " + warCard4.getRank() + " of " + warCard4.getSuit());

        if(deck.indexOf(warCard4.getRank())>deck.indexOf(warCard3.getRank())){
            deck2.add(warCard3);
            deck2.add(warCard4);
            deck2.add(warCard2);
            deck2.add(warCard1);
            deck2.add(player1Card);
            deck2.add(player2Card);
            Player2score++;
            roundWinner(player2,player1,Player2score,Player1score,deck2.size(),deck1.size());
        }
        else if(deck.indexOf(warCard4.getRank())<deck.indexOf(warCard3.getRank())){
            deck1.add(warCard3);
            deck1.add(warCard4);
            deck1.add(warCard2);
            deck1.add(warCard1);
            deck1.add(player1Card);
            deck1.add(player2Card);
            Player1score++;
            roundWinner(player1,player2,Player1score,Player2score,deck1.size(),deck2.size());
        }
        else {
            war(player1,player2,player1Card,player2Card);
        }
    }

    /**
     * 
     * @param winner
     * @param looser
     * @param winnerScore
     * @param looserScore
     * @param winnerSize
     * @param looserSize 
     * roundWinner() displays who won each round and the no.of cards left with each player
     **/
    public void roundWinner(Player winner, Player looser, int winnerScore, int looserScore, int winnerSize, int looserSize) 
    {
	System.out.println(winner.getPlayerID()+" wins this round");
        System.out.println("Score of "+winner.getPlayerID()+": " + winnerScore +"\n" +
                "Cards Left: " +winnerSize);
        System.out.println("Score of "+looser.getPlayerID()+": " + looserScore +"\n" +
                "Cards Left: " +looserSize);
    }

    /**
     * 
     * @param deck1
     * @param deck2
     * isEmpty() checks if the deck of cards given to each player is empty
     **/
    public boolean isEmpty(ArrayList<Card> deck1, ArrayList<Card> deck2) 
    {
        if (deck1.size() == 1 || deck2.size() == 1) 
        {
            return true;
        }
        else
        {
            return false;
	}
    }

    /**
     * 
     * @param deck1
     * @param deck2
     * @param player1
     * @param player2 
     * displayWinner() shows who won the game and also displays winner's score once both deck of cards become empty
     **/
    public void displayWinner(ArrayList<Card> deck1, ArrayList<Card> deck2, Player player1, Player player2) 
    {
        if (isEmpty(deck1, deck2) == true) 
        {
            if(Player1score>Player2score)
            {
                int score = Player1score-Player2score-1;
                displayString(player1.getPlayerID()+" Won By: " +score + " Scores"  );
            }

            else if(Player2score>Player1score)
            {
                int score = Player2score-Player1score-1;
                displayString(player2.getPlayerID()+" Won By: " +score +" Scores" );
            }
        }
    }

    /**
     * 
     * @param player1
     * @param player2 
     * displayWinnerBetween() is invoked if there is a chance of tie
     **/
    public void displayWinnerBetween(Player player1, Player player2) 
    {
	if(Player1score>Player2score)
        {
            int score = Player1score-Player2score-1;
            displayString(player1.getPlayerID()+" Won By: " +score + " Scores"  );

        }
        else if(Player2score>Player1score)
        {
            int score = Player2score-Player1score-1;
            displayString(player2.getPlayerID()+" Won By: " +score +" Scores" );
        }
        else
            System.out.println("This game is tied");
    }

    /**
     * 
     * @param winner
     * displays the winner of the game
     **/
    public void displayString(String winner) 
    {
        System.out.println(winner);
    }
}//end class
