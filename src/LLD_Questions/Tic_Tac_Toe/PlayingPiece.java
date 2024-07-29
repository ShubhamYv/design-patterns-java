package LLD_Questions.Tic_Tac_Toe;

public abstract class PlayingPiece {
    private PieceTypeEnum pieceType;

    protected PlayingPiece(PieceTypeEnum pieceType) {
        this.pieceType = pieceType;
    }

    public PieceTypeEnum getPieceType() {
        return pieceType;
    }
}
