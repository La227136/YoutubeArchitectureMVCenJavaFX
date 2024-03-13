package org.example.youtubearchitecturemvcenjavafx.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onsubmitButtonClick() {
        System.out.println("hello");
    }
}