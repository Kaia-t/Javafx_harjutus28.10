package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();

        StackPane stack = new StackPane();
        Pane pane = new Pane();
        Scene stseen = new Scene(stack, 400, 300);
        stseen.setFill(Color.BEIGE);
        primaryStage.setScene(stseen);

        Circle ring = new Circle(100);
        ring.setCenterX(50);
        ring.setCenterY(200);
        ring.setFill(Color.ROYALBLUE);
        stack.getChildren().add(ring);

        ring.setOnMouseClicked(event -> {
            ring.setScaleX(300);
            ring.setRotate(400);
            ring.setFill(Color.BLUE);
            ring.setRadius(50);
            System.out.println("klikk!");
        });


    }


    public static void main(String[] args) {
        launch(args);
    }
}
