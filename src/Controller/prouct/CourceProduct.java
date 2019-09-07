package Controller.prouct;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class CourceProduct {
    private SimpleIntegerProperty courseID;
    private SimpleStringProperty courceName;
    private SimpleStringProperty trainigCenter;
    private SimpleStringProperty duration;

    public CourceProduct(int courseID, String courceName, String trainigCenter, String duration) {
        this.setCourseID(courseID);
        this.setCourceName(courceName);
        this.setTrainigCenter(trainigCenter);
        this.setDuration(duration);
    }

    public int getCourseID() {
        return courseID.get();
    }

    public void setCourseID(int courseID) {
        this.courseID = new SimpleIntegerProperty(courseID);
    }

    public String getCourceName() {
        return courceName.get();
    }

    public void setCourceName(String courceName) {
        this.courceName = new SimpleStringProperty(courceName);
    }

    public String getTrainigCenter() {
        return trainigCenter.get();
    }

    public void setTrainigCenter(String trainigCenter) {
        this.trainigCenter = new SimpleStringProperty(trainigCenter);
    }

    public String getDuration() {
        return duration.get();
    }

    public void setDuration(String duration) {
        this.duration = new SimpleStringProperty(duration);
    }
}
