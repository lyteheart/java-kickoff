package othello;

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
        initializeBoard();
    }

    // Set up the four starting pieces
    private void initializeBoard() {

        int middle = boardArr.length / 2;

        boardArr[middle - 1][middle - 1] = 'O';
        boardArr[middle - 1][middle] = 'X';
        boardArr[middle][middle - 1] = 'X';
        boardArr[middle][middle] = 'O';
    }

    // display()
    public void display() {
        for (char[] row : boardArr) {
            for (char val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public boolean isValidMove(int row, int col, char mySign, char opponentSign) {

        // 1. The position must be empty
        if (boardArr[row][col] != ' ') {
            return false;
        }

        // 2. All 8 possible directions
        int[][] directions = {
                {-1, -1},  // ↖
                {-1, 0},  // ↑
                {-1, 1},  // ↗
                {0, -1},  // ←
                {0, 1},  // →
                {1, -1},  // ↙
                {1, 0},  // ↓
                {1, 1}   // ↘
        };

        // 3. Check every direction
        for (int[] direction : directions) {

            int rowDirection = direction[0];
            int colDirection = direction[1];

            if (checkDirection(
                    row,
                    col,
                    mySign,
                    opponentSign,
                    rowDirection,
                    colDirection)) {

                // At least one direction can capture
                return true;
            }
        }

        // No direction can capture
        return false;
    }

    private void flipPieces(
            int row,
            int col,
            char mySign,
            char opponentSign,
            int rowDirection,
            int colDirection) {

        // Start from the cell next to the newly placed piece
        int nextRow = row + rowDirection;
        int nextCol = col + colDirection;

        // Keep moving while we are inside the board
        while (nextRow >= 0 && nextRow < boardArr.length &&
                nextCol >= 0 && nextCol < boardArr.length) {

            char current = boardArr[nextRow][nextCol];

            // If we reach our own piece, we are done
            if (current == mySign) {
                break;
            }

            // If it's an opponent piece, flip it
            if (current == opponentSign) {
                boardArr[nextRow][nextCol] = mySign;
            }

            // Move to the next cell in the same direction
            nextRow += rowDirection;
            nextCol += colDirection;
        }
    }

    public boolean placeMove(
            int row,
            int col,
            char mySign,
            char opponentSign) {

        // First check whether the move is legal
        if (!isValidMove(row, col, mySign, opponentSign)) {
            return false;
        }

        // Place the player's piece
        boardArr[row][col] = mySign;

        // All 8 possible directions
        int[][] directions = {
                {-1, -1}, // ↖
                {-1,  0}, // ↑
                {-1,  1}, // ↗
                { 0, -1}, // ←
                { 0,  1}, // →
                { 1, -1}, // ↙
                { 1,  0}, // ↓
                { 1,  1}  // ↘
        };

        // Check every direction
        for (int[] direction : directions) {

            int rowDirection = direction[0];
            int colDirection = direction[1];

            // Only flip if this direction is a valid capture
            if (checkDirection(
                    row,
                    col,
                    mySign,
                    opponentSign,
                    rowDirection,
                    colDirection)) {

                flipPieces(
                        row,
                        col,
                        mySign,
                        opponentSign,
                        rowDirection,
                        colDirection
                );
            }
        }

        return true;
    }

    // Checks whether a move captures pieces in ONE direction
    private boolean checkDirection(
            int row,
            int col,
            char mySign,
            char opponentSign,
            int rowDirection,
            int colDirection) {

        // Start from the cell immediately next to the candidate cell
        int nextRow = row + rowDirection;
        int nextCol = col + colDirection;

        // We need to find at least one opponent piece first
        boolean foundOpponent = false;

        // Keep moving while we are inside the board
        while (nextRow >= 0 && nextRow < boardArr.length &&
                nextCol >= 0 && nextCol < boardArr.length) {

            // Get the current cell
            char current = boardArr[nextRow][nextCol];

            // Case 1: We found an opponent piece
            if (current == opponentSign) {

                // Remember that we found at least one opponent
                foundOpponent = true;

                // Move one more step in the same direction
                nextRow += rowDirection;
                nextCol += colDirection;
            }

            // Case 2: We found our own piece
            else if (current == mySign) {

                // This is valid ONLY if we already crossed
                // at least one opponent piece
                return foundOpponent;
            }

            // Case 3: Empty cell
            else {

                // Empty space means the opponent pieces
                // cannot be captured in this direction
                return false;
            }
        }

        // We reached the edge without finding our piece
        return false;
    }


}
