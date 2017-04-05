import java.math.BigInteger;

import elements.Board;
import elements.Piece;
import elements.Player;
import types.Color;
import types.OrderType;

/**
 * @author maxmellon
 */
public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        while (! game.isEnd()) {
            game.next();
        }
    }
    
    private Board board;
    private Player player1;
    private Player player2;
    private int turnCount = 0;
    
    public Game() {
        this.board = new Board();
        this.player1 = new Player(OrderType.FIRST_MOVE);
        this.player2 = new Player(OrderType.SECOND_MOVE);
    }
    
    private boolean isEnd() {
        // TODO: 勝敗判定
        return false;
    }

    private void next() {
        OrderType plan = turnCount % 2 == 0
                ? OrderType.FIRST_MOVE
                : OrderType.SECOND_MOVE;
        this.board.showCurrentState();
        boolean inputIsSuccess = true;
        while (inputIsSuccess) {
            boolean result = false;
            switch (plan) {
            case FIRST_MOVE:
                result = player1.putHand((pos, piece) -> (
                    this.board.tryPutPirce(pos.X(), pos.Y(), piece)
                ));
                break;
            case SECOND_MOVE:
                result = player2.putHand((pos, piece) -> (
                    this.board.tryPutPirce(pos.X(), pos.Y(), piece)
                ));
            default:
                // do nothing
            }
            inputIsSuccess = ! result;
            if (!inputIsSuccess) System.out.println("不正な入力です．");
        }
        turnCount++;
    }
}

