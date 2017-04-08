package elements;

import org.eclipse.jdt.annotation.NonNull;
import outputs.CLI;
import outputs.Outputter;
import types.Color;
import types.Point;

public class Board {

    public static final int SIZE = 3;
    private @NonNull Piece[][] rawBoard;
    private @NonNull Outputter outputter;

    public Board() {
        this.initializeBoard();
        this.outputter = new CLI();
    }

    public boolean tryPutPirce(@NonNull final Point point, @NonNull final Piece piece) {
        int x = point.X();
        int y = point.Y();
        if (x < 0 || SIZE <= x) return false;
        if (y < 0 || SIZE <= y) return false;
        if (this.rawBoard[y][x].getColor() == Color.EMPTY) {
            this.rawBoard[y][x] = piece;
            return true;
        }
        return false;
    }

    public @NonNull Piece[][] getBoard() {
        return this.rawBoard;
    }

    public void showCurrentState() {
        outputter.showBoard(this);
    }

    private void initializeBoard() {
        this.rawBoard = new Piece[SIZE][SIZE];
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                Piece empty = new Piece();
                rawBoard[y][x] = empty;
            }
        }
    }
}
