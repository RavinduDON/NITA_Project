package Controller;

import Business.BOFactory;
import Business.Custom.StudentBO;
import Business.boIMPL.StudentBOimpl;
import Business.sms.URLReader;
import DTO.NextStdID;
import DTO.Sex;
import DTO.Student;
import Hibernate.Entity.TrainingType;
import email.SendTextMail;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentRegisterController implements Initializable {

    StudentBO studentBO;
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
    private ComboBox<Sex> cmbSex;

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
    private Button btnSendEmail;

    @FXML
    private DatePicker regDatePic;

    @FXML
    private Button btnClear;


    @FXML
    private ComboBox<TrainingType> cmbTrainingType;

    private int regNumber;
    private String name;
    private Date date;
    private String email;
    private String telNumber;
    private String address;
    private String nicNumber;
    private String tradeOne;
    private String tradeTwo;
    private String tradeThree;
    private String fullRegId;
    private String dob;
    private TrainingType trainingType;

    List<Student> allStudents=new ArrayList<>();

    private void clear(){
        txtRegNumber.setText("");
        txtRegMonth.setText("");
        txtRegYear.setText("");
        txtAddress.setText("");
        txtfullName.setText("");
        txtnameWithInitials.setText("");
        txtdobDay.setText("");
        txtEmail.setText("");
        txtNic.setText("");
        txtdobMonth.setText("");
        txtdobYear.setText("");
        txtHomeTel.setText("");
        txtMobTel.setText("");
        txtTradeOne.setText("");
        txtTradeTwo.setText("");
        txtTradeThree.setText("");
    }

    private void loadAllData() throws Exception {

        StudentBOimpl studentBOimpl=new StudentBOimpl();
        cmbSex.getItems().removeAll();
        cmbSex.getItems().add(Sex.FEMALE);
        cmbSex.getItems().add(Sex.MALE);
        cmbTrainingType.getItems().add(TrainingType.Direct_Interview);
        cmbTrainingType.getItems().add(TrainingType.Basic_Training);

    }
    private Date parseDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            return sdf.parse(date);
        } catch (ParseException ex) {

            Logger.getLogger(StudentRegisterController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @FXML
    void Delete(ActionEvent event) {

    }


    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("/View/FrontWindow.fxml"));
        StudantRegistration.getChildren().setAll(pane);
    }

    @FXML
    void cmbSexMouseClicked(MouseEvent event) {

    }

    @FXML
    void cmbTrainigTypeMouseClicked(MouseEvent event) {

    }

    @FXML
    void notify(ActionEvent event) throws Exception {
        String email=txtEmail.getText();
        String stdNumber=loadSTDnumber();
        String name=txtfullName.getText();
        String telNumber=txtMobTel.getText();
        URLReader.SendSMS(telNumber,stdNumber);
        btnRegStudent.setDisable(false);

    }
    @FXML
    void sendEmail(ActionEvent event) throws Exception {
        String email=txtEmail.getText();
        String stdNumber=loadSTDnumber();
        String name=txtfullName.getText();
        String telNumber=txtMobTel.getText();
        SendTextMail.composeMail(email,stdNumber,name);
        btnRegStudent.setDisable(false);
    }
    @FXML
    void allClear(ActionEvent event) {

        clear();
    }


    @FXML
    void register(ActionEvent event) throws Exception {

        name=txtfullName.getText();
        email=txtEmail.getText();
        telNumber=txtMobTel.getText();
        address=txtAddress.getText();
        nicNumber=txtNic.getText();
        tradeOne=txtTradeOne.getText();
        tradeTwo=txtTradeTwo.getText();
        tradeThree=txtTradeThree.getText();
        fullRegId=txtRegYear.getText()+"/"+txtRegDistrict.getText()+"/"+txtRegMonth.getText()+"/"+txtRegNumber.getText();
        dob=txtdobYear.getText()+"/"+txtdobMonth.getText()+"/"+txtdobDay.getText();
        trainingType=cmbTrainingType.getSelectionModel().getSelectedItem();

        boolean isAdded;
        Student student;
        if(txtfullName.getText()!=""){
             student=new Student(name,new Date(),email,telNumber,address,nicNumber,tradeOne,tradeTwo,tradeThree,fullRegId,dob,trainingType);
             isAdded=studentBO.addStudent(student);
            btnRegStudent.setDisable(true);
            if(isAdded){
                Alert alert=new Alert(Alert.AlertType.INFORMATION,"Student Successfully Registered",ButtonType.OK);
                alert.show();

            }else {
                Alert alert=new Alert(Alert.AlertType.INFORMATION,"Registration Failed",ButtonType.OK);
                alert.show();
            }
        }else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Name Field Cannot Be Empty",ButtonType.OK);
            alert.show();
        }
        //Student student=new Student(name,new Date(),email,telNumber,address,nicNumber,tradeOne,tradeTwo,tradeThree,fullRegId,dob,trainingType);
        //boolean isAdded=studentBO.addStudent(student);
        allStudents=studentBO.searchANYthing(txtNic.getText());
        for(Student studentAF : allStudents){
            txtRegNumber.setText(Integer.toString(studentAF.getRegNumber()));
        }

//        if(isAdded){
//            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Student Successfully Registered",ButtonType.OK);
//            alert.show();
//        }else {
//            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Registration Failed",ButtonType.OK);
//            alert.show();
//        }
    }

    @FXML
    void search(ActionEvent event) throws Exception {

        Student student=studentBO.searchStudent(txtRegNumber.getText());
        if(student!=null){
            txtfullName.setText(student.getName());
            txtAddress.setText(student.getAddress());
            txtNic.setText(student.getNicNumber());
            txtTradeOne.setText(student.getTradeOne());
            txtTradeTwo.setText(student.getTradeTwo());
            txtTradeThree.setText(student.getTradeThree());
            cmbTrainingType.getSelectionModel().select(student.getTrainingType());
            txtdobYear.setText(student.getDob());
            txtMobTel.setText(student.getTelNumber());
            txtEmail.setText(student.getEmail());

            btnNotify.setDisable(true);
            btnRegStudent.setDisable(true);
        }
    else{
        Alert alert=new Alert(Alert.AlertType.INFORMATION,"Invalid Student ID",ButtonType.OK);
        alert.show();
    }

    }

    @FXML
    void txtanyKeyRelesed(KeyEvent event) {

    }

    @FXML
    void update(ActionEvent event) throws Exception {

        name=txtfullName.getText();
        email=txtEmail.getText();
        telNumber=txtMobTel.getText();
        address=txtAddress.getText();
        nicNumber=txtNic.getText();
        tradeOne=txtTradeOne.getText();
        tradeTwo=txtTradeTwo.getText();
        tradeThree=txtTradeThree.getText();
        fullRegId=txtRegYear.getText()+"/"+txtRegDistrict.getText()+"/"+txtRegMonth.getText()+"/"+txtRegNumber.getText();
        dob=txtdobYear.getText()+"/"+txtdobMonth.getText()+"/"+txtdobDay.getText();
        trainingType=cmbTrainingType.getSelectionModel().getSelectedItem();

        if (studentBO.updateStudent(new Student(Integer.parseInt(txtRegNumber.getText()),name,new Date(),email,telNumber,address,nicNumber,tradeOne,tradeTwo,tradeThree,fullRegId,dob,trainingType))) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Student Successfully updated", ButtonType.OK);
            alert.show();
        } else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Update process was irrupted", ButtonType.OK);
            alert.show();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        studentBO= (StudentBO) BOFactory.getBoFactory().getSuperBO(BOFactory.boTypes.STUDENT);
        try {
            loadAllData();
            loadSTDnumber();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String loadSTDnumber() throws Exception {

        String fullRegNumber=txtRegYear.getText()+"/"+txtRegDistrict.getText()+"/"+txtRegMonth.getText()+"/"+txtRegNumber.getText();
        return fullRegNumber;

    }
}
