package types;

public enum OrderType {
    FIRST_MOVE(true),
    SECOND_MOVE(false),
    EXCEPTION(false);
    
    private final boolean first;

    private OrderType(final boolean first) {
        this.first = first;
    }

    public boolean isFirst() {
        return this.first;
    }

    public static OrderType getOrderByCount(int count) {
        return count % 2 == 0 ? FIRST_MOVE : SECOND_MOVE;
    }
}
