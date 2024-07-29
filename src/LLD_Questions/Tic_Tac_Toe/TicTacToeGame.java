package LLD_Questions.Tic_Tac_Toe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private Deque<Player> players;
    private Board gameBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {
        // creating 2 Players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        // initialize Board
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        Scanner inputScanner = new Scanner(System.in);
        while (noWinner) {
            // take out the player whose turn it is and also put the player back in the list
            Player playerTurn = players.removeFirst();

            // get the free space from the board
            gameBoard.printBoard();
            List<Cell> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // read the user input
            System.out.print("Player: " + playerTurn.getName() + " Enter row,column: ");
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow, inputColumn;

            try {
                inputRow = Integer.parseInt(values[0].trim());
                inputColumn = Integer.parseInt(values[1].trim());
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input. Please enter valid row and column numbers.");
                players.addFirst(playerTurn);
                continue;
            }

            // check if the input is within the bounds of the board
            if (inputRow < 0 || inputRow >= gameBoard.getSize()
                    || inputColumn < 0 || inputColumn >= gameBoard.getSize()) {
                System.out.println("Invalid input. Row and column numbers must be between 0 and "
                        + (gameBoard.getSize() - 1));
                players.addFirst(playerTurn);
                continue;
            }

            // place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if (!pieceAddedSuccessfully) {
                // player cannot insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().getPieceType());

            if (winner) {
                inputScanner.close();
                return playerTurn.getName();
            }
        }

        inputScanner.close();
        return "tie";
    }


    public boolean isThereWinner(int row, int column, PieceTypeEnum pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean reverseDiagonalMatch = true;

        // check in row
        for (int i = 0; i < gameBoard.getSize(); i++) {
            if (gameBoard.getCells()[row][i].getPiece() == null
                    || gameBoard.getCells()[row][i].getPiece().getPieceType() != pieceType) {
                rowMatch = false;
            }
        }

        // check in column
        for (int i = 0; i < gameBoard.getSize(); i++) {
            if (gameBoard.getCells()[i][column].getPiece() == null
                    || gameBoard.getCells()[i][column].getPiece().getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

        // check diagonals
        for (int i = 0, j = 0; i < gameBoard.getSize(); i++, j++) {
            if (gameBoard.getCells()[i][j].getPiece() == null
                    || gameBoard.getCells()[i][j].getPiece().getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        // check reverse-diagonals
        for (int i = 0, j = gameBoard.getSize() - 1; i < gameBoard.getSize(); i++, j--) {
            if (gameBoard.getCells()[i][j].getPiece() == null
                    || gameBoard.getCells()[i][j].getPiece().getPieceType() != pieceType) {
                reverseDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || reverseDiagonalMatch;
    }
}
