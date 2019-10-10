package Controller;

import Business.BOFactory;
import Business.Custom.StudentBO;
import DTO.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PlaceInterviewController implements Initializable {
    StudentBO studentBO;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        studentBO= (StudentBO) BOFactory.getBoFactory().getSuperBO(BOFactory.boTypes.STUDENT);
    }
    @FXML
    private TextField txtSearchStudentRegNumber;

    @FXML
    private Button btnSTDsearch;

    @FXML
    private TextField txtstdName;

    @FXML
    private TextField txtStdNIC;

    @FXML
    private TextField txtTradeOne;

    @FXML
    private TextField txtTradeTwo;

    @FXML
    private TextField txtTradeThree;

    @FXML
    private ComboBox<?> cmbTrainingType;

    @FXML
    private TextField txtTelNumber;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtInterviewTime;

    @FXML
    private TextField txtInterviewPlace;

    @FXML
    private Button btnOK;

    @FXML
    private Button btnSendEmail;

    @FXML
    private Button btnSendSMS;

    @FXML
    private Button btnFinish;

    @FXML
    private TextField txtFirstInterview;

    @FXML
    private TextField txtSecondInterview;

    @FXML
    private TextField txtThiredInterview;

    @FXML
    private Button btnFinishInterview;

    @FXML
    private Button btnUpdateInterview;

    @FXML
    private DatePicker txtInterviewDate;

    @FXML
    private TextField txtSearchInterview;

    @FXML
    private Button btnSearchInterview;

    @FXML
    private TextField txtStdReg;

    @FXML
    void finishPlaceInterview(ActionEvent event) {

    }

    @FXML
    void finishUpdateInterviewResults(ActionEvent event) {

    }

    @FXML
    void placeInterview(ActionEvent event) {


    }

    @FXML
    void searchStudent(ActionEvent event) throws Exception {
        Student student=studentBO.searchStudent(txtSearchStudentRegNumber.getText());


    }

    @FXML
    void senSMS(ActionEvent event) {

    }

    @FXML
    void sendEmail(ActionEvent event) {

    }

    @FXML
    void updateInterviewResults(ActionEvent event) {

    }
}
