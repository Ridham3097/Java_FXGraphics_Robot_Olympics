package AssignmentWeek3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
 *this class create body of robot
 * get random win percentage
 *@author : RIDHAM PATEL , 000831171
 */

public class Player {
    private double x;                  // x co-ordinate for body
    private double y;                  //y co-ordinate for body
    private double average = Math.random() * 100;   // get random number for player wining percentage
    private String title;           // title of team
    private Color color;            // color of body


   // create player class constructor
    public Player(double x, double y, Color color, String title) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.title = title;
    }

    //getter methode to return average of each player using
    public double getAverage() {
        return average;
    }


    // head method for drawing  body of referee
    public void head(GraphicsContext gc) {
        Head h1 = new Head(x, y);  // set x and y co-ordinate to head class
        Wheel w1 = new Wheel(x - 45, y + 50);  // set x and y co-ordinate to wheel class
        Wheel w2 = new Wheel(x + 75, y + 50);  // set x and y co-ordinate to wheel class


        h1.draw(gc);
        w1.draw(gc);
        w2.draw(gc);

        //  to print body color
        gc.setFill(color);
        gc.fillOval(x - 25, y + 50, 100, 100);

        // to print referee average and title
        gc.setFill(Color.BLACK);
        gc.fillText(String.format("%.2f", average), x + 17, y + 100);
        gc.fillText("Head " + title, 700, 450);
        gc.fillText(String.format("%.2f", average), 760, 450);
    }

    // draw method for drawing  body of player
    public void draw(GraphicsContext gc) {
        Head h1 = new Head(x, y);                // set x and y co-ordinate to head class
        Wheel w1 = new Wheel(x - 45, y + 50);  // set x and y co-ordinate to wheel class
        Wheel w2 = new Wheel(x + 75, y + 50);  // set x and y co-ordinate to wheel class

        h1.draw(gc);
        w1.draw(gc);
        w2.draw(gc);

        //  to print body color
        gc.setFill(color);
        gc.fillOval(x - 25, y + 50, 100, 100);

        // to print player's average
        gc.setFill(Color.BLACK);
        gc.fillText(String.format("%.2f", average), x + 17, y + 100);
    }
}
