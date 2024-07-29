package LLD_Questions.Tic_Tac_Toe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private Cell[][] cells;

    public void setSize(int size) {
        this.size = size;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Board(int size) {
        this.size = size;
        cells = new Cell[size][size];
        // Initialize cells with null values initially
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell(i, j, null);
            }
        }
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
        Cell cell = cells[row][column];
        if (cell.getPiece() != null) {
            return false;
        }
        cell.setPiece(playingPiece);
        return true;
    }

    public List<Cell> getFreeCells() {
        List<Cell> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cells[i][j].getPiece() == null) {
                    freeCells.add(cells[i][j]);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                PlayingPiece piece = cells[i][j].getPiece();
                if (piece != null) {
                    System.out.print(piece.getPieceType().name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }
}
