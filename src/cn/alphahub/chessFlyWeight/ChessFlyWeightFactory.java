package cn.alphahub.chessFlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class ChessFlyWeightFactory {
    private static Map<String, ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight chess = new ConcreateChess();
            map.put(color, chess);
            return chess;
        }
    }

}
