package AssignmentWeek3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/*
 *this class set name and set team average
 *calculate team average
 *@author : RIDHAM PATEL , 000831171
 */

public class Team {
    private double x;    // x co-ordinate for body
    private double y;    //y co-ordinate for body
    private String name;   // name of team
    private Color color;    // color of team


    // constructor of Team class to get value from main class
    public Team(double x, double y, String name, Color color) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
    }

    // draw method for set name and team average of robots
    public void draw(GraphicsContext gc) {

        //create three player by creating three objects
        Player ply1 = new Player(x, y, color, name);
        Player ply2 = new Player(x + 200, y, color, name);
        Player ply3 = new Player(x + 400, y, color, name);

        // calculate team average
        double teamAvg = (ply1.getAverage() + ply2.getAverage() + ply3.getAverage()) / 3;

        //to print name and team average
        gc.fillText(name, x - 30, y + 170);
        gc.fillText("Average of team :", x, y + 170);
        gc.fillText(String.format("%.2f", teamAvg), x + 100, y + 170);

        // draw player body using draw methods
        ply1.draw(gc);
        ply2.draw(gc);
        ply3.draw(gc);

    }

}
