package AssignmentWeek3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
 *this class create head of robots
 *@author : RIDHAM PATEL , 000831171
 */
public class Head {
    private double x;  // x co-ordinate for head
    private double y;  // y co-ordinate for head

    private final double SIZE = 50;   // to make circle

    // create constructor of Head class
    public Head(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // to draw head of players
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillOval(x, y, SIZE, SIZE);  // same height and width to draw circle
    }
}
