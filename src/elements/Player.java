package elements;

import java.util.function.BiFunction;
import inputs.Inputter;
import inputs.InputterFactory;
import types.InputType;
import types.OrderType;
import types.Point;

public class Player implements IPlayer {
    private OrderType order;
    private Inputter inputter;

    public Player(OrderType order) {
        this.order = order;
        this.inputter = InputterFactory.create(InputType.KeyBoard);
    }

    public OrderType getOrder() {
        return this.order;
    }

    @Override
    public boolean putHand(BiFunction<Point, Piece, Boolean> putMethod) {
        Point point = inputter.input();
        return putMethod.apply(point, new Piece(this.order));
    }
}
