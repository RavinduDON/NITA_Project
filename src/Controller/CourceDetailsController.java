package Controller;
import Business.BOFactory;
import Business.Custom.CourseBO;
import DTO.Course;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CourceDetailsController implements Initializable {
    CourseBO bo;
    Course delcourse;
    @FXML
    private AnchorPane courceDetails;

    @FXML
    private TextField txtCourceSearch;

    @FXML
    private TableView<Course> tblCourse;
    List<Course> courseList=new ArrayList<>();

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

        try {
            bo.deletCourse(String.valueOf(delcourse.getCourseID()));
            tblCourse.getItems().clear();
            courseList.clear();
            courseList=bo.getAllCourses();
            for(Course course:courseList){
                tblCourse.setItems(FXCollections.observableArrayList(courseList));

                tblCourse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("courseID"));
                tblCourse.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
                tblCourse.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("duration"));
                tblCourse.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("trainingCenter"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    Stage stage;

    @FXML
    void ok(ActionEvent event) {
        stage=(Stage)((Button)event.getSource()).getScene().getWindow();
        stage.close();
    }
    @FXML
    void txtSearchKeyRelesed(KeyEvent event) {
        tblCourse.getItems().clear();
        courseList.clear();
        try {
            courseList=bo.searchANYthing( txtCourceSearch.getText());
            for(Course course:courseList){
                tblCourse.setItems(FXCollections.observableArrayList(courseList));

                tblCourse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("courseID"));
                tblCourse.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
                tblCourse.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("duration"));
                tblCourse.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("trainingCenter"));


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        bo=(CourseBO) BOFactory.getBoFactory().getSuperBO(BOFactory.boTypes.COURSE);
        loadAllCourses();

        tblCourse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("courseID"));
        tblCourse.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("name"));
        tblCourse.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("duration"));
        tblCourse.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("trainingCenter"));

//        tblCourse.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Course>() {
//            @Override
//            public void changed(ObservableValue<? extends Course> observable, Course oldValue, Course newValue) {
//                Course value=observable.getValue();
//
//            }
//        });
        tblCourse.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Course>() {
            @Override
            public void changed(ObservableValue<? extends Course> observable, Course oldValue, Course newValue) {
                delcourse=observable.getValue();
            }
        });

    }

    private void loadAllCourses(){
        try {
            courseList=bo.getAllCourses();
            for(Course course:courseList){
                tblCourse.setItems(FXCollections.observableArrayList(courseList));

                tblCourse.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>(Integer.toString(course.getCourseID())));
                tblCourse.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>(course.getName()));
                tblCourse.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>(course.getDuration()));
                tblCourse.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>(course.getTrainingCenter()));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
