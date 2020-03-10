package cn.alphahub.chessFlyWeight;

/**
 * 享元类
 */
public interface ChessFlyWeight {
    void Color(String color);

    String getColor();

    void display(Coordinate coordinate);
}

class ConcreateChess implements ChessFlyWeight {
    private String color;

    public ConcreateChess(String color) {
        super();
        this.color = color;
    }

    public ConcreateChess() {

    }

    @Override
    public void Color(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色: " + color);
        System.out.println("棋子坐标: " + coordinate.getX() + "---------" + coordinate.getY());
    }
}
