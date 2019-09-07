package Controller;
import Business.BOFactory;
import Business.Custom.CourseBO;
import Business.Custom.StudentBO;
import DTO.Student;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDetailsController implements Initializable {
    StudentBO bo;
    List<Student> allStudents;
    @FXML
    private AnchorPane studentDetail;

    @FXML
    private TextField txtStudentSearch;

    @FXML
    private TableView<Student> tblStudent;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnOk;

    @FXML
    private Button btnBack;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/FrontWindow.fxml"));
        studentDetail.getChildren().setAll(pane);

    }
    @FXML
    void searchKeyword(KeyEvent event) {
        tblStudent.getItems().clear();
        allStudents.clear();

        try {
            allStudents = bo.searchANYthing(txtStudentSearch.getText());
            for (Student student : allStudents) {
                tblStudent.setItems(FXCollections.observableArrayList(allStudents));
                tblStudent.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>(Integer.toString(student.getRegNumber())));
                tblStudent.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>(student.getName()));
                tblStudent.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>(student.getDate()+""));
                tblStudent.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>(student.getEmail()));
                tblStudent.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>(student.getTelNumber()));
                tblStudent.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>(student.getAddress()));
                tblStudent.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>(student.getNicNumber()));
                tblStudent.getColumns().get(7).setCellValueFactory(new PropertyValueFactory<>(student.getTradeOne()));
                tblStudent.getColumns().get(8).setCellValueFactory(new PropertyValueFactory<>(student.getTradeTwo()));
                tblStudent.getColumns().get(9).setCellValueFactory(new PropertyValueFactory<>(student.getTradeThree()));
                tblStudent.getColumns().get(10).setCellValueFactory(new PropertyValueFactory<>(student.getTrainingType()+""));


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void ok(ActionEvent event) {

    }
    public void setAll(){
        try {
            allStudents = bo.getAllStudents();
            for (Student student : allStudents) {
                tblStudent.setItems(FXCollections.observableArrayList(allStudents));
                tblStudent.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>(Integer.toString(student.getRegNumber())));
                tblStudent.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>(student.getName()));
                tblStudent.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>(student.getDate()+""));
                tblStudent.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>(student.getEmail()));
                tblStudent.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>(student.getTelNumber()));
                tblStudent.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>(student.getAddress()));
                tblStudent.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>(student.getNicNumber()));
                tblStudent.getColumns().get(7).setCellValueFactory(new PropertyValueFactory<>(student.getTradeOne()));
                tblStudent.getColumns().get(8).setCellValueFactory(new PropertyValueFactory<>(student.getTradeTwo()));
                tblStudent.getColumns().get(9).setCellValueFactory(new PropertyValueFactory<>(student.getTradeThree()));
                tblStudent.getColumns().get(10).setCellValueFactory(new PropertyValueFactory<>(student.getTrainingType()+""));


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bo=(StudentBO) BOFactory.getBoFactory().getSuperBO(BOFactory.boTypes.STUDENT);
        setAll();
    }
}
