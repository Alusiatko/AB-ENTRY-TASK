/**
 * Created by Alicja on 15-05-2017.
 */
public class Checker {

    /*boolean checkVertical(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            if (checkRowsColumnsDiagonal(gameTable[0][i], gameTable[1][i], gameTable[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    boolean checkHorizontal(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            if (checkRowsColumnsDiagonal(gameTable[i][0], gameTable[i][1], gameTable[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    boolean checkDiagonal(char[][] gameTable) { // sprawdza skosy
        if (checkRowsColumnsDiagonal(gameTable[0][0], gameTable[1][1], gameTable[2][2]) == true) {
            return true;
        } else if (checkRowsColumnsDiagonal(gameTable[0][2], gameTable[1][1], gameTable[2][0])) {
            return true;
        }
        return false;
    }

    public boolean checkIfUserWin() {
        return checkVertical() || checkHorizontal() || checkDiagonal();
    }

    private boolean checkRowsColumnsDiagonal(char a, char b, char c) {
        return ((a != '?') && (a == b) && (b == c));
    }*/
}
