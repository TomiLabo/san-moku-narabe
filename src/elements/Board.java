package elements;
import java.util.ArrayList;

import output.CLI;
import output.Outputter;
import types.Color;
import types.OrderType;

public class Board {

    public static final int SIZE = 3;
   
    private Piece[][] rawBoard;
    private Outputter outputter;
    
    public Board() {
        this.initializeBoard();
        this.outputter = new CLI();
    }

    public boolean tryPutPirce(int x, int y, Piece piece) {
        if (x < 0 || SIZE <= x) return false;
        if (y < 0 || SIZE <= y) return false;
        if (this.rawBoard[y][x].getColor() == Color.EMPTY) {
            this.rawBoard[y][x] = piece;
            return true;
        }
        return false;
    }
    
    public Piece[][] getBoard() {
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
