package ru.VaolEr;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("3DPLC");
       // primaryStage.getIcons().add(new Image("file:resources/icos/Vexels-Office-Bulb.ico"));
        primaryStage.setScene(new Scene(root, root.prefWidth(-1), root.prefHeight(-1)));
        primaryStage.setMinWidth(root.minWidth(-1));
        primaryStage.setMinHeight(root.minHeight(-1));
        primaryStage.setMaxHeight(root.maxHeight(-1));
        primaryStage.setMaxWidth(root.maxWidth(-1));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
