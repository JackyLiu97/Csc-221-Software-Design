
package com.company;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Canvas canvas = new Canvas(900,700);
        Scene scene = new Scene(root,900, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        MyShape shape1 = new MyShape(900, 700, Color.BLUE);
        shape1.draw(gc);
        MyCircle circle1 = new MyCircle(450, 340, 330, Color.GREEN);
        circle1.draw(gc);
        MyPolygon polygon1 = new MyPolygon(5,310,450,330, Color.RED);
        polygon1.draw(gc);
        MyCircle circle2 = new MyCircle(450, 355, 220, Color.yellow);
        circle2.draw(gc);
        MyPolygon polygon2 = new MyPolygon(5,200,450,360, Color.lightGray);
        polygon2.draw(gc);
        MyLine line1 = new MyLine(0,899,0,700, Color.CYAN);
        line1.draw(gc);
        MyLine line2 = new MyLine(0,899, 700,0,  Color.CYAN);
        line2.draw(gc);

        root.getChildren().add(canvas);
        primaryStage.setTitle("Assignment 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
