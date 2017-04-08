package inputs;

import java.util.NoSuchElementException;
import org.eclipse.jdt.annotation.NonNull;

import types.InputType;

public class InputterFactory {
    public static @NonNull Inputter create(@NonNull InputType type) throws NoSuchElementException {
        switch (type) {
        case KeyBoard:
            return new KeyBoard();
        case AI:
            return new AI();
        default:
            throw new NoSuchElementException(
                "期待しない `InputType` が渡されました : " + type
            );
        }
    }
}
