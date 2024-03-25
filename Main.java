package Projet_Java;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ma fenêtre basique JavaFX");

        StackPane root = new StackPane();
        root.getChildren().add(new Text("Bonjour, monde !"));

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println("Hugo - Eliot");
    }
}
