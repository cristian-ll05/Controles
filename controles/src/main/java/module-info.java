module controles.picker {
    requires javafx.controls;
    requires javafx.fxml;

    opens controles.picker to javafx.fxml;
    exports controles.picker;
}
