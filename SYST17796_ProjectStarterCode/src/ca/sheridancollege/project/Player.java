/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Bernardo Coelho July 2023
 */
public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    /**
     * Get the name of the player.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the player's hand.
     * 
     * @return the hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Add a card to the player's hand.
     * 
     * @param card the card to add
     */
    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    /**
     * Calculate the total value of the player's hand.
     *     * @return the total value of the hand
     */
    public int calculateHandValue() {
        return hand.calculateValue();
    }

    /**
     * Check if the player's hand has gone bust (over 21).
     * 
     * @return true if the hand is bust, false otherwise
     */
    public boolean isHandBust() {
        return hand.isBust();
    }

    /**
     * Return a string representation of the player.
     * 
     * @return the string representation
     */
    @Override
    public String toString() {
        return name;
    }
}
