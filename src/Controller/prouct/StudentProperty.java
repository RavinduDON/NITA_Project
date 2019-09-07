package Controller.prouct;

import Hibernate.Entity.TrainingType;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentProperty {
    private SimpleIntegerProperty regNumber;
    private SimpleStringProperty sname;
    private SimpleStringProperty rdate;
    private SimpleStringProperty email;
    private SimpleStringProperty telNumber;
    private SimpleStringProperty address;
    private SimpleStringProperty nicNumber;
    private SimpleStringProperty tradeOne;
    private SimpleStringProperty tradeTwo;
    private SimpleStringProperty tradeThree;
    private SimpleStringProperty fullRegId;
    private SimpleStringProperty trainingType;

    public StudentProperty(int regNumber, String sname, String rdate, String email, String telNumber, String address, String nicNumber, String tradeOne, String tradeTwo, String tradeThree, String fullRegId, String trainingType) {
        this.regNumber = new SimpleIntegerProperty(regNumber);
        this.sname =new SimpleStringProperty(sname) ;
        this.rdate = new SimpleStringProperty(rdate);
        this.email = new SimpleStringProperty(email);
        this.telNumber = new SimpleStringProperty(telNumber);
        this.address = new SimpleStringProperty(address);
        this.nicNumber = new SimpleStringProperty(nicNumber);
        this.tradeOne = new SimpleStringProperty(tradeOne);
        this.tradeTwo = new SimpleStringProperty(tradeTwo);
        this.tradeThree = new SimpleStringProperty(tradeThree);
        this.fullRegId = new SimpleStringProperty(fullRegId);
        this.trainingType = new SimpleStringProperty(trainingType);
    }

    public int getRegNumber() {
        return regNumber.get();
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = new SimpleIntegerProperty(regNumber);
    }

    public String getSname() {
        return sname.get();
    }

    public void setSname(String sname) {
        this.sname = new SimpleStringProperty(sname);
    }

    public String getRdate() {
        return rdate.get();
    }

    public void setRdate(String rdate) {
        this.rdate = new SimpleStringProperty(rdate);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email = new SimpleStringProperty(email);
    }

    public String getTelNumber() {
        return telNumber.get();
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = new SimpleStringProperty(telNumber);
    }

    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address = new SimpleStringProperty(address);
    }

    public String getNicNumber() {
        return nicNumber.get();
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = new SimpleStringProperty(nicNumber);
    }

    public String getTradeOne() {
        return tradeOne.get();
    }

    public void setTradeOne(String tradeOne) {
        this.tradeOne = new SimpleStringProperty(tradeOne);
    }

    public String getTradeTwo() {
        return tradeTwo.get();
    }

    public void setTradeTwo(String tradeTwo) {
        this.tradeTwo = new SimpleStringProperty(tradeTwo);
    }

    public String getTradeThree() {
        return tradeThree.get();
    }

    public void setTradeThree(String tradeThree) {
        this.tradeThree = new SimpleStringProperty(tradeThree);
    }

    public String getFullRegId() {
        return fullRegId.get();
    }

    public void setFullRegId(String fullRegId) {
        this.fullRegId =new SimpleStringProperty(fullRegId);
    }

    public String getTrainingType() {
        return trainingType.get();
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = new SimpleStringProperty(trainingType);
    }
}
