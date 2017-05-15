import java.util.Scanner;

/**
 * Created by Alicja on 15-05-2017.
 */
public class MyTester {
    public static void main(String[] args) {
        MyPattern currentGame = new MyPattern();
        currentGame.startTable();

        Scanner myScanner = new Scanner(System.in);
        do {
            currentGame.showTable();
            int row;
            int column;
            do {
                System.out.println("Player " + currentGame.getUserChar() + " put row and column each time followed by pressing Enter");
                row = myScanner.nextInt() - 1;
                column = myScanner.nextInt() - 1;
            } while (!currentGame.placeChar(row, column));
            currentGame.changePlayer();
        } while (!(currentGame.checkIfUserWin()) && (!(currentGame.isTableFull())));

        if (currentGame.isTableFull() && (!(currentGame.checkIfUserWin()))) {
            System.out.println("A tie"); // gdy będzie remis
        } else {
            System.out.println("Take a look at current table configuration");
            currentGame.showTable();
            currentGame.changePlayer();
            System.out.println("Winner: " + currentGame.getUserChar());
        }
    }
}