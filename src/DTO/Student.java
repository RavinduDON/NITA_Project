package DTO;

import Hibernate.Entity.TrainingType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

    private int regNumber;
    private String name;
    private Date date;
    private String email;
    private String telNumber;
    private String address;
    private String nicNumber;
    private String tradeOne;
    private String tradeTwo;
    private String tradeThree;
    private String fullRegId;
    private TrainingType trainingType;

    private List<Course> courses=new ArrayList<>();

    public Student() {
    }

    public Student(int regNumber, String name, Date date, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, TrainingType trainingType, List<Course> courses) {
        this.regNumber = regNumber;
        this.name = name;
        this.date = date;
        this.email = email;
        this.telNumber = telNumber;
        this.address = address;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.trainingType = trainingType;
        this.courses = courses;
    }

    public Student(int regNumber, String name, Date date, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, TrainingType trainingType) {
        this.regNumber = regNumber;
        this.name = name;
        this.date = date;
        this.email = email;
        this.telNumber = telNumber;
        this.address = address;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.trainingType = trainingType;
    }

    public Student(int regNumber, String name, Date date, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, String fullRegId, TrainingType trainingType) {
        this.regNumber = regNumber;
        this.name = name;
        this.date = date;
        this.email = email;
        this.telNumber = telNumber;
        this.address = address;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.fullRegId = fullRegId;
        this.trainingType = trainingType;
    }

    public Student(String name, Date date, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, String fullRegId, TrainingType trainingType) {
        this.name = name;
        this.date = date;
        this.email = email;
        this.telNumber = telNumber;
        this.address = address;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.fullRegId = fullRegId;
        this.trainingType = trainingType;
    }

    public Student(String name, Date date, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, String fullRegId, TrainingType trainingType, List<Course> courses) {
        this.name = name;
        this.date = date;
        this.email = email;
        this.telNumber = telNumber;
        this.address = address;
        this.nicNumber = nicNumber;
        this.tradeOne = tradeOne;
        this.tradeTwo = tradeTwo;
        this.tradeThree = tradeThree;
        this.fullRegId = fullRegId;
        this.trainingType = trainingType;
        this.courses = courses;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
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
