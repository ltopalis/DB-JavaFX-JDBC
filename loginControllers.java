import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginControllers implements Initializable {
    @FXML
    private Button cancelBtn;

    @FXML
    private TextField usernameTF;

    @FXML
    private TextField passwordTF;

    @FXML
    private Button exitBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private Label notificationLabel;

    public void exitButtonClicked(ActionEvent e) {
        System.exit(0);
    }

    public void connectButtonClicked(ActionEvent event) {
        String username = usernameTF.getText();
        String password = passwordTF.getText();
        String result = connectDB.getAccess(username, password);
        if (result != null) {
            notificationLabel.setText(result);
            notificationLabel.setVisible(true);
        } else {
            notificationLabel.setText("Ο χρήστης δεν υπάρχει, δεν έχει πρόσβαση ή τα στοιχεία είναι λάθος!");
            notificationLabel.setVisible(true);
        }
    }

    public void cancelButtonClicked(ActionEvent event) {
        notificationLabel.setVisible(false);
        usernameTF.clear();
        passwordTF.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        notificationLabel.setVisible(false);

    }

}