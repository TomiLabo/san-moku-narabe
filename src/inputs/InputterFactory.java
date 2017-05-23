package inputs;

import java.util.NoSuchElementException;
import org.eclipse.jdt.annotation.NonNull;
import interfaces.Factory;
import types.InputType;

public class InputterFactory implements Factory<InputType, Inputter> {
    public @NonNull Inputter create(@NonNull InputType type) throws NoSuchElementException {
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
