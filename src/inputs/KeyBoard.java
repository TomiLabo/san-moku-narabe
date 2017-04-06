package inputs;

import java.util.Scanner;
import types.Point;

public class KeyBoard extends Inputter {
    private static Scanner sc;

    public KeyBoard() {
         sc = new Scanner(System.in);
    }

    public Point input() {
        // System.out.println("横軸座標を入力 (0から開始)");
        int x = sc.nextInt();
        // System.out.println("縦軸座標を入力 (0から開始)");
        int y = sc.nextInt();
        return new Point(y, x);
    }
}
