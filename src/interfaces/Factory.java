package interfaces;

public interface Factory<T, R> {
    public R create(T type);
}
