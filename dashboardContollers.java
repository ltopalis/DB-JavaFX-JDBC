import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.lang.model.util.ElementScanner14;
import javax.swing.Action;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class dashboardContollers implements Initializable {
    @FXML
    private Label accounting_number_summary;

    @FXML
    private Button addBottonTrip;

    @FXML
    private Label admin_number_summary;

    @FXML
    private ComboBox<String> branchListTrip;

    @FXML
    private TableColumn<Trip, String> branchTableTrip;

    @FXML
    private Button clearBottonTrip;

    @FXML
    private TextField costTextTrips;

    @FXML
    private Pane dashboard;

    @FXML
    private Button dashbordButton;

    @FXML
    private DatePicker departureDateTrips;

    @FXML
    private TableColumn<Trip, String> departureTableTrips;

    @FXML
    private Label destinationNumber;

    @FXML
    private ComboBox<String> driverListTrips;

    @FXML
    private TableColumn<Trip, String> driverTableTrips;

    @FXML
    private Label drivers_number_summary;

    @FXML
    private Button exitButton;

    @FXML
    private ComboBox<String> guideListTrips;

    @FXML
    private TableColumn<Trip, String> guideTableTrip;

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
    private TableColumn<Trip, Float> priceTableTrips;

    @FXML
    private Label profit;

    @FXML
    private Label reservationNumber;

    @FXML
    private DatePicker returnDateTrip;

    @FXML
    private TableColumn<Trip, String> returnTableTrips;

    @FXML
    private Button searchBottonTrip;

    @FXML
    private TextField seatTextTrip;

    @FXML
    private TableColumn<Trip, Integer> seatsTableTrips;

    @FXML
    private Button settingsButton;

    @FXML
    private Button signoutButton;

    @FXML
    private AnchorPane travelMenu;

    @FXML
    private Button tripButton;

    @FXML
    private ComboBox<String> tripidListTrips;

    @FXML
    private TableColumn<Trip, Integer> tripidTableTrips;

    @FXML
    private Label usernameLabel;

    @FXML
    private Button workerButton;

    @FXML
    private AnchorPane workers_summary;

    @FXML
    private TableView<Trip> tableTrip;
    private double x, y;

    public void dashboardBottonClicked(ActionEvent e) {
        dashboard.setVisible(true);
        travelMenu.setVisible(false);
    }

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

    public void tripButtonPressed(ActionEvent e) {
        try (Connection conn = connectDB.getConnection()) {
            initTripIdTrips(conn);
            initGuidetrips(conn);
            initDrivertrips(conn);
            initBranchtrips(conn);
            dashboard.setVisible(false);
            travelMenu.setVisible(true);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void workerButtonPressed(ActionEvent e) {
        workerButton.getScene().getWindow().hide();
        System.out.println("to worker");
    }

    public void offerButtonPressed(ActionEvent e) {
        offerButton.getScene().getWindow().hide();
        System.out.println("to offer");
    }

    public void reservationButtonPressed(ActionEvent e) {
        newReservationButton.getScene().getWindow().hide();
        System.out.println("to trip");
    }

    public void settingsButtonPressed(ActionEvent e) {
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
            outcomes.setText(String.format(Locale.GERMAN, "%,.2f", costs));
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
        incomes.setText(String.format(Locale.GERMAN, "%,.2f", incomesVariable));

        float profitVariable = incomesVariable - costs;
        profit.setText(String.format(Locale.GERMAN, "%,.2f", profitVariable));
        if (profitVariable < 0) {
            profit.setStyle("-fx-text-fill: red;");
        } else {
            profit.setStyle("-fx-text-fill: green;");
        }

        query = "SELECT COUNT(*) FROM driver";
        result = stmt.executeQuery(query);
        while (result.next()) {

            drivers_number_summary.setText(String.format(Locale.GERMAN, "%,d", result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM guide";
        result = stmt.executeQuery(query);
        while (result.next()) {
            guide_number_summary.setText(String.format(Locale.GERMAN, "%,d", result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM admin WHERE adm_type = 'LOGISTICS'";
        result = stmt.executeQuery(query);
        while (result.next()) {
            logistics_number_summary.setText(String.format(Locale.GERMAN, "%,d", result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM admin WHERE adm_type = 'ADMINISTRATIVE'";
        result = stmt.executeQuery(query);
        while (result.next()) {
            admin_number_summary.setText(String.format(Locale.GERMAN, "%,d", result.getInt("COUNT(*)")));
        }

        query = "SELECT COUNT(*) FROM admin WHERE adm_type = 'ACCOUNTING'";
        result = stmt.executeQuery(query);
        while (result.next()) {
            admin_number_summary.setText(String.format(Locale.GERMAN, "%,d", result.getInt("COUNT(*)")));
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
        reservationNumber.setText(String.format(Locale.GERMAN, "%,d", reserv));

        query = "SELECT COUNT(DISTINCT dst_name) FROM destination WHERE dst_location IS NOT NULL";
        result = stmt.executeQuery(query);
        while (result.next()) {
            destinationNumber.setText(String.format(Locale.GERMAN, "%,d", result.getInt("COUNT(DISTINCT dst_name)")));
        }

    }

    private void initTripIdTrips(Connection conn) throws SQLException {
        tripidListTrips.getItems().clear();
        String query = "SELECT tr_id FROM trip ORDER BY tr_id";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        while (result.next()) {
            tripidListTrips.getItems().add(Integer.toString(result.getInt("tr_id")));
        }
    }

    private void initGuidetrips(Connection conn) throws SQLException {
        guideListTrips.getItems().clear();
        String query = "SELECT DISTINCT CONCAT(wrk_name, ' ', wrk_lname) AS name " +
                "FROM guide g JOIN worker w " +
                "ON g.gui_AT = w.wrk_AT " +
                "ORDER BY CONCAT(wrk_name, ' ', wrk_lname);";

        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        while (result.next()) {
            guideListTrips.getItems().add(result.getString("name"));
        }
    }

    private void initDrivertrips(Connection conn) throws SQLException {
        driverListTrips.getItems().clear();
        String query = "SELECT DISTINCT CONCAT(wrk_name, ' ', wrk_lname) AS name " +
                "FROM driver d JOIN worker w " +
                "ON d.drv_AT = w.wrk_AT " +
                "ORDER BY CONCAT(wrk_name, ' ', wrk_lname)";

        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        while (result.next()) {
            driverListTrips.getItems().add(result.getString("name"));
        }
    }

    private void initBranchtrips(Connection conn) throws SQLException {
        branchListTrip.getItems().clear();
        String query = "SELECT CONCAT(br_city, ', ', br_street,' ', IF(br_num IS NULL, '-', br_num)) AS address FROM branch ORDER BY address;";

        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        while (result.next()) {
            branchListTrip.getItems().add(result.getString("address"));
        }
    }

    public void searchTrip(ActionEvent e) {
        try (Connection conn = connectDB.getConnection()) {
            tableTrip.getItems().clear();
            String tripid = tripidListTrips.getValue();
            LocalDate departure = departureDateTrips.getValue();
            LocalDate ret = returnDateTrip.getValue();
            String cost = costTextTrips.getText();
            String seats = seatTextTrip.getText();
            String branch = branchListTrip.getValue();
            String guide = guideListTrips.getValue();
            String driver = driverListTrips.getValue();

            String query = "SELECT gui_AT FROM guide g JOIN worker w ON g.gui_AT = w.wrk_AT WHERE CONCAT(wrk_name, ' ', wrk_lname) = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, guide);
            ResultSet result = stmt.executeQuery();
            String guiAT = null;
            while (result.next()) {
                guiAT = result.getString("gui_AT");
            }

            query = "SELECT drv_AT FROM driver d JOIN worker w ON d.drv_AT = w.wrk_AT WHERE CONCAT(wrk_name, ' ', wrk_lname) = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, driver);
            result = stmt.executeQuery();
            String drvAT = null;
            while (result.next()) {
                drvAT = result.getString("drv_AT");
            }

            query = "SELECT br_code FROM branch WHERE CONCAT(br_city, ', ', br_street,' ', IF(br_num IS NULL, '-', br_num)) LIKE ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, branch);
            result = stmt.executeQuery();
            String branch_code = null;
            while (result.next()) {
                branch_code = result.getString("br_code");
            }

            ArrayList<String> listOfWhereClause = new ArrayList<>();
            if (tripid != null)
                listOfWhereClause.add("tr_id=" + tripid);
            if (!costTextTrips.getText().isEmpty())
                listOfWhereClause.add("tr_cost=" + cost);
            if (!seatTextTrip.getText().isEmpty())
                listOfWhereClause.add("tr_maxseats=" + seats);
            if(branch_code != null)
                listOfWhereClause.add("tr_branch_code="+branch_code);
            if(guiAT != null)
                listOfWhereClause.add("tr_gui_AT="  + guiAT);
            if(drvAT != null)
                listOfWhereClause.add("tr_drv_AT=" + drvAT);
            if(departure != null && ret != null)
                listOfWhereClause.add("tr_departure = " + departure + " tr_return = " + ret);
            else if(departure != null)
                listOfWhereClause.add("tr_departure = " + departure);
            else if(ret != null)
                listOfWhereClause.add("tr_return = " + ret);

            String whereClause = String.join(" AND ", listOfWhereClause);

            query = "SELECT t.tr_id, t.tr_departure, t.tr_return, t.tr_maxseats, t.tr_cost, " +
                "CONCAT(b.br_city, ', ', b.br_street, ' ', b.br_num) AS address,"+
                " CONCAT(w.wrk_name, ' ', w.wrk_lname) AS guide, " + 
                "CONCAT(w1.wrk_name, ' ', w1.wrk_lname) AS driver " + 
            "FROM trip t JOIN branch b ON t.tr_br_code = b.br_code" +
                " JOIN worker w ON t.tr_gui_AT = w.wrk_AT " + 
                "JOIN worker w1 ON t.tr_drv_AT = w1.wrk_AT";

            if(!whereClause.isEmpty())
                query +=  " WHERE " + whereClause;
            
            result = stmt.executeQuery(query);

            tripidTableTrips.setCellValueFactory(new PropertyValueFactory<>("trip_id"));
            departureTableTrips.setCellValueFactory(new PropertyValueFactory<>("departure"));
            returnTableTrips.setCellValueFactory(new PropertyValueFactory<>("return_"));
            priceTableTrips.setCellValueFactory(new PropertyValueFactory<>("cost"));
            seatsTableTrips.setCellValueFactory(new PropertyValueFactory<>("seats"));
            branchTableTrip.setCellValueFactory(new PropertyValueFactory<>("branch"));
            guideTableTrip.setCellValueFactory(new PropertyValueFactory<>("guide"));
            driverTableTrips.setCellValueFactory(new PropertyValueFactory<>("driver"));
            

            while(result.next()){
                int trip_id_temp = result.getInt("t.tr_id");
                String departure_temp = result.getString("t.tr_departure");
                String return__temp = result.getString("t.tr_return");
                float cost_temp = result.getFloat("t.tr_cost");
                int seats_temp = result.getInt("t.tr_maxseats");
                String branch_temp = result.getString("address");
                String guide_temp = result.getString("guide");
                String driver_temp = result.getString("driver"); 
                
                tableTrip.getItems().add(new Trip(trip_id_temp, departure_temp, return__temp, cost_temp, seats_temp, branch_temp, guide_temp, driver_temp));
            }
            
            

        } catch (SQLException ex) {
            ex.getSQLState();
        }
    }

    public void addTrip(ActionEvent e) {
        try (Connection conn = connectDB.getConnection()) {
            java.sql.Timestamp departure = java.sql.Timestamp.from(
                    departureDateTrips.getValue().atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());
            java.sql.Timestamp ret = java.sql.Timestamp.from(
                    returnDateTrip.getValue().atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());
            String cost = costTextTrips.getText();
            String seats = seatTextTrip.getText();
            String branch = branchListTrip.getValue();
            String guide = guideListTrips.getValue();
            String driver = driverListTrips.getValue();
            String query = "SELECT gui_AT FROM guide g JOIN worker w ON g.gui_AT = w.wrk_AT WHERE CONCAT(wrk_name, ' ', wrk_lname) = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, guide);
            ResultSet result = stmt.executeQuery();
            String guiAT = null;
            while (result.next()) {
                guiAT = result.getString("gui_AT");
            }

            query = "SELECT drv_AT FROM driver d JOIN worker w ON d.drv_AT = w.wrk_AT WHERE CONCAT(wrk_name, ' ', wrk_lname) = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, driver);
            result = stmt.executeQuery();
            String drvAT = null;
            while (result.next()) {
                drvAT = result.getString("drv_AT");
            }

            query = "SELECT br_code FROM branch WHERE CONCAT(br_city, ', ', br_street,' ', IF(br_num IS NULL, '-', br_num)) LIKE ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, branch);
            result = stmt.executeQuery();
            String branch_code = null;
            while (result.next()) {
                branch_code = result.getString("br_code");
            }

            query = "INSERT INTO trip VALUES(NULL, ?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setTimestamp(1, departure);
            stmt.setTimestamp(2, ret);
            stmt.setInt(3, Integer.parseInt(seats));
            stmt.setFloat(4, Float.parseFloat(cost));
            stmt.setString(5, branch_code);
            stmt.setString(6, guiAT);
            stmt.setString(7, drvAT);
            stmt.executeUpdate();

            initBranchtrips(conn);
            initDrivertrips(conn);
            initGuidetrips(conn);
            initTripIdTrips(conn);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Επιτυχής εισαγωγή ταξιδιου!");
            alert.setTitle("Επιβεβαίωση Εισαγωγής ταξιδιού");
            alert.setHeaderText("Επιτυχία");
            alert.showAndWait();

        } catch (SQLException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText(ex.toString());
            alert.setHeaderText("Σφάλμα " + ex.getErrorCode());
            alert.setTitle("Σφάλμα");
            alert.showAndWait();
        } catch (NullPointerException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText("Η ημερομηνία είναι υποχρεωτική");
            alert.setTitle("Σφάλμα");
            alert.setHeaderText("Σφάλμα");
            alert.showAndWait();
        } catch (Exception ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setContentText(ex.toString());
            alert.setTitle("Σφάλμα");
            alert.setHeaderText("Σφάλμα");
            alert.showAndWait();
        }

    }

    public void clearBottonTrips(ActionEvent e) {
        tripidListTrips.setValue(null);
        guideListTrips.setValue(null);
        driverListTrips.setValue(null);
        branchListTrip.setValue(null);
        departureDateTrips.getEditor().clear();
        returnDateTrip.getEditor().clear();
        costTextTrips.clear();
        seatTextTrip.clear();
        tableTrip.getItems().clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usernameLabel.setText(userInformation.getLastname());
        dashboard.setVisible(true);
        travelMenu.setVisible(false);

        try (Connection conn = connectDB.getConnection()) {
            initDashboardData(conn);
        } catch (SQLException e) {
            System.err.println(e.getSQLState());
        }

    }
}
