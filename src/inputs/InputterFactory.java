package inputs;

import java.util.NoSuchElementException;

import types.InputType;

public class InputterFactory {
    public static Inputter create(InputType type) {
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
