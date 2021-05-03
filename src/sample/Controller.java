package sample;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {
    private static String IDLE_BUTTON_STYLE = "-fx-background-color: transparent;";
    private static String HOVERED_BUTTON_STYLE = "-fx-background-color: transparent; -fx-scale-x: 1.2; -fx-scale-y: 1.2; -fx-scale-z:1.2;-fx-text-fill: #19c6bd; transition-duration: 2s;";
    private static String HOVERED_BUTTON_ENG = "-fx-background-color: #19c6bd; -fx-background-radius: 12; -fx-opacity: 0.5 -fx-scale-x: 1.1; -fx-scale-y: 1.1; -fx-scale-z:1.1;-fx-text-fill: #000000;";
    private static String CLOSE = "-fx-background-color: #c40e0e; -fx-background-radius: 12; -fx-opacity: 0.5 -fx-scale-x: 1.0; -fx-scale-y: 1.0; -fx-scale-z:1.0;-fx-text-fill: #000000;";
    private double xOffset;
    private double yOffset;
    @FXML
    private Button close;

    @FXML
    private Button Eng;

    @FXML
    private Button Ukr;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ClikMe;


    @FXML
    void initialize() {

        close.setStyle(IDLE_BUTTON_STYLE);
        close.setOnMouseEntered(e -> close.setStyle(CLOSE));
        close.setOnMouseExited(e -> close.setStyle(IDLE_BUTTON_STYLE));

        close.setOnAction(actionEvent -> {
            close.getScene().getWindow().hide();
        });

        Eng.setStyle(IDLE_BUTTON_STYLE);
        Eng.setOnMouseEntered(e -> Eng.setStyle(HOVERED_BUTTON_ENG));
        Eng.setOnMouseExited(e -> Eng.setStyle(IDLE_BUTTON_STYLE));

        Ukr.setStyle(IDLE_BUTTON_STYLE);
        Ukr.setOnMouseEntered(e -> Ukr.setStyle(HOVERED_BUTTON_ENG));
        Ukr.setOnMouseExited(e -> Ukr.setStyle(IDLE_BUTTON_STYLE));

        ClikMe.setStyle(IDLE_BUTTON_STYLE);
        ClikMe.setOnMouseEntered(e -> ClikMe.setStyle(HOVERED_BUTTON_STYLE));
        ClikMe.setOnMouseExited(e -> ClikMe.setStyle(IDLE_BUTTON_STYLE));

            ClikMe.setOnAction(actionEvent -> {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/OpenResume.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.TRANSPARENT);
                Scene scene = new Scene(root, 800, 500, Color.TRANSPARENT);
                stage.setScene(scene);
                scene.setOnMousePressed(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        xOffset = stage.getX() - event.getScreenX();
                        yOffset = stage.getY() - event.getScreenY();
                    }
                });
                scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        stage.setX(event.getScreenX() + xOffset);
                        stage.setY(event.getScreenY() + yOffset);
                    }
                });
                stage.show();
                ClikMe.getScene().getWindow().hide();
            });


        }
    }




