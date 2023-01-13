module com.jug {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jug to javafx.fxml;
    exports com.jug;
}
