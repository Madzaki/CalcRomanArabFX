package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label headCalc;

    @FXML
    private Label greetCalc;

    @FXML
    private Label headRulesCalc;

    @FXML
    private Label rulesCalc;

    @FXML
    private Label patternCalc;

    @FXML
    private TextField expCalc;

    @FXML
    private Button buttonCalc;

    @FXML
    private Label answerCalc;

    @FXML
    private Label mistakeCalc;

    @FXML
    private Label cCalc;

    @FXML
    void initialize() {
        /*Вызов события при нажатии на кнопку "Calculate!"*/
        buttonCalc.setOnAction(event -> {
            answerCalc.setText(MathClass.calcThis(expCalc.getText()));
        });
        /*Вызов события при нажатии на кнопку клавиатуры "Enter" в текстовом поле*/
        expCalc.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER))
                answerCalc.setText(MathClass.calcThis(expCalc.getText()));
        });
    }
}
