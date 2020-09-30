package ru.VaolEr.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Controller {

    @FXML
    private VBox mainVBox;

    //region Menu Bar Items

    //region Menu Items
    @FXML
    private MenuItem menuItemConnect;
    @FXML
    private MenuItem menuItemDisconnect;
    @FXML
    private MenuItem menuItemOpen;
    @FXML
    private MenuItem menuItemClose;
    //endregion

    //region Help Items
    @FXML
    private MenuItem menuItemActivate;
    //endregion

    //endregion

    @FXML
    private Slider sliderKoefficient;
    @FXML
    private Label labelKoefficient;

    //region Lamps Labels insertion
    @FXML
    private Label labelLamp00;
    @FXML
    private Label labelLamp01;
    @FXML
    private Label labelLamp02;
    @FXML
    private Label labelLamp03;
    @FXML
    private Label labelLamp04;
    @FXML
    private Label labelLamp05;
    @FXML
    private Label labelLamp06;
    @FXML
    private Label labelLamp07;
    @FXML
    private Label labelLamp08;
    @FXML
    private Label labelLamp09;
    @FXML
    private Label labelLamp10;
    @FXML
    private Label labelLamp11;
    //endregion

    //region Lamps Current Labels insertion
    @FXML
    private Label labelLampCurrent00;
    @FXML
    private Label labelLampCurrent01;
    @FXML
    private Label labelLampCurrent02;
    @FXML
    private Label labelLampCurrent03;
    @FXML
    private Label labelLampCurrent04;
    @FXML
    private Label labelLampCurrent05;
    @FXML
    private Label labelLampCurrent06;
    @FXML
    private Label labelLampCurrent07;
    @FXML
    private Label labelLampCurrent08;
    @FXML
    private Label labelLampCurrent09;
    @FXML
    private Label labelLampCurrent10;
    @FXML
    private Label labelLampCurrent11;
    //endregion

    ArrayList<Label> lampsLabels = new ArrayList<>();
    private void getLampLabelsList(){
        lampsLabels.add(labelLamp00);
        lampsLabels.add(labelLamp01);
        lampsLabels.add(labelLamp02);
        lampsLabels.add(labelLamp03);
        lampsLabels.add(labelLamp04);
        lampsLabels.add(labelLamp05);
        lampsLabels.add(labelLamp06);
        lampsLabels.add(labelLamp07);
        lampsLabels.add(labelLamp08);
        lampsLabels.add(labelLamp09);
        lampsLabels.add(labelLamp10);
        lampsLabels.add(labelLamp11);
    }

    ArrayList<Label> lampsCurrentsLabels = new ArrayList<>();
    private void getLampsCurrentsLabelsList(){
        lampsCurrentsLabels.add(labelLampCurrent00);
        lampsCurrentsLabels.add(labelLampCurrent01);
        lampsCurrentsLabels.add(labelLampCurrent02);
        lampsCurrentsLabels.add(labelLampCurrent03);
        lampsCurrentsLabels.add(labelLampCurrent04);
        lampsCurrentsLabels.add(labelLampCurrent05);
        lampsCurrentsLabels.add(labelLampCurrent06);
        lampsCurrentsLabels.add(labelLampCurrent07);
        lampsCurrentsLabels.add(labelLampCurrent08);
        lampsCurrentsLabels.add(labelLampCurrent09);
        lampsCurrentsLabels.add(labelLampCurrent10);
        lampsCurrentsLabels.add(labelLampCurrent11);
    }

    Map<Label,Integer> lampsCurrents = new LinkedHashMap<>();
    private void getLampCurrents(){
        for (int i = 0; i < lampsCurrentsLabels.size(); i++) {
            int lampCurrentPercentValue = (int) lampsSliders.get(i).getValue();
            lampCurrentPercentValue = lampCurrentPercentValue + (int)(lampCurrentPercentValue * (sliderKoefficient.getValue() / 100));
            if(lampCurrentPercentValue > 100){
                lampCurrentPercentValue = 100;
            }
            lampsCurrents.put(lampsCurrentsLabels.get(i),lampCurrentPercentValue);
            lampsCurrentsLabels.get(i).setText(String.valueOf(lampsCurrents.get(lampsCurrentsLabels.get(i))));
        }
    }


    //region Lamps Sliders insertion
    @FXML
    private Slider sliderLamp00;
    @FXML
    private Slider sliderLamp01;
    @FXML
    private Slider sliderLamp02;
    @FXML
    private Slider sliderLamp03;
    @FXML
    private Slider sliderLamp04;
    @FXML
    private Slider sliderLamp05;
    @FXML
    private Slider sliderLamp06;
    @FXML
    private Slider sliderLamp07;
    @FXML
    private Slider sliderLamp08;
    @FXML
    private Slider sliderLamp09;
    @FXML
    private Slider sliderLamp10;
    @FXML
    private Slider sliderLamp11;
    //endregion

    ArrayList<Slider> lampsSliders = new ArrayList<>();
    private void getLampsSlidersList(){
        lampsSliders.add(sliderLamp00);
        lampsSliders.add(sliderLamp01);
        lampsSliders.add(sliderLamp02);
        lampsSliders.add(sliderLamp03);
        lampsSliders.add(sliderLamp04);
        lampsSliders.add(sliderLamp05);
        lampsSliders.add(sliderLamp06);
        lampsSliders.add(sliderLamp07);
        lampsSliders.add(sliderLamp08);
        lampsSliders.add(sliderLamp09);
        lampsSliders.add(sliderLamp10);
        lampsSliders.add(sliderLamp11);
    }

    @FXML
    private Button buttonSendToUSB;

    public void initialize() {
        getLampsSlidersList();
        getLampLabelsList();
        getLampsCurrentsLabelsList();
        addListenersToLampsSliders();
        //getSliderValues();
        getLampCurrents();
    }

    //region Menu Items callbacks
    @FXML
    private void menuItemConnectClick(ActionEvent event) {
        //TO DO connect to USB device function
    }

    @FXML
    private void menuItemDisconnectClick(ActionEvent event) {
        //TO DO disconnect from USB device function
    }

    @FXML
    private void menuItemOpenClick(ActionEvent event) {
        //TO DO open configuration file dialogue
    }

    @FXML
    private void menuItemSaveClick(ActionEvent event) {
        //TO DO save configuration to file
    }
    //endregion

    private void getSliderValues(){
        for (int i = 0; i < lampsSliders.size(); i++) {
            int value =(int) lampsSliders.get(i).getValue();
            lampsLabels.get(i).setText(String.valueOf(value));
        }
    }

    private void addListenersToLampsSliders(){
        for (int i = 0; i < lampsSliders.size(); i++) {
            int finalI = i;
            lampsSliders.get(i).valueProperty().addListener((changed, oldValue, newValue) -> {
                //lampsLabels.get(finalI).setText(String.valueOf(newValue.intValue()));
                getLampCurrents();
            });
        }
        sliderKoefficient.valueProperty().addListener((changed, oldValue, newValue) -> {
            labelKoefficient.setText(String.valueOf(newValue.intValue()));
            getLampCurrents();
        });
    }

    @FXML
    private void sliderDragDetected(MouseEvent event){
        try {

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private void buttonClick(ActionEvent event) {

        //labelLamp0.setText("Height: " + String.valueOf(mainVBox.getHeight()) + " ; Width: " + String.valueOf(mainVBox.getWidth()) + " Slider:" + String.valueOf(sliderLamp00.getValue()));
        buttonSendToUSB.setText("You've clicked!");
    }

}

