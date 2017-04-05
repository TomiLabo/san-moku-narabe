package outputs;

import elements.Board;
import elements.Piece;
import java.util.ArrayList;

public class CLI extends Outputter {

    @Override
    public void showBoard(Board board) {
        Piece[][] rawBoard = board.getBoard();
        for (Piece[] line : rawBoard) {
            for (Piece piece : line) {
                System.out.print("[");
                this.showPiece(piece);
                System.out.print("]");
            }
            System.out.println("");
        }
    }

    @Override
    protected void showPiece(Piece piece) {
        switch (piece.getColor()) {
        case BLACK:
            System.out.print("x");
            break;
        case WHITE:
            System.out.print("o");
            break;
        case EMPTY:
            System.out.print(" ");
            break;
        }
    }
}
