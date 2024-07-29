package LLD_Questions.Tic_Tac_Toe;

public class Cell {
    public int row;
    public int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }
}
