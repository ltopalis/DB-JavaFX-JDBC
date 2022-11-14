import javafx.application.*;
import javafx.event.Event;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

import java.time.LocalDate;

public class Main extends Application {
    Button btn;
    DatePicker dp;

    @Override
    public void start(Stage stage) {
        btn = new Button();
        btn.setText("Print Date");
        btn.setOnAction(e -> {
            LocalDate dt = dp.getValue();
            if (dt!=null) {
                System.out.println("Date: " + dt);
                System.out.println("Day: " + dt.getDayOfMonth());
                System.out.println("Month: " + dt.getMonth());
                System.out.println("Year: " + dt.getYear());
            }
            else {
                System.out.println("Choose a date!");
            }
        });

        dp = new DatePicker();

        HBox pane = new HBox();
        pane.getChildren().addAll(dp, btn);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(10);

        Scene scene = new Scene(pane, 300, 200);


        stage.setScene(scene);
        stage.setTitle("DATE PICKER");

        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}