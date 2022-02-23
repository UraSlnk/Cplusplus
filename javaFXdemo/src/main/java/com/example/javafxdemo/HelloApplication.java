package com.example.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static String OS = System.getProperty("os.name").toLowerCase();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        MainController controller = fxmlLoader.getController();

        Scene scene = new Scene(fxmlLoader.load(), 767, 334);
        stage.setTitle("FlatPay v2.0j");
        stage.setScene(scene);
        stage.show();
    }

    public static boolean isWindows() {
        return (OS.contains("win"));
    }

    public static boolean isUnix() {
        return (OS.contains("nix")
                || OS.contains("nux")
                || OS.indexOf("aix") > 0);
    }

    public static void main(String[] args) {
        launch();
    }
}