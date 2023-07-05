package ca.sheridancollege.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bernardo Coelho
 * Each rank has a name and a value.
 * The value can be a number from 2 to 10 or one of the face cards (Ace, King, Queen, Jack).
 * The value of Ace is set to 11.
 * The value of King, Queen, and Jack is set to 10.
 */
public enum Rank {
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    ACE("Ace", 11),
    KING("King", 10),
    QUEEN("Queen", 10),
    JACK("Jack", 10);

    private final String name;
    private final int value;

    private Rank(String name, int value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Get the name of the rank.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the value of the rank.
     * 
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Return a string representation of the rank.
     * 
     * @return the string representation
     */
    @Override
    public String toString() {
        return name;
    }
}
