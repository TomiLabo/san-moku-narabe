package elements;

import java.util.function.BiFunction;
import types.Point;

public interface IPlayer {
    /**
     * プレイヤーは手を決めコマを置く
     * @param {BiFunction<Point, Piece, Boolean>} boardが持っているコマを置くことを試みる関数
     * @return {boolean} 置くことに成功したかどうか
     */
    public boolean putHand(BiFunction<Point, Piece, Boolean> putMethod);
}
