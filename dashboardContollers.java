import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class dashboardContollers implements Initializable {
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
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Επιβεβαίωση εξόδου");
        alert.setHeaderText("Επιβεβαίωση");
        alert.setContentText("Είστε σίγουροι ότι θέλετε να τερματίσετε την εφαρμογή;");

        ButtonType buttonTypeOK = new ButtonType("Έξοδος", ButtonData.OK_DONE);
        ButtonType buttonTypeCancel = new ButtonType("Ακύρωση", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeCancel, buttonTypeOK);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOK)
            System.exit(0);
    }

    public void logout(ActionEvent e) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Επιβεβαίωση εξόδου");
        alert.setHeaderText("Επιβεβαίωση");
        alert.setContentText("Είστε σίγουροι ότι θέλετε να αποσυνδεθείτε;");

        ButtonType buttonTypeOK = new ButtonType("Αποσύνδεση", ButtonData.OK_DONE);
        ButtonType buttonTypeCancel = new ButtonType("Ακύρωση", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeCancel, buttonTypeOK);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonTypeOK)
            try {
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
            } catch (IOException h) {
                h.printStackTrace();
            }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usernameLabel.setText(userInformation.getLastname());

    }
}
