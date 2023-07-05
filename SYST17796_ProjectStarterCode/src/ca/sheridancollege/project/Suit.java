/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;


/**
 * The standard suits are Spades, Hearts, Diamonds, and Clubs.
 * 
 * 
 * Author: Bernardo Coelho
 */
public enum Suit {
    SPADES("Spades"),
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private final String name;

    private Suit(String name) {
        this.name = name;
    }

    /**
     * Get the name of the suit.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Return a string representation of the suit.
     * 
     * @return the string representation
     */
    @Override
    public String toString() {
        return name;
    }
}
