package p6;

/*
 * Created by emailman on 3/10/2016.
 */

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Demo6 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(5);
        pane.setVgap(5);

        // Create text fields
        TextField tfFirstName = new TextField();
        TextField tfMI = new TextField();
        TextField tfLastName = new TextField();

        // Put stuff in the grid
        pane.addRow(0, new Label("First Name: "), tfFirstName);
        pane.addRow(1, new Label("MI: "), tfMI);
        pane.addRow(2, new Label("Last Name: "), tfLastName);

        Button btSubmit = new Button("Submit Name");
        pane.add(btSubmit, 0, 3);
        pane.setColumnSpan(btSubmit, 2);
        GridPane.setHalignment(btSubmit, HPos.CENTER);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Grid Pane");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
