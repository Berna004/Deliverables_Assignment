/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.Scanner;

/*
@author Bernardo Coelho
*/

public class Main {
    public static void main(String[] args) {
    BlackJackGame game = new BlackJackGame();

    // Take input for Player 1's name
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Player's name: ");
    String playerName = scanner.nextLine();

    // Register Player 1 with the input name
    game.registerPlayer(playerName);

    game.registerPlayer("Dealer");

    game.play();
    }

}
