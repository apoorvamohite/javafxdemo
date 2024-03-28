package com.example.jfxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private TextField searchBar;

    @FXML
    private VBox cardsContainer;

    private List<Student> students;

    @FXML
    protected void handleInput() {
        System.out.println("You typed: " + searchBar.getCharacters());
        String input = searchBar.getCharacters().toString();
        var filtered = students.stream().filter(s -> s.name.contains(input))
                .toList();
        cardsContainer.getChildren().clear();
        for(Student s: filtered) {
            cardsContainer.getChildren().add(HelloApplication.getStudent(s));
        }
    }

    @FXML
    private void initialize() {
        students = new ArrayList<>();
        students.add(new Student("Apoorva", 123));
        students.add(new Student("Apoorva2", 323));
        students.add(new Student("XYZ", 323));

        for(Student s: students) {
            cardsContainer.getChildren().add(HelloApplication.getStudent(s));
        }
    }
}