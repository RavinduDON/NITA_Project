package Hibernate.Entity;

import java.io.Serializable;

public class StudentID implements Serializable {
    private int regNumber;
    private String fullRegId;

    public StudentID() {
    }

    public StudentID(int regNumber, String fullRegId) {
        this.regNumber = regNumber;
        this.fullRegId = fullRegId;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getFullRegId() {
        return fullRegId;
    }

    public void setFullRegId(String fullRegId) {
        this.fullRegId = fullRegId;
    }
}
