import elements.Board;
import elements.Computer;
import elements.IPlayer;
import types.OrderType;

/**
 * @author maxmellon
 */
public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        while (!game.isEnd()) game.next();
    }
    
    private Board board;
    private IPlayer player1;
    private IPlayer player2;
    private int turnCount = 0;
    
    public Game() {
        this.board = new Board();
        this.player1 = new Computer(OrderType.FIRST_MOVE);
        this.player2 = new Computer(OrderType.SECOND_MOVE);
    }
    
    private boolean isEnd() {
        final int FULL_PIECE_IN_BOARD = 9;
        if (turnCount == FULL_PIECE_IN_BOARD) {
            System.out.println("ゲーム終了です");
            this.board.showCurrentState();
            return true;
        }
        return false;
    }

    private void next() {
        final OrderType plan = OrderType.getOrderByCount(turnCount);
        this.board.showCurrentState();
        final IPlayer player = plan.isFirst() ? this.player1 : this.player2;
        while (true) {
            boolean result = false;
            result = player.putHand((pos, piece) -> this.board.tryPutPirce(pos, piece));
            if (!result) System.out.println("不正な入力です．");
            else if (result) break;
        }
        turnCount++;
    }
}

