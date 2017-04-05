package output;
import elements.Board;
import elements.Piece;

public abstract class Outputter {
    public abstract void showBoard(Board board);
    protected abstract void showPiece(Piece piece);
}
