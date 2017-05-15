/**
 * Created by Alicja on 15-05-2017.
 */
public class MyPattern {

    private char[][] gameTable;    // pol prywatne metody publiczne
    private char userChar; // tu beda X i O

    public MyPattern() {
        gameTable = new char[3][3];
        userChar = 'x';  // potem bedzie 'o'
        startTable();
    }

    public char getUserChar() {
        return userChar;
    }

    public void changePlayer() {
        if (userChar == 'x') {
            userChar = 'o';
        } else {
            userChar = 'x';
        }
    }

    public boolean placeChar(int row, int column) {
        if ((row >= 0) && (row < 3)) {
            if ((column >= 0) && (column < 3)) {
                if (gameTable[row][column] == '?') {
                    gameTable[row][column] = userChar;
                    return true;
                }
            }
        }
        return false;
    }

    //zainicjalizowac tabele
    void startTable() {
        // leci po rzedach
        for (int i = 0; i < 3; i++) {
            //leci po tabelach
            for (int j = 0; j < 3; j++) {
                gameTable[i][j] = '?';
            }
        }
    }

    // sprawdzic czy jest pusta
    boolean isTableFull() {
        boolean isFull = true; // ustawiam ze tabela jest zapelniona (testowo wstawione "?")
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable[i][j] == '?') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    // wydrukowac tabele
    void showTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gameTable[i][j] + " ");
            }
            System.out.println(); // przejscie do nowego wiersza
        }
    }

    //do przeniesienia potem do CHEKERA
    boolean checkVertical() {
        for (int i = 0; i < 3; i++) {
            if (checkRowsColumnsDiagonal(gameTable[0][i], gameTable[1][i], gameTable[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    boolean checkHorizontal() {
        for (int i = 0; i < 3; i++) {
            if (checkRowsColumnsDiagonal(gameTable[i][0], gameTable[i][1], gameTable[i][2]) == true) {
                return true;
            }
        }
        return false;
    }

    boolean checkDiagonal() { // sprawdza skosy
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
    }
}