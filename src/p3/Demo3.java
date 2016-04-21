package p3;

/*
 * Created by emailman on 3/10/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Demo3 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(100, 150, 50);
        // circle.setCenterX(100);
        // circle.setCenterY(150);
        // circle.setRadius(50);
        circle.setStroke(Color.RED);
        circle.setFill(Color.BLUE);

        Pane pane = new Pane();
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Fixed Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
