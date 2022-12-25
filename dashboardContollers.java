import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class dashboardContollers implements Initializable{
    @FXML
    private Button exitButton;

    @FXML
    private Button offerButton;

    @FXML
    private Button signoutButton;

    @FXML
    private Button tripButton;

    @FXML
    private Label usernameLabel;

    @FXML
    private Button workerButton;
    private double x, y;

    public void exitButtonClicked(ActionEvent e) {
        System.exit(0);
    }

    public void logout(ActionEvent e){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("fxml code/login.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            root.setOnMousePressed((MouseEvent h) -> {
                x = h.getSceneX();
                y = h.getSceneY();
            });

            root.setOnMouseDragged((MouseEvent h) -> {
                stage.setX(h.getScreenX() - x);
                stage.setY(h.getSceneY() - y);

                stage.setOpacity(.8);
            });

            root.setOnMouseReleased((MouseEvent h) -> {
                stage.setOpacity(1);
            });

            stage.initStyle(StageStyle.TRANSPARENT);

            stage.setScene(scene);
            signoutButton.getScene().getWindow().hide();
            stage.show();
        }catch(IOException h){
            h.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usernameLabel.setText(userInformation.getLastname());
        
    }
}
