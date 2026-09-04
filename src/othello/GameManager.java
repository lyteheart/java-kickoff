package othello;

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

        System.out.print("Enter Player One sign (X/O): ");
        char signOne = scanner.nextLine().charAt(0);

        playerOne = new Player(nameOne, signOne);

        System.out.print("Enter Player Two name: ");
        String nameTwo = scanner.nextLine();

        System.out.print("Enter Player Two sign (X/O): ");
        char signTwo = scanner.nextLine().charAt(0);

        playerTwo = new Player(nameTwo, signTwo);
    }

    public void start() {

        setupPlayers();

        board = new Board(8);

        board.display();

        playGame();
    }

    private void playGame() {

        Player currentPlayer = playerOne;

        while (true) {

            System.out.println(
                    currentPlayer.getName()
                            + "'s turn ("
                            + currentPlayer.getSign()
                            + ")"
            );

            System.out.print("Enter row: ");
            int row = scanner.nextInt();

            System.out.print("Enter column: ");
            int col = scanner.nextInt();

            char mySign = currentPlayer.getSign();

            char opponentSign =
                    currentPlayer == playerOne
                            ? playerTwo.getSign()
                            : playerOne.getSign();

            if (board.placeMove(
                    row,
                    col,
                    mySign,
                    opponentSign)) {

                board.display();

                // Switch player
                currentPlayer =
                        currentPlayer == playerOne
                                ? playerTwo
                                : playerOne;

            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }
}