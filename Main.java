// colors: https://colorhunt.co/palette/ffb3b3ffdba4ffe9aec1efff

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

            Scene scene = new Scene(root, 1500, 900);

            stage.setScene(scene);
            stage.setResizable(false);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}