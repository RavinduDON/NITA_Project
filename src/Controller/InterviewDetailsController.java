package Controller;

import Business.BOFactory;
import Business.Custom.InterviewBO;
import DTO.Interview;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import javax.persistence.criteria.CriteriaBuilder;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class InterviewDetailsController implements Initializable {
    InterviewBO interviewBO;
    Interview delInterview;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        interviewBO= (InterviewBO) BOFactory.getBoFactory().getSuperBO(BOFactory.boTypes.INTERVIEW);
        setall();

        tblInterview.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("interviewID"));
        tblInterview.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("fullRegID"));
        tblInterview.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("nicNumber"));
        tblInterview.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("stdName"));
        tblInterview.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("interviewDate"));
        tblInterview.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("interviewTime"));
        tblInterview.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>("interviewPlace"));
        tblInterview.getColumns().get(7).setCellValueFactory(new PropertyValueFactory<>("firstInterviewResult"));
        tblInterview.getColumns().get(8).setCellValueFactory(new PropertyValueFactory<>("secondInterviewResult"));
        tblInterview.getColumns().get(9).setCellValueFactory(new PropertyValueFactory<>("thiredInterviewResult"));
        tblInterview.getColumns().get(10).setCellValueFactory(new PropertyValueFactory<>("email"));
        tblInterview.getColumns().get(11).setCellValueFactory(new PropertyValueFactory<>("telNumber"));

        tblInterview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Interview>() {
            @Override
            public void changed(ObservableValue<? extends Interview> observable, Interview oldValue, Interview newValue) {
                delInterview=observable.getValue();
            }
        });
    }
    @FXML
    private TextField txtSearch;

    @FXML
    private TableView<Interview> tblInterview;
    List<Interview> allInterviews=new ArrayList<>();

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnOK;
    public void setall(){

        try {
            allInterviews=interviewBO.getAllInterviews();
            for(Interview interview:allInterviews){
                tblInterview.setItems(FXCollections.observableArrayList(allInterviews));

                tblInterview.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("interviewID"));
                tblInterview.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("fullRegID"));
                tblInterview.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("nicNumber"));
                tblInterview.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("stdName"));
                tblInterview.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("interviewDate"));
                tblInterview.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("interviewTime"));
                tblInterview.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>("interviewPlace"));
                tblInterview.getColumns().get(7).setCellValueFactory(new PropertyValueFactory<>("firstInterviewResult"));
                tblInterview.getColumns().get(8).setCellValueFactory(new PropertyValueFactory<>("secondInterviewResult"));
                tblInterview.getColumns().get(9).setCellValueFactory(new PropertyValueFactory<>("thiredInterviewResult"));
                tblInterview.getColumns().get(10).setCellValueFactory(new PropertyValueFactory<>("email"));
                tblInterview.getColumns().get(11).setCellValueFactory(new PropertyValueFactory<>("telNumber"));



            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void deleteInterview(ActionEvent event) {

        try {
            interviewBO.deletInterview(String.valueOf(delInterview.getInterviewID()));
            tblInterview.getItems().clear();
            allInterviews.clear();
            allInterviews=interviewBO.getAllInterviews();
            for(Interview interview:allInterviews){
                tblInterview.setItems(FXCollections.observableArrayList(allInterviews));

                tblInterview.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("interviewID"));
                tblInterview.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("fullRegID"));
                tblInterview.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("nicNumber"));
                tblInterview.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("stdName"));
                tblInterview.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("interviewDate"));
                tblInterview.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("interviewTime"));
                tblInterview.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>("interviewPlace"));
                tblInterview.getColumns().get(7).setCellValueFactory(new PropertyValueFactory<>("firstInterviewResult"));
                tblInterview.getColumns().get(8).setCellValueFactory(new PropertyValueFactory<>("secondInterviewResult"));
                tblInterview.getColumns().get(9).setCellValueFactory(new PropertyValueFactory<>("thiredInterviewResult"));
                tblInterview.getColumns().get(10).setCellValueFactory(new PropertyValueFactory<>("email"));
                tblInterview.getColumns().get(11).setCellValueFactory(new PropertyValueFactory<>("telNumber"));
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
    void searchKeyRelesed(KeyEvent event) {

        tblInterview.getItems().clear();
        allInterviews.clear();

        try {
            allInterviews=interviewBO.searchANYthing(txtSearch.getText());
            for (Interview interview:allInterviews){
                tblInterview.setItems(FXCollections.observableArrayList(allInterviews));

                tblInterview.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("interviewID"));
                tblInterview.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("fullRegID"));
                tblInterview.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("nicNumber"));
                tblInterview.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("stdName"));
                tblInterview.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("interviewDate"));
                tblInterview.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("interviewTime"));
                tblInterview.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>("interviewPlace"));
                tblInterview.getColumns().get(7).setCellValueFactory(new PropertyValueFactory<>("firstInterviewResult"));
                tblInterview.getColumns().get(8).setCellValueFactory(new PropertyValueFactory<>("secondInterviewResult"));
                tblInterview.getColumns().get(9).setCellValueFactory(new PropertyValueFactory<>("thiredInterviewResult"));
                tblInterview.getColumns().get(10).setCellValueFactory(new PropertyValueFactory<>("email"));
                tblInterview.getColumns().get(11).setCellValueFactory(new PropertyValueFactory<>("telNumber"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
