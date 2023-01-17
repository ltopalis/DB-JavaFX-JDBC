import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class dashboardContollers {

    @FXML
    private TableColumn<?, ?> ACTIONCOLUMNSET;

    @FXML
    private TextField ATTEXTSET;

    @FXML
    private ComboBox<?> BRANCHLISTSET;

    @FXML
    private TableColumn<?, ?> CHANGESCOLUMNSET;

    @FXML
    private Label DATETEXTSET;

    @FXML
    private TextField LNAMETEXTSET;

    @FXML
    private TextField NAMETEXTSET;

    @FXML
    private PasswordField PASSTEXTSET;

    @FXML
    private ImageView PHOTOUSERSET;

    @FXML
    private TextField SALARYTEXTSET;

    @FXML
    private TableView<?> TABLESET;

    @FXML
    private TableColumn<?, ?> TIMECOLUMNSET;

    @FXML
    private Button UPDATESET;

    @FXML
    private TableColumn<?, ?> USERCOLUMNSET;

    @FXML
    private Label accounting_number_summary;

    @FXML
    private Button addBottonDest;

    @FXML
    private Button addBottonEvents;

    @FXML
    private Button addBottonTrip;

    @FXML
    private Pane addOffersMenu;

    @FXML
    private Label admin_number_summary;

    @FXML
    private DatePicker arrivalPickerDest;

    @FXML
    private TableColumn<?, ?> arrivalTableDest;

    @FXML
    private ComboBox<?> branchListTrip;

    @FXML
    private TableColumn<?, ?> branchTableTrip;

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
    private TableColumn<?, ?> departureTableDest;

    @FXML
    private TableColumn<?, ?> departureTableEvents;

    @FXML
    private TableColumn<?, ?> departureTableTrips;

    @FXML
    private TableColumn<?, ?> descriptionTableDest;

    @FXML
    private TableColumn<?, ?> descriptionTableEvents;

    @FXML
    private TextArea descriptionTextDest;

    @FXML
    private TextArea descriptionTextEvents;

    @FXML
    private Label destinationNumber;

    @FXML
    private ComboBox<?> driverListTrips;

    @FXML
    private TableColumn<?, ?> driverTableTrips;

    @FXML
    private Label drivers_number_summary;

    @FXML
    private Tab eventTabTrip;

    @FXML
    private Button exitButton;

    @FXML
    private ComboBox<?> guideListTrips;

    @FXML
    private TableColumn<?, ?> guideTableTrip;

    @FXML
    private Label guide_number_summary;

    @FXML
    private Label incomes;

    @FXML
    private ComboBox<?> languageListDest;

    @FXML
    private TableColumn<?, ?> languageTableDest;

    @FXML
    private ComboBox<?> locationListDest;

    @FXML
    private TableColumn<?, ?> locationTableDest;

    @FXML
    private Label logistics_number_summary;

    @FXML
    private TextField nameFieldDest;

    @FXML
    private TableColumn<?, ?> nameTableDest;

    @FXML
    private Button newReservationButton;

    @FXML
    private Button offerButton;

    @FXML
    private Label outcomes;

    @FXML
    private TableColumn<?, ?> priceTableTrips;

    @FXML
    private Label profit;

    @FXML
    private Pane reservationMenu;

    @FXML
    private Label reservationNumber;

    @FXML
    private DatePicker returnDateTrip;

    @FXML
    private DatePicker returnPickerEvents;

    @FXML
    private TableColumn<?, ?> returnTableEvents;

    @FXML
    private TableColumn<?, ?> returnTableTrips;

    @FXML
    private Button searchBottonDest;

    @FXML
    private Button searchBottonEvents;

    @FXML
    private Button searchBottonTrip;

    @FXML
    private TextField seatTextTrip;

    @FXML
    private TableColumn<?, ?> seatsTableTrips;

    @FXML
    private Button settingsButton;

    @FXML
    private Button signoutButton;

    @FXML
    private TableView<?> tableDest;

    @FXML
    private TableView<?> tableEvents;

    @FXML
    private TableView<?> tableTrip;

    @FXML
    private AnchorPane travelMenu;

    @FXML
    private Button tripButton;

    @FXML
    private TableColumn<?, ?> tripIdTableEvents;

    @FXML
    private ComboBox<?> tripidListDest;

    @FXML
    private ComboBox<?> tripidListEvents;

    @FXML
    private ComboBox<?> tripidListTrips;

    @FXML
    private TableColumn<?, ?> tripidTableDest;

    @FXML
    private TableColumn<?, ?> tripidTableTrips;

    @FXML
    private ComboBox<?> typeListDest;

    @FXML
    private TableColumn<?, ?> typeTableDest;

    @FXML
    private Pane userInformationScene;

    @FXML
    private Label usernameLabel;

    @FXML
    private Button workerButton;

    @FXML
    private Pane workersManagerMenu;

    @FXML
    private AnchorPane workers_summary;