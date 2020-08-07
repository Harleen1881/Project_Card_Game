/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models players and have methods related to the players
 * @author dancye, 2018
 * @modifier Vikas Rai, 6 August 2020
 */
public class Player
{
    private String playerID; //the unique ID for this player
    
    //Parametrized constructor
    public Player(String name)
    {
        setPlayerID(name);
    }
    
    public String getPlayerID()
    {
        return playerID;
    }
    
    public void setPlayerID(String givenID)
    {
        if (givenID.equals(""))
            throw new IllegalArgumentException("Invalid Name. Game Over");
        else
            playerID = givenID;
    }
    
    //Method to check uniqueness of the player's names
    public void check(Player player)
    {
        if (playerID.equals(player.playerID))
            throw new IllegalArgumentException("Players should have different names. Game Over");
    }

}