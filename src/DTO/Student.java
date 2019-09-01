package DTO;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String regNumber;
    private String name;
    private String date;
    private String email;
    private String telNumber;
    private String nicNumber;
    private String tradeOne;
    private String tradeTwo;
    private String tradeThree;
    private String trainingType;

    private List<Course> courses=new ArrayList<>();

    public Student() {
    }

    public Student(String regNumber, String name, String date, String email, String telNumber, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, String trainingType) {
        this.regNumber = regNumber;
        this.name = name;
        this.date = date;
        this.email = email;
        this.telNumber = telNumber;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.trainingType = trainingType;
    }

    public Student(String regNumber, String name, String date, String email, String telNumber, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, String trainingType, List<Course> courses) {
        this.regNumber = regNumber;
        this.name = name;
        this.date = date;
        this.email = email;
        this.telNumber = telNumber;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.trainingType = trainingType;
        this.courses = courses;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNumber='" + regNumber + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", nicNumber='" + nicNumber + '\'' +
                ", tradeOne='" + tradeOne + '\'' +
                ", tradeTwo='" + tradeTwo + '\'' +
                ", tradeThree='" + tradeThree + '\'' +
                ", trainingType='" + trainingType + '\'' +
                ", courses=" + courses +
                '}';
    }
}
