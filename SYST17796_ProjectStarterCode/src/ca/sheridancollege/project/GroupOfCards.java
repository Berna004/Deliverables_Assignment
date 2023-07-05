/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *A class that represents a deck of cards in a Blackjack game.
 * The deck is a group of cards stored in an ArrayList.
 * Provides methods to shuffle the deck and deal cards from the deck.
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Bernardo Coelho July 2023
 */


 
public class GroupOfCards {

    private List<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    /**
     * Initialize the deck of cards.
     * Creates all possible cards in a deck (52 cards).
     */
    private void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    /**
     * Shuffle the deck of cards.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Deal a card from the deck.
     * Removes and returns the top card from the deck.
     * If the deck is empty, returns null.
     * 
     * @return the dealt card
     */
    public Card dealCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}
