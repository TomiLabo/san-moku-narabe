package elements;

import java.util.function.BiFunction;
import org.eclipse.jdt.annotation.NonNull;

import functions.PlayOneHand;
import types.Point;

public interface IPlayer {
    /**
     * プレイヤーは手を決めコマを置く
     * @param {BiFunction<Point, Piece, Boolean>} boardが持っているコマを置くことを試みる関数
     * @return {boolean} 置くことに成功したかどうか
     */
    public boolean putHand(@NonNull PlayOneHand<Point, Piece, Boolean> playHabd);
}
