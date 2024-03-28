package com.example.jfxdemo;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//
//        BorderPane bp = new BorderPane();
//        bp.setCenter(vb);
//
//        Scene scene = new Scene(bp, 350, 230,
//                Color.LIGHTYELLOW);
//        stage.setTitle("MyShapes with JavaFX");
//        stage.setScene(scene);
//        stage.show();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class
                .getResource("student-container.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    static VBox getStudent(Student s) {
        VBox student = new VBox();
        student.getChildren().add(new Text("Name : " + s.name));
        student.getChildren().add(new Text("ID : " + s.id));
        student.setBackground(new Background(
                new BackgroundFill(Color.HONEYDEW, null,
                        null)));
        student.setPadding(new Insets(10));
        student.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.DOTTED,
                null, null)));
        student.setStyle("-fx-margin-bottom: 10px;");
        return student;
    }
}

class Student {
    public String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
