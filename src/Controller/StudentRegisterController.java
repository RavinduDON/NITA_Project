package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class StudentRegisterController {
    @FXML
    private AnchorPane StudantRegistration;

    @FXML
    private TextField txtfullName;

    @FXML
    private TextField txtnameWithInitials;

    @FXML
    private TextField txtdobYear;

    @FXML
    private TextField txtdobMonth;

    @FXML
    private TextField txtdobDay;

    @FXML
    private TextArea txtAddress;

    @FXML
    private TextField txtNic;

    @FXML
    private TextField txtHomeTel;

    @FXML
    private TextField txtMobTel;

    @FXML
    private TextField txtEmail;

    @FXML
    private Button btnRegStudent;

    @FXML
    private Button btnNotify;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtTradeOne;

    @FXML
    private TextField txtTradeThree;

    @FXML
    private TextField txtTradeTwo;

    @FXML
    private ComboBox<?> cmbSex;

    @FXML
    private TextField txtRegYear;

    @FXML
    private TextField txtRegDistrict;

    @FXML
    private TextField txtRegMonth;

    @FXML
    private TextField txtRegNumber;

    @FXML
    private Button btnBack;

    @FXML
    void Delete(ActionEvent event) {

    }

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/FrontWindow.fxml"));
        StudantRegistration.getChildren().setAll(pane);
    }

    @FXML
    void cmbSexMouseClicked(MouseEvent event) {

    }

    @FXML
    void notify(ActionEvent event) {

    }

    @FXML
    void register(ActionEvent event) {

    }

    @FXML
    void search(ActionEvent event) {

    }

    @FXML
    void txtanyKeyRelesed(KeyEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }
}
