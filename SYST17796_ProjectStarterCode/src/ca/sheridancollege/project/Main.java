/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ca.sheridancollege.project;

public class Main {

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();
        game.registerPlayer("Player 1");
        game.registerPlayer("Player 2");
        game.play();
    }
}
