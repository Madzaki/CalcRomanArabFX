package sample;

import javafx.scene.control.Alert;

public class AlertClass {
    public static void showAlert(String text) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning alert");
        alert.setHeaderText(null);
        alert.setContentText(text);
        alert.showAndWait();
    }
}
