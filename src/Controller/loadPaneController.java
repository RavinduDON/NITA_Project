package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class loadPaneController implements Initializable {
    @FXML
    private ImageView imgPane;
    Image image;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        image=new Image("/Image/image.nita_logo.png");
        imgPane.setImage(image);
    }
}
