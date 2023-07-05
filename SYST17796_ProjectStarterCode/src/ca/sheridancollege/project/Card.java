/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Bernardo Coelho   Date: July 5th, 2023
 */
public class Card {

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Get the suit of the card.
     * 
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Get the rank of the card.
     * 
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Get the value of the card in Blackjack.
     * Number cards have their face value (e.g., 2-10).
     * Face cards (King, Queen, Jack) have a value of 10.
     * Ace can have a value of 1 or 11, depending on the player's hand.
     * 
     * @return the value of the card in Blackjack
     */
    public int getValue() {
        return rank.getValue();
    }

    /**
     * Return a string representation of the card.
     * 
     * @return the string representation
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}