package TicTacToe;

import java.util.Scanner;

public class GameManager {
    
    Players player = new Players();
    Board board = new Board();

    public void startGame() {
        
        player.setPlayerShape();
        getResponseFromPlayers();
    }

    private void getResponseFromPlayers(){
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Player 1 choose posetion in board:");
                int p1 = input.nextInt();
                setPosetionsOnBoard(p1, player.players[0]);
                board.viewBoard();
            } else {
                System.out.println("Player 2 choose posetion in board:");
                int p2 = input.nextInt();
                setPosetionsOnBoard(p2, player.players[1]);
                board.viewBoard();
            }
        }
        input.close();
    }

    private void setPosetionsOnBoard(int place, String shape) {
        switch(place) {
            case 1:
            board.mainBoard[0][0] = shape;
            break;
            case 2:
            board.mainBoard[0][1] = shape;
            break;
            case 3:
            board.mainBoard[0][2] = shape;
            break;
            case 4:
            board.mainBoard[1][0] = shape;
            break;
            case 5:
            board.mainBoard[1][1] = shape;
            break;
            case 6:
            board.mainBoard[1][2] = shape;
            break;
            case 7:
            board.mainBoard[2][0] = shape;
            break;
            case 8:
            board.mainBoard[2][1] = shape;
            break;
            case 9:
            board.mainBoard[2][2] = shape;
            break;

        }
    }

    private void checkWinner() {
        
    }
}