package sample;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        final Group root = new Group();
        primaryStage.setTitle("Première application JavaFx Partie Text & Police");
        // Partie police du tp 12 et 13
        String family = "Helvetica";
        double size = 50;

        TextFlow textFlow = new TextFlow();
        textFlow.setLayoutX(40);
        textFlow.setLayoutY(40);

        Text text1 = new Text("Hello ");
        text1.setFont(Font.font(family, size));
        text1.setFill(Color.RED);

        Text text2 = new Text("Bold");
        text2.setFill(Color.ORANGE);
        text2.setFont(Font.font(family, FontWeight.BOLD, size));

        Text text3 = new Text(" World");
        text3.setFill(Color.GREEN);
        text3.setFont(Font.font(family, FontPosture.ITALIC, size));

        textFlow.getChildren().addAll(text1, text2, text3);

        root.getChildren().add(textFlow);


        primaryStage.setScene(new Scene(root, 650, 275));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
