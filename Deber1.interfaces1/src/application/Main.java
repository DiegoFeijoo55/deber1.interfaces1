package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        MyLayout myLayout = new MyLayout();
        primaryStage.setTitle("Interfaz layout");
        primaryStage.setScene(new Scene(myLayout, 500, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
