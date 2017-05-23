package elements;

import java.util.function.BiFunction;
import org.eclipse.jdt.annotation.NonNull;

import functions.PlayOneHand;
import inputs.Inputter;
import inputs.InputterFactory;
import types.InputType;
import types.OrderType;
import types.Point;

public class Computer implements IPlayer {
    private @NonNull OrderType order;
    private @NonNull Inputter inputter;

    public Computer(OrderType order) {
        this.order = order;
        this.inputter = new InputterFactory().create(InputType.AI);
    }
    
    @Override
    public boolean putHand(@NonNull PlayOneHand<Point, Piece, Boolean> playHand) {
        Point point = inputter.input();
        return playHand.apply(point, new Piece(this.order));
    }

}
