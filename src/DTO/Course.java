package DTO;

public class Course {

    private String courseID;
    private String name;
    private String duration;
    private String trainingCenter;


    public Course() {
    }

    public Course(String courseID, String name, String duration, String trainingCenter) {
        this.courseID = courseID;
        this.name = name;
        this.duration = duration;
        this.trainingCenter = trainingCenter;
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

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", trainingCenter='" + trainingCenter + '\'' +
                '}';
    }
}
