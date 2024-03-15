module org.example.youtubearchitecturemvcenjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;


    exports org.example.youtubearchitecturemvcenjavafx.Controllers;
    opens org.example.youtubearchitecturemvcenjavafx.Controllers to javafx.fxml;
    exports org.example.youtubearchitecturemvcenjavafx.views;
    opens org.example.youtubearchitecturemvcenjavafx.views to javafx.fxml;
}