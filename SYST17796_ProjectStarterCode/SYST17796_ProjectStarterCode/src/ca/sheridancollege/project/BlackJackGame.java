/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A class that represents a Blackjack game.
 * Manages the gameplay and provides methods for players to register, play, and determine the winner.
 * 
 * @author Bernardo Coelho
 */
public class BlackJackGame extends Game {

    private GroupOfCards deck;
    private List<Player> players;

    public BlackJackGame() {
        super("Blackjack");
        deck = new GroupOfCards();
        players = new ArrayList<>();
    }

    /**
     * Register a player for the game.
     * 
     * @param playerName the name of the player to register
     */
    public void registerPlayer(String playerName) {
        Player player = new Player(playerName);
        players.add(player);
    }

    /**
     * Start the game.
     * Shuffles the deck, deals two cards to each player, and prompts each player to play their turn.
     */
    @Override
    public void play() {
        
        deck.shuffle();

        // Deal two cards to each player
        for (Player player : players) {
            Card card1 = deck.dealCard();
            Card card2 = deck.dealCard();
            player.addCardToHand(card1);
            player.addCardToHand(card2);
        }

        // Play each player's turn
        for (Player player : players) {
            playTurn(player);
        }

        // Determine the winner(s)
        List<Player> winners = determineWinners();

        // Display the winner(s)
        displayWinners(winners);
    }

    /**
     * Play a player's turn.
     * Allows the player to hit (take another card) or stand (end their turn).
     * The dealer's choices are made by the program.
     * @param player the player whose turn to play
     */
    private void playTurn(Player player) {
    System.out.println(player + "'s turn:");
    System.out.println("Your hand: " + player.getHand());
    System.out.println("Total value: " + player.calculateHandValue());

    Scanner scanner = new Scanner(System.in);
    if (player.getName().equals("Dealer")) {
        // Automated dealer's turn
        while (player.calculateHandValue() < 18) {
            Card card = deck.dealCard();
            player.addCardToHand(card);
            System.out.println("Dealer drew: " + card);
            System.out.println("Dealer's hand: " + player.getHand());
        }
    } else {
        while (true) {
            System.out.print("Do you want to hit (h) or stand (s)? ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("h")) {
                Card card = deck.dealCard();
                player.addCardToHand(card);
                System.out.println("You drew: " + card);
                System.out.println("Your hand: " + player.getHand());
                System.out.println("Total value: " + player.calculateHandValue());

                if (player.isHandBust()) {
                    System.out.println("Bust! Your hand value is over 21.");
                    break;
                }
            } else if (choice.equals("s")) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'h' to hit or 's' to stand.");
            }
        }
    }

    System.out.println(player + "'s turn ends.");
    System.out.println();
}

    /**
     * Determine the winner(s) of the game.
     * Compares the total values of each player's hand to find the player(s) with the highest value
     * that is not bust (over 21).
     * 
     * @return the list of winner(s)
     */
    private List<Player> determineWinners() {
        List<Player> winners = new ArrayList<>();
        int highestValue = 0;

        for (Player player : players) {
            int value = player.calculateHandValue();

            if (value <= 21 && value > highestValue) {
                winners.clear();
                winners.add(player);
                highestValue = value;
            } else if (value == highestValue) {
                winners.add(player);
            }
        }

        return winners;
    }
    
    @Override
    public void declareWinner() {
    
    }

    /**
     * Display the winner(s) of the game.
     * 
     * @param winners the list of winner(s)
     */
    private void displayWinners(List<Player> winners) {
        if (winners.isEmpty()) {
            System.out.println("No winners. Everyone went bust!");
        } else {
            System.out.print("Winner(s): ");
            for (Player winner : winners) {
               System.out.print(winner + " ");
            }
            System.out.println();
        }
    }
}
