package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Fomes extends Application {
    @Override
    public void start(Stage primaryStage) {
        final Group root = new Group();
        primaryStage.setTitle("Parties Formes");

        Circle circle1 = new Circle();
        circle1.setCenterX(100.0f);
        circle1.setCenterY(100.0f);
        circle1.setFill(Color.RED);
        circle1.setRadius(50.0f);


        // TP 15
        Circle circle2 = new Circle();
        circle2.setCenterX(250.0f);
        circle2.setCenterY(100.0f);
        LinearGradient gradient = new LinearGradient(0, 50, 0, 150, false, CycleMethod.NO_CYCLE,
                new Stop(0, Color.CYAN),
                new Stop(1, Color.ROYALBLUE));
        circle2.setFill(gradient);
        circle2.setRadius(50.0f);

        Rectangle rectangle = new Rectangle(100, 200, 150, 100);

        root.getChildren().addAll(circle1, circle2, rectangle);


        primaryStage.setScene(new Scene(root, 650, 325));
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
