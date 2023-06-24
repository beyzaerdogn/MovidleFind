module com.example.filmdeneme {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.filmdeneme to javafx.fxml;
    exports com.example.filmdeneme;
}