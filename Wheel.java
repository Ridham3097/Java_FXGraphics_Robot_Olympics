package AssignmentWeek3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
 *this class create wheel of robots
 *@author : RIDHAM PATEL , 000831171
 */
public class Wheel {
    private double x;    // x co-ordinate for wheel
    private double y;      // y co-ordinate for wheel
    private final int HEI= 100;   // height of wheel
    private final int WEI = 20;   // width of wheel


    // create constructor of Wheel class
    public Wheel(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // to draw player's wheel
    public void draw(GraphicsContext gc) {
        gc.fillOval(x, y, WEI, HEI);
        gc.setFill(Color.BLACK);
    }
}
