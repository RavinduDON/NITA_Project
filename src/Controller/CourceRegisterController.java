package Controller;

import Business.BOFactory;
import Business.Custom.CourseBO;
import Business.SuperBO;
import DTO.Course;
import DTO.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//import javafx.scene.Business

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CourceRegisterController implements Initializable {
    CourseBO bo;

    @FXML
    private TextField txtCourceID;

    @FXML
    private AnchorPane courceRegistrationPane;

    @FXML
    private TextField txtcourceName;

    @FXML
    private TextField txtDuration;

    @FXML
    private TextField txtTrainingCenter;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    Stage stage;

    @FXML
    void cancel(ActionEvent event) {
        stage=(Stage)((Button)event.getSource()).getScene().getWindow();
        stage.close();

    }

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("/View/FrontWindow.fxml"));
        courceRegistrationPane.getChildren().setAll(pane);
    }

    @FXML
    void notify(ActionEvent event) throws Exception {
        //this is search method
        Course course=bo.searchCourse(txtCourceID.getText());
        if(course!=null){
            txtcourceName.setText(course.getName());
            txtDuration.setText(course.getDuration());
            txtTrainingCenter.setText(course.getTrainingCenter());
            btnSave.setDisable(true);
        }else{
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Invalid cource ID",ButtonType.OK);
            alert.show();
        }
    }


    @FXML
    void save(ActionEvent event) throws Exception {
        if(bo.addCourse(new Course(txtcourceName.getText(),txtDuration.getText(),txtTrainingCenter.getText()))){
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Cource Successfully Registered", ButtonType.OK);
            alert.show();
            txtCourceID.setText("");
            txtcourceName.setText("");
            txtDuration.setText("");
            txtTrainingCenter.setText("");
        }else {
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Cource registration Failed",ButtonType.OK);
            alert.show();
        }
    }

    @FXML
    void update(ActionEvent event) throws Exception {
        if(bo.updateCourse(new Course(Integer.parseInt(txtCourceID.getText()),txtcourceName.getText(),txtDuration.getText(),txtTrainingCenter.getText()))){
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Course Successfully updated", ButtonType.OK);
            alert.show();
        }else{
            Alert alert=new Alert(Alert.AlertType.INFORMATION,"Update process was irrupted", ButtonType.OK);
            alert.show();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bo=(CourseBO)BOFactory.getBoFactory().getSuperBO(BOFactory.boTypes.COURSE);

    }
}
