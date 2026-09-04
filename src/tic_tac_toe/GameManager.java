package tic_tac_toe;

import java.util.Scanner;

public class GameManager {
    private Scanner scanner;

    private Board board;
    private Player playerOne;
    private Player playerTwo;

    public GameManager() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.start();
    }

    private void setupPlayers() {

        System.out.print("Enter Player One name: ");
        String nameOne = scanner.nextLine();

        System.out.print("Enter Player One sign: ");
        char signOne = scanner.nextLine().charAt(0);

        playerOne = new Player(nameOne, signOne);


        System.out.print("Enter Player Two name: ");
        String nameTwo = scanner.nextLine();

        System.out.print("Enter Player Two sign: ");
        char signTwo = scanner.nextLine().charAt(0);

        playerTwo = new Player(nameTwo, signTwo);
    }

    private void playGame() {

        Player currentPlayer = playerOne;

        while (true) {

            System.out.println(currentPlayer.getName() + "'s turn ("
                    + currentPlayer.getSign() + ")");

            System.out.print("Enter row: ");
            int row = scanner.nextInt();

            System.out.print("Enter column: ");
            int col = scanner.nextInt();

            // Try to place the move
            if (!board.placeMove(row, col, currentPlayer.getSign())) {
                System.out.println("Cell already occupied. Try again.");
                continue;
            }

            // Show updated board
            board.display();

            // Check winner
            if (board.hasWinner()) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            // Check draw
            if (board.isFull()) {
                System.out.println("It's a draw!");
                break;
            }

            // Switch player
            if (currentPlayer == playerOne) {
                currentPlayer = playerTwo;
            } else {
                currentPlayer = playerOne;
            }
        }
    }

    public void start() {
        // Game starts here
        setupPlayers();
        board = new Board(3);

        playGame();
    }
}
