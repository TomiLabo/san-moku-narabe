package inputs;

import java.util.Scanner;
import types.Point;
import org.eclipse.jdt.annotation.NonNull;

public class KeyBoard extends Inputter {
    private static Scanner sc;

    public KeyBoard() {
         sc = new Scanner(System.in);
    }

    public @NonNull Point input() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new Point(y, x);
    }
}
