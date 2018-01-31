package com.munis.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Created by MN883H on 1/31/2018.
 */
public class FirstFXApplication extends Application {

    public void start(Stage stage){
        Label label = new Label("Hello World");
        label.setFont(new Font(50));

        Scene scene = new Scene(label);
        stage.setScene(scene);
        stage.setTitle("Hello");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
