import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class loginControlers implements Initializable{
    @FXML
    private Button cancelBtn;

    @FXML
    private TextField emailTF;

    @FXML
    private Button exitBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private Button minimizeBtn;

    @FXML
    private Label notificationLabel;

    public void exitButtonClicked(ActionEvent e){
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }

}