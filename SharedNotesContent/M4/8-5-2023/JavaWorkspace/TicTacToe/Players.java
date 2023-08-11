package TicTacToe;

import java.util.Scanner;

public class Players {
    
    public String[] players = new String[2];

    public void viewPlayers() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player: " + (i + 1) + " -> " + players[i]);
        }
    }

    public void setPlayerShape() {
        System.out.println("Welcome to ***Tic-Tac-Toe***\n");
        System.out.println("Choose 'X' or 'O' for Player 1:");
        
        Scanner input = new Scanner(System.in);
        String shape = input.nextLine();

        if (shape.toLowerCase().equals("x")) {
            players[0] = "X";
            players[1] = "O";
        } else {
            players[0] = "O";
            players[1] = "X";
        }
        viewPlayers();
        //input.close();
    }

}
