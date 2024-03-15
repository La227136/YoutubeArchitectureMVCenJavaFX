package org.example.youtubearchitecturemvcenjavafx.Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import org.example.youtubearchitecturemvcenjavafx.views.HelloController;

import java.io.IOException;

public class HelloApplication extends Application {

    private Stage currentStage;

    @Override
    public void start(Stage primaryStage) {
        currentStage = primaryStage;
        try {
            FXMLLoader loader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
            Parent root = loader.load();
            HelloController controller = loader.getController();
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("La fenêtre n'a pu être chargée");
            alert.setHeaderText("Un fichier nécessaire à la vue n'a pu être trouvé.");
            alert.setContentText("C'est une erreur interne. Veuillez contacter l'équipe de développement.");
            alert.showAndWait();
        }
    }

    public static void main(String[] args) { launch(args); }


}