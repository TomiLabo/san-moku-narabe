package elements;

import java.util.function.BiFunction;

import inputs.Inputter;
import inputs.KeyBoard;
import types.OrderType;
import types.Point;

public class Player {
    private OrderType order;
    private Inputter inputter;

    public Player(OrderType order) {
        this.order = order;
        this.inputter = new KeyBoard();
    }

    public OrderType getOrder() {
        return this.order;
    }

    public boolean putHand(BiFunction<Point, Piece, Boolean> putMethod) {
        Point point = inputter.input();
        boolean result = putMethod.apply(point, new Piece(this.order));
        return result;
    }
}
