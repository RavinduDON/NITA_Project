package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class FrontWindowController {
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
    void buttonCourceDetails(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/CourceDetails.fxml"));
        windowPane.getChildren().setAll(pane);

    }

    @FXML
    void buttonCourceRegistry(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/CourceRegister.fxml"));
        windowPane.getChildren().setAll(pane);

    }

    @FXML
    void buttonStudentDetails(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/StudentDetails.fxml"));
        windowPane.getChildren().setAll(pane);

    }

    @FXML
    void buttonStudentRegistry(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/StudentRegister.fxml"));
        windowPane.getChildren().setAll(pane);

    }

}
