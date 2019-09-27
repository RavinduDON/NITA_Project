package Hibernate.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Student {

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="stdRegNum" )
    @SequenceGenerator(name = "stdRegNum",
    sequenceName = "student_seq",
    initialValue = 4740,
    allocationSize = 1)
    @Id
    private int regNumber;
    @NotNull
    private String sname;
    @Temporal(TemporalType.DATE)
    private Date rdate;
    @NotNull
    private String email;
    @NotNull
    private String telNumber;
    private String address;
    private String nicNumber;
    private String tradeOne;
    private String tradeTwo;
    private String tradeThree;
    private String fullRegId;
    private String dob;
    @Enumerated(value = EnumType.STRING)
    private TrainingType trainingType;

//    @ManyToMany(mappedBy = "studnts")
//    private List<Course> courses=new ArrayList<>();

    public Student() {
    }


    public Student(String sname, Date rdate, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree,String fullRegId,String dob, TrainingType trainingType, List<Course> courses) {
        this.sname = sname;
        this.rdate = rdate;
        this.email = email;
        this.telNumber = telNumber;
        this.address = address;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.fullRegId=fullRegId;
        this.dob=dob;
        this.trainingType = trainingType;
//        this.courses = courses;
    }

    public Student(String sname, Date rdate, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, String fullRegId,String dob, TrainingType trainingType) {
        this.sname = sname;
        this.rdate = rdate;
        this.email = email;
        this.telNumber = telNumber;
        this.address = address;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.fullRegId = fullRegId;
        this.dob=dob;
        this.trainingType = trainingType;
    }
    public Student(int regNumber,String sname, Date rdate, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, String fullRegId,String dob, TrainingType trainingType) {
        this.regNumber=regNumber;
        this.sname = sname;
        this.rdate = rdate;
        this.email = email;
        this.telNumber = telNumber;
        this.address = address;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.fullRegId = fullRegId;
        this.dob=dob;
        this.trainingType = trainingType;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFullRegId() {
        return fullRegId;
    }

    public void setFullRegId(String fullRegId) {
        this.fullRegId = fullRegId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getTradeOne() {
        return tradeOne;
    }

    public void setTradeOne(String tradeOne) {
        this.tradeOne = tradeOne;
    }

    public String getTradeTwo() {
        return tradeTwo;
    }

    public void setTradeTwo(String tradeTwo) {
        this.tradeTwo = tradeTwo;
    }

    public String getTradeThree() {
        return tradeThree;
    }

    public void setTradeThree(String tradeThree) {
        this.tradeThree = tradeThree;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }

//    public void addCourse(Course course){
//        course.getStudents().add(this);
//        this.getCourses().add(course);
//    }
    @Override
    public String toString() {
        return "Student{" +
                "regNumber='" + regNumber + '\'' +
                ", sname='" + sname + '\'' +
                ", rdate='" + rdate + '\'' +
                ", email='" + email + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", nicNumber='" + nicNumber + '\'' +
                ", tradeOne='" + tradeOne + '\'' +
                ", tradeTwo='" + tradeTwo + '\'' +
                ", tradeThree='" + tradeThree + '\'' +
                ", trainingType='" + trainingType + '\'' +
//                ", courses=" + courses +
                '}';
    }
}
