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

public class CourceRegisterController implements Initializable {

    @FXML
    public void click_Student_Registry(ActionEvent event) throws IOException {
        AnchorPane anchor = FXMLLoader.load(this.getClass().getResource("../View/StudentRegister.fxml"));
        CourceRegiAnchorPane.getChildren().setAll(anchor);
    }


    @FXML
    private AnchorPane CourceRegiAnchorPane;

    @FXML
    private TextField txtCourceID;

    @FXML
    private TextField txtcourceName;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtTrainingCenter;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnNotify;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
