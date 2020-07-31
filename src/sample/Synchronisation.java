package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.beans.binding.*;
import javafx.beans.property.*;

public class Synchronisation extends Application {
    @Override
    public void start(Stage stage) {
        Text text1 = new Text("Valeur 1 :");
        Text text2 = new Text("Valeur 2 :");

        TextField valeur1 = new TextField();
        TextField valeur2 = new TextField();
        Button button1 = new Button("Synchroniser");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Partie edistance entre les composants
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //Alignement
        gridPane.setAlignment(Pos.CENTER);


        gridPane.add(text1, 0, 0);
        gridPane.add(valeur1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(valeur2, 1, 1);
        gridPane.add(button1, 0, 2);

        Scene scene = new Scene(gridPane);
        stage.setTitle("Partie Synchonisation");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String args[]){
        launch(args);

    }
}
