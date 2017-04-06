package inputs;

import java.util.concurrent.ThreadLocalRandom;
import elements.Board;
import types.Point;

public class AI extends Inputter {

    @Override
    public Point input() {
        int x = ThreadLocalRandom.current().nextInt(0, Board.SIZE + 1);
        int y = ThreadLocalRandom.current().nextInt(0, Board.SIZE + 1);
        // System.out.println("コンピューターが " + x + " " + y + " に置きました");
        return new Point(y, x);
    }

}
