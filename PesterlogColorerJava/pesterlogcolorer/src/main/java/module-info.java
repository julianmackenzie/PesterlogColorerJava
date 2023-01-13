module pesterlogcolorer {
    requires javafx.controls;
    requires javafx.fxml;

    opens pesterlogcolorer to javafx.fxml;
    exports pesterlogcolorer;
}
