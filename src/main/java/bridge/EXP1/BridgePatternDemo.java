package bridge.EXP1;

public class BridgePatternDemo {

    //Use the Shape and DrawAPI classes to draw different colored circles.

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
