package TicTacToe;

public class Board {
    String mainBoard[][] = {
                { "1", "2", "3" },
                { "4", "5", "6" },
                { "7", "8", "9" },
        };

    public void viewBoard() {
        for (String[] s : mainBoard) {
            System.out.println("---------------");
            for (String c : s) {

                System.out.print("| " + c + " |");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }
}
