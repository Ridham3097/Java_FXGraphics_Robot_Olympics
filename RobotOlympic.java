package AssignmentWeek3;


import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 * this class create objects and put values for x and y co-ordinate
 * @author RDHAM PATEL,000831171
 */
public class RobotOlympic extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(900, 680); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // YOUR CODE STARTS HERE

        // create three team by creating object for each team and enter value in constructor for each object
        Team mi = new Team(125, 50, "MI", Color.BLUE);
        Team csk = new Team(125, 270, "CSK", Color.YELLOW);
        Team rcb = new Team(125, 470, "RCB", Color.RED);


        //get random num to create referee
        Random f = new Random();
        int b = f.nextInt(3);

        // use if-else if statement to put proper value for referee
        if (b == 1) {
            Player ref = new Player(725, 270, Color.BLUE, "MI");
            ref.head(gc);

        } else if (b == 2) {
            Player ref = new Player(725, 270, Color.YELLOW, "CSK");
            ref.head(gc);
        } else {
            Player ref = new Player(725, 270, Color.RED, "RCB");
            ref.head(gc);
        }

        // call draw methods using objects for drawing robots
        mi.draw(gc);
        csk.draw(gc);
        rcb.draw(gc);

        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
