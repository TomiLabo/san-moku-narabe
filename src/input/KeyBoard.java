package input;

import java.util.Scanner;
import types.Point;

public class KeyBoard extends Inputter {
    public Point input() {
        System.out.println("横軸座標を入力 (0から開始)");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
        System.out.println("縦軸座標を入力 (0から開始)");
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();
        return new Point(x, y);
    }
}
