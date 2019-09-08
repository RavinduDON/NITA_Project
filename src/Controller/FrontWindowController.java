package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FrontWindowController implements Initializable {
    @FXML
    private AnchorPane loadPane;

    @FXML
    private AnchorPane windowPane;

    @FXML
    private Button btnStReg;

    @FXML
    private Button btnCouReg;

    @FXML
    private Button btnStDetails;

    @FXML
    private Button btnCouDetails;

    @FXML
    void buttonCourseDetails(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/CourceDetails.fxml"));
        loadPane.getChildren().setAll(pane);

    }

    @FXML
    void buttonCourceRegistry(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/CourceRegister.fxml"));
        loadPane.getChildren().setAll(pane);

    }

    @FXML
    void buttonStudentDetails(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/StudentDetails.fxml"));
        loadPane.getChildren().setAll(pane);
    }

    @FXML
    void buttonStudentRegistry(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/StudentRegister.fxml"));
        loadPane.getChildren().setAll(pane);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
