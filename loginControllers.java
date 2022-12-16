import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginControllers implements Initializable{
    @FXML
    private Button cancelBtn;

    @FXML
    private TextField emailTF;

    @FXML
    private Button exitBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private Label notificationLabel;

    public void exitButtonClicked(ActionEvent e){
        System.exit(0);
    }

    public void connectButtonClicked(ActionEvent event){
        String email = emailTF.getText();
        Pattern pattern = Pattern.compile("^[a-z1-9._]{3,}@[a-z1-9._]+.[a-z1-9._]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        if(email.isEmpty()){
            notificationLabel.setText("Το πεδίο είναι υποχρεωτικό!");
            notificationLabel.setVisible(true);
        }
        else if(matcher.find()) {
            notificationLabel.setText("Success: " + email);
            notificationLabel.setVisible(true);
        }
        else {
            notificationLabel.setText("Λάθος μορφή email. Ξαναπροσπαθείστε!");
            notificationLabel.setVisible(true);
        }
    }

    public void cancelButtonClicked(ActionEvent event){
        notificationLabel.setVisible(false);
        emailTF.clear();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        notificationLabel.setVisible(false);
    }

}