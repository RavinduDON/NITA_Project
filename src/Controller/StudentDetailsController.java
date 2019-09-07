package Controller;
import DTO.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentDetailsController implements Initializable {

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
    void delete(ActionEvent event) {

    }

    @FXML
    void ok(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
