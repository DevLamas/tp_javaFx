package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Picture extends Application {
    @Override
    public void start(Stage stage) {
        /*
        //TP IMAGE
        Image image = new Image("https://image.freepik.com/free-photo/wood-texture-plank-background_1372-642.jpg");
        ImageView imageView = new ImageView(image);


        imageView.setX(50.0);
        imageView.setY(50.0);
        imageView.setEffect(new DropShadow(20, Color.GREY));

        Pane root = new Pane();
        root.getChildren().setAll(imageView);

        Scene scene = new Scene(root, 750, 500);
        stage.setTitle("Partie Layout Image et bordure");

        stage.setScene(scene);
        stage.show();

         */

        /**/
        //TP BIS
        Rectangle rectangle = new Rectangle(100, 200, 150, 100);
        //Bordures
        rectangle.setArcWidth(30.0);
        rectangle.setArcHeight(30.0);

        ImagePattern pattern = new ImagePattern(
            new Image("https://image.freepik.com/free-photo/wood-texture-plank-background_1372-642.jpg", 280, 180, false, false) // Resizing
        );

        rectangle.setFill(pattern);
        rectangle.setEffect(new DropShadow(20, Color.BLACK));
        Pane root = new Pane();
        root.getChildren().setAll(rectangle);

        Scene scene = new Scene(root, 750, 500);
        stage.setTitle("Partie Layout Image et bordure");

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String args[]){
        launch(args);
    }
}
