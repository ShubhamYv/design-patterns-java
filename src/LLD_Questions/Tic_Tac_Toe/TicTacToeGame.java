package LLD_Questions.Tic_Tac_Toe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

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
            System.out.print("Player: " + playerTurn.name + " Enter row,column: ");
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0].trim());
            int inputColumn = Integer.parseInt(values[1].trim());

            // place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                // player cannot insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if (winner) {
                inputScanner.close();
                return playerTurn.name;
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
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // check in column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        // check diagonals
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // check anti-diagonals
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                reverseDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || reverseDiagonalMatch;
    }
}
