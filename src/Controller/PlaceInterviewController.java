package Controller;

import Business.BOFactory;
import Business.Custom.InterviewBO;
import Business.Custom.StudentBO;
import Business.sms.InterviewSMS;
import DTO.Interview;
import DTO.Student;
import Hibernate.Custom.InterviewHIB;
import Hibernate.Custom.StudentHIB;
import Hibernate.Dao.HibernateFactory;
import Hibernate.Entity.TrainingType;
import email.InterviewEmail;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.StringConverter;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PlaceInterviewController implements Initializable {
    StudentBO studentBO;
    InterviewBO interviewBO;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        studentBO= (StudentBO) BOFactory.getBoFactory().getSuperBO(BOFactory.boTypes.STUDENT);
        interviewBO= (InterviewBO) BOFactory.getBoFactory().getSuperBO(BOFactory.boTypes.INTERVIEW);

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
    private ComboBox<TrainingType> cmbTrainingType;

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
    String pattern = "yyyy-MM-dd";

    private int interviewID;
    private String fullRegID;
    private String nicNumber;
    private String stdName;
    private String email;
    private String telNumber;
    private String interviewDate;
    private String interviewTime;
    private String interviewPlace;
    private String firstInterviewResult;
    private String secondInterviewResult;
    private String thiredInterviewResult;
    private Student student;
    List<Student> allStudents=new ArrayList<>();
    List<Interview> allInterviews=new ArrayList<>();
    @FXML
    void finishPlaceInterview(ActionEvent event) {
        txtStdReg.setText("");
        txtstdName.setText("");
        txtStdNIC.setText("");
        txtTradeOne.setText("");
        txtTradeTwo.setText("");
        txtTradeThree.setText("");
        cmbTrainingType.getSelectionModel().select(null);
        txtTelNumber.setText("");
        txtEmail.setText("");
        txtThiredInterview.setText("");
        txtSecondInterview.setText("");
        txtFirstInterview.setText("");
        txtInterviewTime.setText("");
        txtInterviewPlace.setText("");
        txtInterviewDate.getEditor().setText("");
        txtSearchStudentRegNumber.setText("");
        txtSearchInterview.setText("");
    }

    @FXML
    void finishUpdateInterviewResults(ActionEvent event) {
        txtStdReg.setText("");
        txtstdName.setText("");
        txtStdNIC.setText("");
        txtTradeOne.setText("");
        txtTradeTwo.setText("");
        txtTradeThree.setText("");
        cmbTrainingType.getSelectionModel().select(null);
        txtTelNumber.setText("");
        txtEmail.setText("");
        txtThiredInterview.setText("");
        txtSecondInterview.setText("");
        txtFirstInterview.setText("");
        txtInterviewTime.setText("");
        txtInterviewPlace.setText("");
        txtInterviewDate.getEditor().setText("");
        txtSearchStudentRegNumber.setText("");
        txtSearchInterview.setText("");
    }

    @FXML
    void placeInterview(ActionEvent event) throws Exception {
        String regNumber=txtSearchStudentRegNumber.getText();
        allStudents.clear();
        allStudents=studentBO.searchANYthing(regNumber);
        for(Student student : allStudents) {
            fullRegID = txtStdReg.getText();
            nicNumber = txtStdNIC.getText();
            stdName = txtstdName.getText();
            email = txtEmail.getText();
            telNumber = txtTelNumber.getText();
            interviewDate = txtInterviewDate.getValue().format(DateTimeFormatter.ofPattern(pattern));
            //interviewDate=txtInterviewDate.getEditor().getText();
            interviewPlace = txtInterviewPlace.getText();
            interviewTime = txtInterviewTime.getText();
            firstInterviewResult = txtFirstInterview.getText();
            secondInterviewResult = txtSecondInterview.getText();
            thiredInterviewResult = txtThiredInterview.getText();

            Interview interview = new Interview(fullRegID, nicNumber, stdName, email, telNumber, interviewDate, interviewTime, interviewPlace, firstInterviewResult, secondInterviewResult, thiredInterviewResult, student);
            boolean isAdded = interviewBO.addInterview(interview);
            if (isAdded) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Interview Successfully placed to Student No:" + fullRegID, ButtonType.OK);
                alert.show();

            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Registration Failed", ButtonType.OK);
                alert.show();
            }
        }
    }

    @FXML
    void searchStudent(ActionEvent event) throws Exception {
        String regNumber=txtSearchStudentRegNumber.getText();
        allStudents.clear();
        allStudents=studentBO.searchANYthing(regNumber);
        if(allStudents!=null){
        for(Student studentAF : allStudents){
            //txtRegNumber.setText(Integer.toString(studentAF.getRegNumber()));
            txtStdReg.setText(studentAF.getFullRegId()+""+studentAF.getRegNumber());
            txtstdName.setText(studentAF.getName());
            txtStdNIC.setText(studentAF.getNicNumber());
            txtTradeOne.setText(studentAF.getTradeOne());
            txtTradeTwo.setText(studentAF.getTradeTwo());
            txtTradeThree.setText(studentAF.getTradeThree());
            cmbTrainingType.getSelectionModel().select(studentAF.getTrainingType());
            txtTelNumber.setText(studentAF.getTelNumber());
            txtEmail.setText(studentAF.getEmail());
        }
//        Student student=studentBO.searchStudent(regNumber);
//        if(student!=null) {
//            txtStdReg.setText(student.getFullRegId() + "" + student.getRegNumber());
//            txtstdName.setText(student.getName());
//            txtStdNIC.setText(student.getNicNumber());
//            txtTradeOne.setText(student.getTradeOne());
//            txtTradeTwo.setText(student.getTradeTwo());
//            txtTradeThree.setText(student.getTradeThree());
//            cmbTrainingType.getSelectionModel().select(student.getTrainingType());
//            txtTelNumber.setText(student.getTelNumber());
//            txtEmail.setText(student.getEmail());
        }else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Invalid Student ID",ButtonType.OK);
            alert.show();
        }

    }

    @FXML
    void searchInterview(ActionEvent event) throws Exception {
        allInterviews=interviewBO.searchInterviews(txtSearchInterview.getText());
        for(Interview interview : allInterviews){
           txtstdName.setText(interview.getStdName());
           txtStdReg.setText(interview.getFullRegID());
           txtEmail.setText(interview.getEmail());
           txtTelNumber.setText(interview.getTelNumber());
           txtStdNIC.setText(interview.getNicNumber());
           txtInterviewDate.getEditor().setText(interview.getInterviewDate());
           txtInterviewPlace.setText(interview.getInterviewPlace());
           txtInterviewTime.setText(interview.getInterviewTime());
           txtFirstInterview.setText(interview.getFirstInterviewResult());
           txtSecondInterview.setText(interview.getSecondInterviewResult());
           txtThiredInterview.setText(interview.getThiredInterviewResult());
        }
    }

    @FXML
    void senSMS(ActionEvent event) throws Exception {
        fullRegID=txtStdReg.getText();
        interviewDate=txtInterviewDate.getEditor().getText();
        telNumber=txtTelNumber.getText();
        InterviewSMS.SendSMS(telNumber,fullRegID,interviewDate);
    }

    @FXML
    void sendEmail(ActionEvent event) throws Exception {
        fullRegID=txtStdReg.getText();
        stdName=txtstdName.getText();
        interviewDate=txtInterviewDate.getEditor().getText();
        interviewPlace=txtInterviewPlace.getText();
        interviewTime=txtInterviewTime.getText();
        email=txtEmail.getText();
        InterviewEmail.composeMail(email,fullRegID,stdName,interviewDate,interviewTime,interviewPlace);

    }

    @FXML
    void updateInterviewResults(ActionEvent event) throws Exception {
        fullRegID=txtStdReg.getText();
        nicNumber=txtStdNIC.getText();
        stdName=txtstdName.getText();
        email=txtEmail.getText();
        telNumber=txtTelNumber.getText();
        //interviewDate=txtInterviewDate.getValue().format(DateTimeFormatter.ofPattern(pattern));
        interviewPlace=txtInterviewPlace.getText();
        interviewTime=txtInterviewTime.getText();
        firstInterviewResult=txtFirstInterview.getText();
        secondInterviewResult=txtSecondInterview.getText();
        thiredInterviewResult=txtThiredInterview.getText();
        Interview interview=new Interview(fullRegID,nicNumber,stdName,email,telNumber,interviewTime,interviewPlace,firstInterviewResult,secondInterviewResult,thiredInterviewResult);

        boolean isUpdated=interviewBO.updateInterview(interview);
        if(isUpdated){
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Interview Detail Successfully Updated to Student id:"+fullRegID,ButtonType.OK);
            alert.show();

        }else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Update Failed",ButtonType.OK);
            alert.show();
        }
    }
}
