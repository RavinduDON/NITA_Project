package DTO;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseID;
    private String name;
    private String duration;
    private String trainingCenter;

    private List<Student> students=new ArrayList<>();


    public Course() {
    }

    public Course(String courseID, String name, String duration, String trainingCenter) {
        this.courseID = courseID;
        this.name = name;
        this.duration = duration;
        this.trainingCenter = trainingCenter;
    }

    public Course(String courseID, String name, String duration, String trainingCenter, List<Student> students) {
        this.courseID = courseID;
        this.name = name;
        this.duration = duration;
        this.trainingCenter = trainingCenter;
        this.students = students;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTrainingCenter() {
        return trainingCenter;
    }

    public void setTrainingCenter(String trainingCenter) {
        this.trainingCenter = trainingCenter;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", trainingCenter='" + trainingCenter + '\'' +
                ", students=" + students +
                '}';
    }
}
