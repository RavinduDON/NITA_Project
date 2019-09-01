package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;


public class StudentRegisterController implements Initializable {

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
    void cmbSexMouseClicked(MouseEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
