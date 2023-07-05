/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents a hand of cards in a Blackjack game.
 * The hand is a group of cards stored in an ArrayList.
 * Provides methods to add cards to the hand, calculate the total value of the hand,
 * and check if the hand has gone bust (over 21).
 * 
 * @author Bernardo Coelho
 */
public class Hand {

    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    /**
     * Add a card to the hand.
     * 
     * @param card the card to add
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Calculate the total value of the hand.
     * Number cards have their face value (e.g., 2-10).
     * Face cards (King, Queen, Jack) have a value of 10.
     * Ace can have a value of 1 or 11, depending on the player's hand.
     * 
     * @return the total value of the hand
     */
    public int calculateValue() {
        int value = 0;
        int numAces = 0;

        for (Card card : cards) {
            int cardValue = card.getValue();
            value += cardValue;

            if (cardValue == 11) {
                numAces++;
            }
        }

        // Adjust the value of Aces if necessary
        while (value > 21 && numAces > 0) {
            value -= 10;
            numAces--;
        }

        return value;
    }

    /**
     * Check if the hand has gone bust (over 21).
     * 
     * @return true if the hand is bust, false otherwise
     */
    public boolean isBust() {
        return calculateValue() > 21;
    }

    /**
     * Return a string representation of the hand.
     * 
     * @return the string representation
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append(", ");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length()); // Remove trailing comma and space
        }
        return sb.toString();
    }
}
