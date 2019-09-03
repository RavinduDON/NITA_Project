package Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StudentDetailsController {

    @FXML
    private AnchorPane studentDetail;

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

}
