package Hibernate.Entity;

import javax.persistence.*;

@Entity
public class Interview {

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="interviewRegNum" )
    @SequenceGenerator(name = "interviewRegNum",
            sequenceName = "interview_seq",
            initialValue = 1,
            allocationSize = 1)
    @Id
    private int interviewID;
    private String fullRegID;
    private String nicNumber;
    private String stdName;
    private String email;
    private String telNumber;
    private String interviewDate;
    private String interviewTime;
    private String interviewPlace;
    private String firstInterviewResult;
    private String secondInterviewResult;
    private String thiredInterviewResult;
    @ManyToOne
    @JoinColumns({@JoinColumn(name="studentregNumber", referencedColumnName = "regNumber"),@JoinColumn(name="studentFullregNumber", referencedColumnName = "fullRegId")})
    //@JoinColumn(name="studentregNumber", referencedColumnName = "regNumber")
    private Student student;

    public Interview() {
    }

    public Interview(String fullRegID, String nicNumber, String stdName, String email, String telNumber, String interviewDate, String interviewTime, String interviewPlace, String firstInterviewResult, String secondInterviewResult, String thiredInterviewResult, Student student) {
        this.fullRegID = fullRegID;
        this.nicNumber = nicNumber;
        this.stdName = stdName;
        this.email = email;
        this.telNumber = telNumber;
        this.interviewDate = interviewDate;
        this.interviewTime = interviewTime;
        this.interviewPlace = interviewPlace;
        this.firstInterviewResult = firstInterviewResult;
        this.secondInterviewResult = secondInterviewResult;
        this.thiredInterviewResult = thiredInterviewResult;
        this.student = student;
    }

    public Interview(int interviewID, String fullRegID, String nicNumber, String stdName, String email, String telNumber, String interviewDate, String interviewTime, String interviewPlace, String firstInterviewResult, String secondInterviewResult, String thiredInterviewResult, Student student) {
        this.interviewID = interviewID;
        this.fullRegID = fullRegID;
        this.nicNumber = nicNumber;
        this.stdName = stdName;
        this.email = email;
        this.telNumber = telNumber;
        this.interviewDate = interviewDate;
        this.interviewTime = interviewTime;
        this.interviewPlace = interviewPlace;
        this.firstInterviewResult = firstInterviewResult;
        this.secondInterviewResult = secondInterviewResult;
        this.thiredInterviewResult = thiredInterviewResult;
        this.student = student;
    }

    public Interview(String fullRegID, String nicNumber, String stdName, String email, String telNumber, String interviewDate, String interviewTime, String interviewPlace, String firstInterviewResult, String secondInterviewResult, String thiredInterviewResult) {
        this.fullRegID = fullRegID;
        this.nicNumber = nicNumber;
        this.stdName = stdName;
        this.email = email;
        this.telNumber = telNumber;
        this.interviewDate = interviewDate;
        this.interviewTime = interviewTime;
        this.interviewPlace = interviewPlace;
        this.firstInterviewResult = firstInterviewResult;
        this.secondInterviewResult = secondInterviewResult;
        this.thiredInterviewResult = thiredInterviewResult;
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

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getInterviewID() {
        return interviewID;
    }

    public void setInterviewID(int interviewID) {
        this.interviewID = interviewID;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getInterviewPlace() {
        return interviewPlace;
    }

    public void setInterviewPlace(String interviewPlace) {
        this.interviewPlace = interviewPlace;
    }

    public String getFullRegID() {
        return fullRegID;
    }

    public void setFullRegID(String fullRegID) {
        this.fullRegID = fullRegID;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public String getFirstInterviewResult() {
        return firstInterviewResult;
    }

    public void setFirstInterviewResult(String firstInterviewResult) {
        this.firstInterviewResult = firstInterviewResult;
    }

    public String getSecondInterviewResult() {
        return secondInterviewResult;
    }

    public void setSecondInterviewResult(String secondInterviewResult) {
        this.secondInterviewResult = secondInterviewResult;
    }

    public String getThiredInterviewResult() {
        return thiredInterviewResult;
    }

    public void setThiredInterviewResult(String thiredInterviewResult) {
        this.thiredInterviewResult = thiredInterviewResult;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "interviewID=" + interviewID +
                ", fullRegID='" + fullRegID + '\'' +
                ", nicNumber='" + nicNumber + '\'' +
                ", stdName='" + stdName + '\'' +
                ", email='" + email + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", interviewDate='" + interviewDate + '\'' +
                ", interviewTime='" + interviewTime + '\'' +
                ", interviewPlace='" + interviewPlace + '\'' +
                ", firstInterviewResult='" + firstInterviewResult + '\'' +
                ", secondInterviewResult='" + secondInterviewResult + '\'' +
                ", thiredInterviewResult='" + thiredInterviewResult + '\'' +
                ", student=" + student +
                '}';
    }
}
