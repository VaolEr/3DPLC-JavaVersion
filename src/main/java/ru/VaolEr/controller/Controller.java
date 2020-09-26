package ru.VaolEr.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private VBox mainVBox;
    @FXML
    private Button buttonSendToUSB;
    @FXML
    private Label label_size;

    @FXML
    private Slider Slider_L1;
    @FXML
    private Slider Slider_L0;

    @FXML
    private void buttonClick(ActionEvent event) {

        label_size.setText("Height: " + String.valueOf(mainVBox.getHeight()) + " ; Width: " + String.valueOf(mainVBox.getWidth()) + " Slider:" + String.valueOf(Slider_L1.getValue()));
        buttonSendToUSB.setText("You've clicked!");
    }

    @FXML
    private void sliderDragDetected(MouseEvent event){
        label_size.setText("Height: " + String.valueOf(mainVBox.getHeight()) + " ; Width: " + String.valueOf(mainVBox.getWidth()) + " Slider:" + String.valueOf(Slider_L0.getValue()));
    }
}
