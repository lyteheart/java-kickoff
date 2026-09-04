package tic_tac_toe;

public class Board {
    private char[][] boardArr;

    // constructor
    public Board(int size) {
        boardArr = new char[size][size];

        for (int i = 0; i < boardArr.length; i++) {
            for (int j = 0; j < boardArr[i].length; j++) {
                boardArr[i][j] = ' ';
            }
        }
    }

    private boolean checkLine(int startRow, int startCol, int rowDirection, int colDirection) {

        char first = boardArr[startRow][startCol];

        if (first == ' ') {
            return false;
        }

        for (int i = 1; i < boardArr.length; i++) {

            int row = startRow + i * rowDirection;
            int col = startCol + i * colDirection;

            if (boardArr[row][col] != first) {
                return false;
            }
        }

        return true;
    }

    // placeMove(...)
    public boolean placeMove(int placeOne, int placeTwo, char sign) {
        if (isCellAvailable(placeOne, placeTwo)) {
            boardArr[placeOne][placeTwo] = sign;
            return true;
        }

        return false;
    }

    // isCellAvailable(...)
    public boolean isCellAvailable(int placeOne, int placeTwo) {
        return boardArr[placeOne][placeTwo] == ' ';
    }


    // hasWinner(...)
    public boolean hasWinner() {

        // Check rows
        for (int row = 0; row < boardArr.length; row++) {
            if (checkLine(row, 0, 0, 1)) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < boardArr.length; col++) {
            if (checkLine(0, col, 1, 0)) {
                return true;
            }
        }

        // Check main diagonal ↘
        if (checkLine(0, 0, 1, 1)) {
            return true;
        }

        // Check opposite diagonal ↙
        if (checkLine(0, boardArr.length - 1, 1, -1)) {
            return true;
        }

        return false;
    }

    // isFull()
    public boolean isFull() {
        for (int i = 0; i < boardArr.length; i++) {
            for (int j = 0; j < boardArr[i].length; j++) {

                if (boardArr[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // display()
    public void display(){
        for(char[] row:boardArr){
            for (char val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
