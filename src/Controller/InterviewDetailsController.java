package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class InterviewDetailsController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private TextField txtSearch;

    @FXML
    private TableView<?> tblInterview;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnOK;

    @FXML
    void deleteInterview(ActionEvent event) {

    }

    @FXML
    void ok(ActionEvent event) {

    }

    @FXML
    void searchKeyRelesed(KeyEvent event) {

    }
}
