package Hibernate.Entity;

import com.sun.xml.fastinfoset.util.StringIntMap;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="courseRegNum" )
    @SequenceGenerator(name = "courseRegNum",
            sequenceName = "course_seq",
            initialValue = 1,
            allocationSize = 1)
    @Id
    private int courseID;
    private String name;
    private String duration;
    private String trainingCenter;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "student_ID",referencedColumnName = "regNumber"),
            inverseJoinColumns = @JoinColumn(name = "course_ID",referencedColumnName = "courseID")
    )
    private List<Student> students=new ArrayList<>();


    public Course() {
    }

    public Course(int courseID, String name, String duration, String trainingCenter) {
        this.courseID = courseID;
        this.name = name;
        this.duration = duration;
        this.trainingCenter = trainingCenter;
    }

    public Course(int courseID, String name, String duration, String trainingCenter, List<Student> students) {
        this.courseID = courseID;
        this.name = name;
        this.duration = duration;
        this.trainingCenter = trainingCenter;
        this.students = students;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
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
