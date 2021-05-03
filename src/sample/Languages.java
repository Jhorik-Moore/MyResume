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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Languages {
    private static  String IDLE_BUTTON_STYLE = "-fx-background-color: transparent;";
    private static  String HOVERED_BUTTON_STYLE = "-fx-background-color: transparent; -fx-scale-x: 1.2; -fx-scale-y: 1.2; -fx-scale-z:1.2;-fx-text-fill: #ffffff;";
    private static String HOVERED_BUTTON_ENG = "-fx-background-color: #19c6bd; -fx-scale-x: 1.2; -fx-scale-y: 1.2; -fx-scale-z:1.2;-fx-text-fill: #000000;";
    private static String HOVERED_IMAGE_ME ="-fx-background-color: transparent; -fx-opacity: 0.58; -fx-scale-x: 1.1; -fx-scale-y: 1.1; -fx-scale-z:1.1;";
    private double xOffset;
    private double yOffset;
    private static String CLOSE = "-fx-background-color: #c40e0e; -fx-background-radius: 12; -fx-opacity: 0.5 -fx-scale-x: 1.0; -fx-scale-y: 1.0; -fx-scale-z:1.0;-fx-text-fill: #000000;";
    @FXML
    private Button close;
    @FXML
    private ImageView me;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CONTACTS;

    @FXML
    private Button QA;

    @FXML
    private Button EDUCATION;

    @FXML
    private Button LANGUAGES;

    @FXML
    private Button SKILLS;

    @FXML
    private Button EXPIRIANCE;

    @FXML
    private Button Eng;

    @FXML
    private Button Ukr;

    @FXML
    void initialize() {
        close.setStyle(IDLE_BUTTON_STYLE);
        close.setOnMouseEntered(e -> close.setStyle(CLOSE));
        close.setOnMouseExited(e -> close.setStyle(IDLE_BUTTON_STYLE));

        close.setOnAction(actionEvent -> {
            close.getScene().getWindow().hide();
        });
        me.setStyle(IDLE_BUTTON_STYLE);
        me.setOnMouseEntered(e -> me.setStyle(HOVERED_IMAGE_ME));
        me.setOnMouseExited(e -> me.setStyle(IDLE_BUTTON_STYLE));

        me.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
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
            me.getScene().getWindow().hide();
        });
        Eng.setStyle(IDLE_BUTTON_STYLE);
        Eng.setOnMouseEntered(e -> Eng.setStyle(HOVERED_BUTTON_ENG));
        Eng.setOnMouseExited(e -> Eng.setStyle(IDLE_BUTTON_STYLE));

        Ukr.setStyle(IDLE_BUTTON_STYLE);
        Ukr.setOnMouseEntered(e -> Ukr.setStyle(HOVERED_BUTTON_ENG));
        Ukr.setOnMouseExited(e -> Ukr.setStyle(IDLE_BUTTON_STYLE));

        CONTACTS.setStyle(IDLE_BUTTON_STYLE);
        CONTACTS.setOnMouseEntered(e -> CONTACTS.setStyle(HOVERED_BUTTON_STYLE));
        CONTACTS.setOnMouseExited(e -> CONTACTS.setStyle(IDLE_BUTTON_STYLE));

        QA.setStyle(IDLE_BUTTON_STYLE);
        QA.setOnMouseEntered(e -> QA.setStyle(HOVERED_BUTTON_STYLE));
        QA.setOnMouseExited(e -> QA.setStyle(IDLE_BUTTON_STYLE));

        EDUCATION.setStyle(IDLE_BUTTON_STYLE);
        EDUCATION.setOnMouseEntered(e -> EDUCATION.setStyle(HOVERED_BUTTON_STYLE));
        EDUCATION.setOnMouseExited(e -> EDUCATION.setStyle(IDLE_BUTTON_STYLE));

        LANGUAGES.setStyle(IDLE_BUTTON_STYLE);
        LANGUAGES.setOnMouseEntered(e -> LANGUAGES.setStyle(HOVERED_BUTTON_STYLE));
        LANGUAGES.setOnMouseExited(e -> LANGUAGES.setStyle(IDLE_BUTTON_STYLE));

        SKILLS.setStyle(IDLE_BUTTON_STYLE);
        SKILLS.setOnMouseEntered(e -> SKILLS.setStyle(HOVERED_BUTTON_STYLE));
        SKILLS.setOnMouseExited(e -> SKILLS.setStyle(IDLE_BUTTON_STYLE));

        EXPIRIANCE.setStyle(IDLE_BUTTON_STYLE);
        EXPIRIANCE.setOnMouseEntered(e -> EXPIRIANCE.setStyle(HOVERED_BUTTON_STYLE));
        EXPIRIANCE.setOnMouseExited(e -> EXPIRIANCE.setStyle(IDLE_BUTTON_STYLE));

        CONTACTS.setOnAction(actionEvent -> {
            FXMLLoader loaderContacts = new FXMLLoader();
            loaderContacts.setLocation(getClass().getResource("/sample/Contacts.fxml"));

            try {
                loaderContacts.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loaderContacts.getRoot();
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
            CONTACTS.getScene().getWindow().hide();

        });

        SKILLS.setOnAction(actionEvent -> {
            FXMLLoader loaderSkills = new FXMLLoader();
            loaderSkills.setLocation(getClass().getResource("/sample/Skills.fxml"));

            try {
                loaderSkills.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loaderSkills.getRoot();
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
            SKILLS.getScene().getWindow().hide();

        });
        EDUCATION.setOnAction(actionEvent -> {
            FXMLLoader loaderSkills = new FXMLLoader();
            loaderSkills.setLocation(getClass().getResource("/sample/Education.fxml"));

            try {
                loaderSkills.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loaderSkills.getRoot();
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
            EDUCATION.getScene().getWindow().hide();

        });
        QA.setOnAction(actionEvent -> {
            FXMLLoader loaderSkills = new FXMLLoader();
            loaderSkills.setLocation(getClass().getResource("/sample/QA.fxml"));

            try {
                loaderSkills.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loaderSkills.getRoot();
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
            QA.getScene().getWindow().hide();

        });
        EXPIRIANCE.setOnAction(actionEvent -> {
            FXMLLoader loaderSkills = new FXMLLoader();
            loaderSkills.setLocation(getClass().getResource("/sample/Expiriance.fxml"));

            try {
                loaderSkills.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loaderSkills.getRoot();
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
            EXPIRIANCE.getScene().getWindow().hide();

        });


    }
}
