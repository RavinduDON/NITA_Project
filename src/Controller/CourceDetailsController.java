package Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CourceDetailsController implements Initializable {
    @FXML
    private AnchorPane courceDetails;

    @FXML
    private TextField txtCourceSearch;

    @FXML
    private ScrollPane scrlPane;

    @FXML
    private AnchorPane scrolPaneAnchor;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnOk;

    @FXML
    private Button btnBack;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("../View/FrontWindow.fxml"));
        courceDetails.getChildren().setAll(pane);
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
