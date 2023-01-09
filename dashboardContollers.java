import java.io.IOException;
import java.net.URL;
import java.sql.*;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class dashboardContollers implements Initializable {
    @FXML
    private AnchorPane dashboard;
    
    @FXML
    private Label accounting_number_summary;

    @FXML
    private Label admin_number_summary;

    @FXML
    private Label destinationNumber;

    @FXML
    private Label drivers_number_summary;

    @FXML
    private Button exitButton;

    @FXML
    private Label guide_number_summary;

    @FXML
    private Label incomes;

    @FXML
    private Label logistics_number_summary;

    @FXML
    private Button newReservationButton;

    @FXML
    private Button offerButton;

    @FXML
    private Label outcomes;

    @FXML
    private Label profit;

    @FXML
    private Label reservationNumber;

    @FXML
    private Button settingsButton;

    @FXML
    private Button signoutButton;

    @FXML
    private Button tripButton;

    @FXML
    private Label usernameLabel;

    @FXML
    private Button workerButton;

    @FXML
    private AnchorPane workers_summary;
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

    public void tripButtonPressed(ActionEvent e){
        tripButton.getScene().getWindow().hide();
        System.out.println("to trip");
    }

    public void workerButtonPressed(ActionEvent e){
        workerButton.getScene().getWindow().hide();
        System.out.println("to worker");
    }

    public void offerButtonPressed(ActionEvent e){
        offerButton.getScene().getWindow().hide();
        System.out.println("to offer");
    }

    public void reservationButtonPressed(ActionEvent e){
        newReservationButton.getScene().getWindow().hide();
        System.out.println("to trip");
    }

    public void settingsButtonPressed(ActionEvent e){
        settingsButton.getScene().getWindow().hide();
        System.out.println("to settings");
    }

    private void initDashboardData(Connection conn) throws SQLException {
        conn = connectDB.getConnection();
        Statement stmt = conn.createStatement();
        String query = "SELECT SUM(wrk_salary) FROM worker";
        ResultSet result = stmt.executeQuery(query);
        float costs = 0;
        while (result.next()) {
            costs = result.getFloat("SUM(wrk_salary)");
            outcomes.setText(Float.toString(costs));
        }

        query = "SELECT SUM(res_off_depoit) FROM reservation_offers";
        result = stmt.executeQuery(query);
        float incomesVariable = 0;
        while (result.next()) {
            incomesVariable = result.getFloat("SUM(res_off_depoit)");
        }
        query = "SELECT SUM(tr_cost) FROM trip JOIN reservation ON trip.tr_id = reservation.res_tr_id";
        result = stmt.executeQuery(query);
        while (result.next()) {
            incomesVariable += result.getFloat("SUM(tr_cost)");
        }
        incomes.setText(Float.toString(incomesVariable));

        float profitVariable = incomesVariable - costs;
        profit.setText(Float.toString(profitVariable));
        if (profitVariable < 0) {
            profit.setStyle("-fx-text-fill: red;");
        } else {
            profit.setStyle("-fx-text-fill: green;");
        }

        query = "SELECT COUNT(*) FROM driver";
        result = stmt.executeQuery(query);
        while (result.next()) {
            drivers_number_summary.setText(Integer.toString(result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM guide";
        result = stmt.executeQuery(query);
        while (result.next()) {
            guide_number_summary.setText(Integer.toString(result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM admin WHERE adm_type = 'LOGISTICS'";
        result = stmt.executeQuery(query);
        while (result.next()) {
            logistics_number_summary.setText(Integer.toString(result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM admin WHERE adm_type = 'ADMINISTRATIVE'";
        result = stmt.executeQuery(query);
        while (result.next()) {
            admin_number_summary.setText(Integer.toString(result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM admin WHERE adm_type = 'ACCOUNTING'";
        result = stmt.executeQuery(query);
        while (result.next()) {
            admin_number_summary.setText(Integer.toString(result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM reservation";
        int reserv = 0;
        result = stmt.executeQuery(query);
        while (result.next()) {
            reserv = result.getInt("COUNT(*)");
        }
        query = "SELECT COUNT(*) FROM reservation_offers";
        result = stmt.executeQuery(query);
        while (result.next()) {
            reserv += result.getInt("COUNT(*)");
        }
        reservationNumber.setText(Integer.toString(reserv));

        query = "SELECT COUNT(DISTINCT dst_name) FROM destination WHERE dst_location IS NOT NULL";
        result = stmt.executeQuery(query);
        while (result.next()) {
            destinationNumber.setText(Integer.toString(result.getInt("COUNT(DISTINCT dst_name)")));
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usernameLabel.setText(userInformation.getLastname());

        try (Connection conn = connectDB.getConnection()) {
            initDashboardData(conn);
        } catch (SQLException e) {
            System.err.println(e.getSQLState());
        }

    }
}
