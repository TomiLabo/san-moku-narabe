package elements;

import java.util.NoSuchElementException;

import org.eclipse.jdt.annotation.NonNull;
import types.Color;
import types.OrderType;

public class Piece {

    private @NonNull OrderType order;
    private @NonNull Color color;

    public Piece(OrderType order) {
        this.order = order;
        this.setColor();
    }

    public Piece() {
        this.color = Color.EMPTY;
        this.order = OrderType.EXCEPTION;
    }

    public Color getColor() {
        return this.color;
    }

    private void setColor() throws NoSuchElementException {
        switch (this.order) {
        case FIRST_MOVE:
            this.color = Color.BLACK;
            break;
        case SECOND_MOVE:
            this.color = Color.WHITE;
            break;
        default:
            throw new NoSuchElementException(
                "期待しない `OrderType` が渡されました : " + this.order
            );
        }
    }
}