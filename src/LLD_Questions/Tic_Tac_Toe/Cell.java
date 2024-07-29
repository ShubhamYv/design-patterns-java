package LLD_Questions.Tic_Tac_Toe;

public class Cell {
    private int row;
    private int column;
    private PlayingPiece piece;

    public Cell(int row, int column, PlayingPiece piece) {
        this.row = row;
        this.column = column;
        this.piece = piece;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public PlayingPiece getPiece() {
        return piece;
    }

    public void setPiece(PlayingPiece piece) {
        this.piece = piece;
    }
}
