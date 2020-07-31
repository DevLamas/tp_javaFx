package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;

public class Grille extends Application {
    @Override
    public void start(Stage stage) {
        Text text1 = new Text("Login");
        Text text2 = new Text("Password");
        Text text3 = new Text("Suprise, I'm not here!");

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        Button button1 = new Button("Connexion");
        Button button2 = new Button("Annuler");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);

        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Partie edistance entre les composants
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //Alignement
        gridPane.setAlignment(Pos.CENTER);


        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(button1, 0, 2);
        gridPane.add(button2, 1, 2);

        gridPane.add(text3, 2, 1);


        Scene scene = new Scene(gridPane);
        stage.setTitle("Partie Layout GridPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }

}
