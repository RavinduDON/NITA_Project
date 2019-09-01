package Hibernate.Entity;

public class Course {

    private String courseID;
    private String name;
    private String duration;

    public Course() {
    }

    public Course(String courseID, String name, String duration) {
        this.courseID = courseID;
        this.name = name;
        this.duration = duration;
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

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
