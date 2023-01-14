import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
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
    private Button addBottonDest;

    @FXML
    private Button addBottonEvents;

    @FXML
    private Button addBottonTrip;

    @FXML
    private Label admin_number_summary;

    @FXML
    private DatePicker arrivalPickerDest;

    @FXML
    private TableColumn<Destination, String> arrivalTableDest;

    @FXML
    private ComboBox<String> branchListTrip;

    @FXML
    private TableColumn<Trip, String> branchTableTrip;

    @FXML
    private Button clearBottonDest;

    @FXML
    private Button clearBottonEvents;

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
    private DatePicker departurePickerDest;

    @FXML
    private DatePicker departurePickerEvents;

    @FXML
    private TableColumn<Destination, String> departureTableDest;

    @FXML
    private TableColumn<Event, String> departureTableEvents;

    @FXML
    private TableColumn<Trip, String> departureTableTrips;

    @FXML
    private TableColumn<Destination, String> descriptionTableDest;

    @FXML
    private TableColumn<Event, String> descriptionTableEvents;

    @FXML
    private TextArea descriptionTextDest;

    @FXML
    private TextArea descriptionTextEvents;

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
    private ComboBox<String> languageListDest;

    @FXML
    private TableColumn<Destination, String> languageTableDest;

    @FXML
    private ComboBox<String> locationListDest;

    @FXML
    private TableColumn<Destination, String> locationTableDest;

    @FXML
    private Label logistics_number_summary;

    @FXML
    private TextField nameFieldDest;

    @FXML
    private TableColumn<Destination, String> nameTableDest;

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
    private DatePicker returnPickerEvents;

    @FXML
    private TableColumn<Event, String> returnTableEvents;

    @FXML
    private TableColumn<Trip, String> returnTableTrips;

    @FXML
    private Button searchBottonDest;

    @FXML
    private Button searchBottonEvents;

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
    private TableView<Destination> tableDest;

    @FXML
    private TableView<Event> tableEvents;

    @FXML
    private TableView<Trip> tableTrip;

    @FXML
    private AnchorPane travelMenu;

    @FXML
    private Button tripButton;

    @FXML
    private TableColumn<Event, Integer> tripIdTableEvents;

    @FXML
    private ComboBox<String> tripidListDest;

    @FXML
    private ComboBox<String> tripidListEvents;

    @FXML
    private ComboBox<String> tripidListTrips;

    @FXML
    private TableColumn<Destination, Integer> tripidTableDest;

    @FXML
    private TableColumn<Trip, Integer> tripidTableTrips;

    @FXML
    private ComboBox<String> typeListDest;

    @FXML
    private TableColumn<Destination, String> typeTableDest;

    @FXML
    private Label usernameLabel;

    @FXML
    private Button workerButton;

    @FXML
    private AnchorPane workers_summary;

    @FXML
    private Tab eventTabTrip;

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
            initTripIdEvents(conn);
            initTypeDestination(conn);
            initLocationDestination(conn);
            initLanguageDestination(conn);
            initTripIdDestination(conn);
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

    /* TRIP TAB */

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
            if (branch_code != null)
                listOfWhereClause.add("tr_br_code='" + branch_code + "'");
            if (guiAT != null)
                listOfWhereClause.add("tr_gui_AT='" + guiAT + "'");
            if (drvAT != null)
                listOfWhereClause.add("tr_drv_AT='" + drvAT + "'");
            if (departure != null && ret != null)
                listOfWhereClause.add("tr_departure BETWEEN '" + departure + " 00:00:00' " + " AND '" + departure
                        + " 23:59:59' AND tr_return BETWEEN " + ret + " 00:00:00' AND '" + ret + " 23:59:59'");
            else if (departure != null)
                listOfWhereClause
                        .add("tr_departure BETWEEN '" + departure + " 00:00:00' AND '" + departure + " 23:59:59'");
            else if (ret != null)
                listOfWhereClause.add("tr_return BETWEEN '" + ret + " 00:00:00'" + " AND  '" + ret + " 23:59:59'");

            String whereClause = String.join(" AND ", listOfWhereClause);

            query = "SELECT t.tr_id, t.tr_departure, t.tr_return, t.tr_maxseats, t.tr_cost, " +
                    "CONCAT(b.br_city, ', ', b.br_street, ' ', b.br_num) AS address," +
                    " CONCAT(w.wrk_name, ' ', w.wrk_lname) AS guide, " +
                    "CONCAT(w1.wrk_name, ' ', w1.wrk_lname) AS driver " +
                    "FROM trip t JOIN branch b ON t.tr_br_code = b.br_code" +
                    " JOIN worker w ON t.tr_gui_AT = w.wrk_AT " +
                    "JOIN worker w1 ON t.tr_drv_AT = w1.wrk_AT";

            if (!whereClause.isEmpty())
                query += " WHERE " + whereClause;

            result = stmt.executeQuery(query);

            tripidTableTrips.setCellValueFactory(new PropertyValueFactory<Trip, Integer>("trip_id"));
            departureTableTrips.setCellValueFactory(new PropertyValueFactory<Trip, String>("departure"));
            returnTableTrips.setCellValueFactory(new PropertyValueFactory<Trip, String>("return_"));
            priceTableTrips.setCellValueFactory(new PropertyValueFactory<Trip, Float>("cost"));
            seatsTableTrips.setCellValueFactory(new PropertyValueFactory<Trip, Integer>("seats"));
            branchTableTrip.setCellValueFactory(new PropertyValueFactory<Trip, String>("branch"));
            guideTableTrip.setCellValueFactory(new PropertyValueFactory<Trip, String>("guide"));
            driverTableTrips.setCellValueFactory(new PropertyValueFactory<Trip, String>("driver"));

            while (result.next()) {
                int trip_id_temp = result.getInt("t.tr_id");
                String departure_temp = result.getString("t.tr_departure");
                String return__temp = result.getString("t.tr_return");
                float cost_temp = result.getFloat("t.tr_cost");
                int seats_temp = result.getInt("t.tr_maxseats");
                String branch_temp = result.getString("address");
                String guide_temp = result.getString("guide");
                String driver_temp = result.getString("driver");

                tableTrip.getItems().add(new Trip(trip_id_temp, departure_temp, return__temp, cost_temp, seats_temp,
                        branch_temp, guide_temp, driver_temp));
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
        departureDateTrips.setValue(null);
        returnDateTrip.setValue(null);
        costTextTrips.clear();
        seatTextTrip.clear();
        tableTrip.getItems().clear();
    }

    /* EVENTS TAB */

    private void initTripIdEvents(Connection conn) throws SQLException {
        tripidListEvents.getItems().clear();
        String query = "SELECT DISTINCT ev_tr_id FROM event ORDER BY ev_tr_id";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);
        while (result.next()) {
            tripidListEvents.getItems().add(Integer.toString(result.getInt("ev_tr_id")));
        }
    }

    public void searchEvents(ActionEvent e) {
        tableEvents.getItems().clear();
        try (Connection conn = connectDB.getConnection()) {
            String tripId = tripidListEvents.getValue();
            LocalDate departure = departurePickerEvents.getValue();
            LocalDate ret = returnPickerEvents.getValue();
            String description = descriptionTextEvents.getText();

            ArrayList<String> listWhereClause = new ArrayList<>();
            if (tripId != null)
                listWhereClause.add("ev_tr_id = " + tripId);
            if (departure != null && ret != null)
                listWhereClause.add("ev_start BETWEEN '" + departure + " 00:00:00' " + " AND '" + departure
                        + " 23:59:59' AND ev_end BETWEEN " + ret + " 00:00:00' AND '" + ret + " 23:59:59'");
            else if (departure != null)
                listWhereClause
                        .add("ev_start BETWEEN '" + departure + " 00:00:00' AND '" + departure + " 23:59:59'");
            else if (ret != null)
                listWhereClause.add("ev_end BETWEEN '" + ret + " 00:00:00'" + " AND  '" + ret + " 23:59:59'");
            if (!descriptionTextDest.getText().isEmpty())
                listWhereClause.add("ev_descr = '" + description + "'");

            String whereClause = String.join(" AND ", listWhereClause);

            String query = "SELECT * FROM event";

            if (!whereClause.isEmpty())
                query += " WHERE " + whereClause;

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);

            tripIdTableEvents.setCellValueFactory(new PropertyValueFactory<Event, Integer>("tripId"));
            departureTableEvents.setCellValueFactory(new PropertyValueFactory<Event, String>("start"));
            returnTableEvents.setCellValueFactory(new PropertyValueFactory<Event, String>("end"));
            descriptionTableEvents.setCellValueFactory(new PropertyValueFactory<Event, String>("description"));

            while (result.next()) {
                int trip_id = result.getInt("ev_tr_id");
                String start = result.getString("ev_start");
                String end = result.getString("ev_end");
                String desc = result.getString("ev_descr");

                tableEvents.getItems().add(new Event(trip_id, start, end, desc));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void addEventsClicked(ActionEvent e) {
        try (Connection conn = connectDB.getConnection()) {
            String tripId = tripidListEvents.getValue();
            java.sql.Timestamp departure = java.sql.Timestamp.from(
                    departurePickerEvents.getValue().atStartOfDay().atZone(java.time.ZoneId.systemDefault())
                            .toInstant());
            java.sql.Timestamp ret = java.sql.Timestamp.from(
                    returnPickerEvents.getValue().atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());
            String description = descriptionTextEvents.getText();

            String query = "INSERT INTO event VALUES(?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, Integer.parseInt(tripId));
            stmt.setTimestamp(2, departure);
            stmt.setTimestamp(3, ret);
            stmt.setString(4, description);
            stmt.executeUpdate();

            stmt.close();

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Επιτυχής εισαγωγή εκδήλωσης!");
            alert.setTitle("Επιβεβαίωση Εισαγωγής εκδήλωσης");
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

    public void clearEventsClicked(ActionEvent e) {
        tripidListEvents.setValue(null);
        departurePickerEvents.setValue(null);
        returnPickerEvents.setValue(null);
        descriptionTextEvents.clear();
        ;
    }

    /* DESTINATION TAB */

    private void initTripIdDestination(Connection conn) throws SQLException {
        tripidListDest.getItems().clear();
        String query = "SELECT DISTINCT to_tr_id FROM destination dest JOIN travel_to tro ON dest.dst_id = tro.to_dst_id ORDER BY to_tr_id";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);

        while (result.next()) {
            tripidListDest.getItems().add(Integer.toString(result.getInt("to_tr_id")));
        }
    }

    private void initTypeDestination(Connection conn) throws SQLException {
        typeListDest.getItems().clear();
        String query = "SELECT DISTINCT dsrt_type FROM destination";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);

        while (result.next()) {
            typeListDest.getItems().add(result.getString("dsrt_type"));
        }
    }

    private void initLocationDestination(Connection conn) throws SQLException {
        locationListDest.getItems().clear();
        String query = "SELECT DISTINCT dst_name FROM destination WHERE dst_location IS NULL";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);

        locationListDest.getItems().add("");
        while (result.next()) {
            locationListDest.getItems().add(result.getString("dst_name"));
        }
    }

    private void initLanguageDestination(Connection conn) throws SQLException {
        languageListDest.getItems().clear();
        String query = "SELECT DISTINCT dst_language FROM destination ORDER BY dst_language";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(query);

        while (result.next()) {
            languageListDest.getItems().add(result.getString("dst_language"));
        }
    }

    public void searchDest(ActionEvent e) {
        tableDest.getItems().clear();
        try (Connection conn = connectDB.getConnection()) {
            String trip_id = tripidListDest.getValue();
            String name = nameFieldDest.getText();
            LocalDate departure = departurePickerDest.getValue();
            LocalDate ret = arrivalPickerDest.getValue();
            String type = typeListDest.getValue();
            String location = locationListDest.getValue();
            String language = languageListDest.getValue();
            String description = descriptionTextDest.getText();

            String query = "SELECT tro.to_tr_id, d.dst_name, tro.to_departure, tro.to_arrival," +
                    " d.dsrt_type, d.dst_language, d.dst_descr, d1.dst_name FROM destination d JOIN " +
                    "travel_to tro ON d.dst_id = tro.to_dst_id JOIN destination d1 ON d.dst_location = d1.dst_id";

            ArrayList<String> listWhereClause = new ArrayList<>();
            if (trip_id != null)
                listWhereClause.add("tro.to_tr_id = " + trip_id);
            if (!nameFieldDest.getText().isEmpty())
                listWhereClause.add("d.dst_name = '" + name + "'");
            if (departure != null && ret != null)
                listWhereClause.add("ev_start BETWEEN '" + departure + " 00:00:00' " + " AND '" + departure
                        + " 23:59:59' AND ev_end BETWEEN " + ret + " 00:00:00' AND '" + ret + " 23:59:59'");
            else if (departure != null)
                listWhereClause
                        .add("ev_start BETWEEN '" + departure + " 00:00:00' AND '" + departure + " 23:59:59'");
            else if (ret != null)
                listWhereClause.add("ev_end BETWEEN '" + ret + " 00:00:00'" + " AND  '" + ret + " 23:59:59'");
            if (type != null)
                listWhereClause.add("d.dsrt_type = " + type);
            if (location != null)
                listWhereClause.add("d1.dst_name = " + location);
            if (language != null)
                listWhereClause.add("d.dst_language = " + language);
            if (!descriptionTextDest.getText().isEmpty())
                listWhereClause.add("d.dst_descr LIKE " + description);

            String whereClause = String.join(" AND ", listWhereClause);

            if (!whereClause.isEmpty())
                query += " WHERE " + whereClause;

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);

            tripidTableDest.setCellValueFactory(new PropertyValueFactory<Destination, Integer>("trip_id"));
            nameTableDest.setCellValueFactory(new PropertyValueFactory<Destination, String>("name"));
            departureTableDest.setCellValueFactory(new PropertyValueFactory<Destination, String>("departure"));
            arrivalTableDest.setCellValueFactory(new PropertyValueFactory<Destination, String>("arrival"));
            typeTableDest.setCellValueFactory(new PropertyValueFactory<Destination, String>("type"));
            locationTableDest.setCellValueFactory(new PropertyValueFactory<Destination, String>("location"));
            languageTableDest.setCellValueFactory(new PropertyValueFactory<Destination, String>("language"));
            descriptionTableDest.setCellValueFactory(new PropertyValueFactory<Destination, String>("description"));

            while (result.next()) {
                int tripID = result.getInt("tro.to_tr_id");
                String nameString = result.getString("d.dst_name");
                String departureString = result.getString("tro.to_departure");
                String arrivalString = result.getString("tro.to_arrival");
                String typeString = result.getString("d.dsrt_type");
                String locationString = result.getString("d1.dst_name");
                String languageString = result.getString("d.dst_language");
                String descriptionString = result.getString("d.dst_descr");

                tableDest.getItems().add(new Destination(tripID, nameString, departureString, arrivalString, typeString,
                        locationString, languageString, descriptionString));
            }
            stmt.close();
        } catch (SQLException ex) {
            ex.getSQLState();
        }
    }

    public void addDest(ActionEvent e) {
        try (Connection conn = connectDB.getConnection()) {
            String trip_id = tripidListDest.getValue();
            String name = nameFieldDest.getText();
            java.sql.Timestamp departure = java.sql.Timestamp.from(
                    departurePickerDest.getValue().atStartOfDay().atZone(java.time.ZoneId.systemDefault())
                            .toInstant());
            java.sql.Timestamp arrival = java.sql.Timestamp.from(
                    arrivalPickerDest.getValue().atStartOfDay().atZone(java.time.ZoneId.systemDefault()).toInstant());
            String type = typeListDest.getValue();
            String location = locationListDest.getValue();
            String language = languageListDest.getValue();
            String description = descriptionTextDest.getText();

            Integer location_id = null;
            String query = "SELECT dst_id FROM destination WHERE dst_name LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, location);
            ResultSet result = stmt.executeQuery();
            if (result.next())
                location_id = result.getInt("dst_id");

            if (location_id != null) {
                query = "INSERT INTO destination(dst_name, dst_descr, dsrt_type, dst_language, dst_location) VALUES (?, ?, ?, ?, ?)";
                stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, name);
                stmt.setString(2, description);
                stmt.setString(3, type);
                stmt.setString(4, language);
                stmt.setInt(5, location_id);
            } else {
                query = "INSERT INTO destination(dst_name, dst_descr, dsrt_type, dst_language, dst_location) VALUES (?, ?, ?, ?, NULL)";
                stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, name);
                stmt.setString(2, description);
                stmt.setString(3, type);
                stmt.setString(4, language);
            }

            stmt.executeUpdate();

            ResultSet genKeys = stmt.getGeneratedKeys();

            query = "INSERT INTO travel_to VALUES (?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, Integer.parseInt(trip_id));
            genKeys.next();
            stmt.setInt(2, genKeys.getInt(1));
            stmt.setTimestamp(3, arrival);
            stmt.setTimestamp(4, departure);

            stmt.executeUpdate();
            stmt.close();

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Επιτυχής εισαγωγή προορισμού!");
            alert.setTitle("Επιβεβαίωση Εισαγωγής προορισμού");
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

    public void clearDest(ActionEvent e) {
        tripidListDest.setValue(null);
        nameFieldDest.setText(null);
        departurePickerDest.setValue(null);
        arrivalPickerDest.setValue(null);
        typeListDest.setValue(null);
        locationListDest.setValue(null);
        languageListDest.setValue(null);
        descriptionTextDest.clear();
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
