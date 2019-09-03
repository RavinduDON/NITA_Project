package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CourceRegisterController {
    @FXML
    private AnchorPane courceRegistrationPane;

    @FXML
    private TextField txtCourceID;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField txtcourceName;

    @FXML
    private TextField txtTrainingCenter;

    @FXML
    private TextField txtDate;

    @FXML
    private Button btnNotify;

    @FXML
    private Button btnBack;

    @FXML
    void cancel(ActionEvent event) {

    }

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/FrontWindow.fxml"));
        courceRegistrationPane.getChildren().setAll(pane);
    }

    @FXML
    void notify(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

}
